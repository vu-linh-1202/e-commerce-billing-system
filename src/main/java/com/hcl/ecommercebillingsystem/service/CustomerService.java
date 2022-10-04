package com.hcl.ecommercebillingsystem.service;

import com.hcl.ecommercebillingsystem.dto.CustomerInfo;
import com.hcl.ecommercebillingsystem.entity.Customer;
import com.hcl.ecommercebillingsystem.exception.ResourceNotFoundException;
import com.hcl.ecommercebillingsystem.mapper.CustomerMapper;
import com.hcl.ecommercebillingsystem.messages.ResponseMessage;
import com.hcl.ecommercebillingsystem.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class CustomerService extends UserService {

    private final CustomerRepository repository;

    @Autowired
    CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    /**
     * This function used to find resource by id
     *
     * @param id
     * @return responseMessage
     * @throws Exception
     */
    @Override
    @Transactional
    public ResponseMessage findResourceById(String id) throws Exception {
        Customer customer = null;
        if (id.contains("CUS")) {
            customer = repository.findByCustomerCode(id);
        } else {
            customer = repository.findById(Long.parseLong(id)).orElse(null);
        }
        ResponseMessage responseMessage = new ResponseMessage();
        if (customer != null) {
            CustomerInfo customerDTO = CustomerMapper.INSTANCE.customerToCustomerInfo(customer);
            responseMessage.setResponseClassType(customerDTO);
            log.info("Find resource successfully: {}", customerDTO);
        } else {
            log.error("Find resource fail!");
            throw new ResourceNotFoundException("Customer not found");
        }
        return responseMessage;
    }
}
