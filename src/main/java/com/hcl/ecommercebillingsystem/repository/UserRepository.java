package com.hcl.ecommercebillingsystem.repository;

import com.hcl.ecommercebillingsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmailId(String emailId);
    User findByMobileNo(String mobileNo);
}
