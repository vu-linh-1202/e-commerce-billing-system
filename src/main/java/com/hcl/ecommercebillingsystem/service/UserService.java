package com.hcl.ecommercebillingsystem.service;

import com.hcl.ecommercebillingsystem.entity.User;
import com.hcl.ecommercebillingsystem.messages.ResponseMessage;
import com.hcl.ecommercebillingsystem.repository.UserRepository;
import com.hcl.ecommercebillingsystem.service.base.BaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
@Slf4j
public class UserService extends BaseService {

    @Autowired
    private UserRepository userRepository;


    /**
     * Find resource by id
     * @param id
     * @return responseMessage
     * @throws Exception
     */
    @Override
    public ResponseMessage findResourceById(String id) throws Exception {
        User user = userRepository.findById(Long.parseLong(id)).orElse(null);
        ResponseMessage responseMessage = ResponseMessage.withResponseData(user, null, null);
        log.info("Response data successfully!", responseMessage);
        return responseMessage;
    }

    @Override
    public ResponseMessage findAll() throws Exception {
        return null;
    }
}
