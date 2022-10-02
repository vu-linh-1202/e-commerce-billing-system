package com.hcl.ecommercebillingsystem.service;


import com.hcl.ecommercebillingsystem.entity.BaseObject;
import com.hcl.ecommercebillingsystem.repository.AbstractBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;


/**
 * This class works for basic CRUD operation for all entity object
 * @param <T>
 * @param <ID>
 */
@Component
public class BillingBaseService<T extends BaseObject, ID extends Serializable> {

    @Autowired
    private AbstractBaseRepository<T, ID> repository;

    public BaseObject save(T entity) {
        return (BaseObject) repository.save(entity);
    }

    public List<T> findAll() {
        return repository.findAll();
    }

    public Optional<T> findById(ID id) {
        return repository.findById(id);
    }

    public void deleteById(ID id) {
        repository.deleteById(id);
    }

    public void delete(T type) {
        repository.delete(type);
    }
}
