package com.bottomfeeder.helloworld.service;

import com.bottomfeeder.helloworld.model.Customer;
import com.bottomfeeder.helloworld.model.CustomerBuilder;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class DefaultCustomerService implements CustomerService {
    @Override
    public Optional<Customer> find(Integer customerNumber) {
        CustomerBuilder customerBuilder = new CustomerBuilder();
        customerBuilder.setCustomerName("Bongo");
        return Optional.of(customerBuilder.createCustomer());
    }

    @Override
    public List<Customer> findAll() {
        return Collections.emptyList();
    }
}
