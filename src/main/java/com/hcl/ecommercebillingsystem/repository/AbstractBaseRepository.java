package com.hcl.ecommercebillingsystem.repository;

import com.hcl.ecommercebillingsystem.entity.BaseObject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface AbstractBaseRepository<T extends BaseObject, ID extends Serializable>
        extends JpaRepository<T, ID> {

}
