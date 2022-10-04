package com.hcl.ecommercebillingsystem.service.base;

import com.hcl.ecommercebillingsystem.messages.ResponseMessage;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

abstract public class BaseService {

    public abstract ResponseMessage findResourceById(String id) throws Exception;
    public abstract ResponseMessage findAll() throws Exception;

    /**
     *
     * @return userDetails
     */
    public UserDetails getContext() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        return userDetails;
    }

}
