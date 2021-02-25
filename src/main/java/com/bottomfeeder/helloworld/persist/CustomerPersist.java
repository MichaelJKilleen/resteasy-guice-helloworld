package com.bottomfeeder.helloworld.persist;

import com.bottomfeeder.helloworld.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerPersist {
    Optional<Customer> find(Integer customerNumber);

    List<Customer> findAll();

}
