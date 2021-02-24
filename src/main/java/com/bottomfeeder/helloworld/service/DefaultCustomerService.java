package com.bottomfeeder.helloworld.service;

import com.bottomfeeder.helloworld.model.Customer;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class DefaultCustomerService implements CustomerService {
    @Override
    public Optional<Customer> find(Integer customerNumber) {
        return Optional.empty();
    }

    @Override
    public List<Customer> findAll() {
        return Collections.emptyList();
    }
}
