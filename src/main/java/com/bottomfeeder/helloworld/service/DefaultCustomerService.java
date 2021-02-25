package com.bottomfeeder.helloworld.service;

import com.bottomfeeder.helloworld.model.Customer;
import com.bottomfeeder.helloworld.model.CustomerBuilder;
import com.bottomfeeder.helloworld.persist.CustomerPersist;

import javax.inject.Inject;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class DefaultCustomerService implements CustomerService {

    private CustomerPersist customerPersist;

    @Inject
    public DefaultCustomerService(CustomerPersist customerPersist) {
        this.customerPersist = customerPersist;
    }

    @Override
    public Optional<Customer> find(Integer customerNumber) {
        return customerPersist.find(customerNumber);
    }

    @Override
    public List<Customer> findAll() {

        return customerPersist.findAll();
    }
}
