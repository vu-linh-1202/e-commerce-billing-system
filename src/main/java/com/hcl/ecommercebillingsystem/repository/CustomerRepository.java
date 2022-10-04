package com.hcl.ecommercebillingsystem.repository;

import com.hcl.ecommercebillingsystem.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByCustomerCode(String customerCode);

    @Query("select c from Customer c where c.user.id in (Select u.id from User u where u.mobileNo = :mobileNo)")
    Customer findByCustomerMobileNo(@Param("mobileNo") String mobileNo);
}
