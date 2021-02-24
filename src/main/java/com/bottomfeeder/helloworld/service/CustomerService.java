package com.bottomfeeder.helloworld.service;

import com.bottomfeeder.helloworld.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Optional<Customer> find(Integer customerNumber);
    List<Customer> findAll();
}
