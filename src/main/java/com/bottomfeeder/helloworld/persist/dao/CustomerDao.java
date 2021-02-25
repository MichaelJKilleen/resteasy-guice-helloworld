package com.bottomfeeder.helloworld.persist.dao;

import com.bottomfeeder.helloworld.model.Customer;
import com.bottomfeeder.helloworld.persist.CustomerPersist;
import com.bottomfeeder.helloworld.persist.mapper.CustomerRowMapper;
import org.jdbi.v3.core.Jdbi;

import java.util.List;
import java.util.Optional;

public class CustomerDao implements CustomerPersist {

    // Move this to a provider.
    private Jdbi jdbi;

    public CustomerDao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        this.jdbi = Jdbi.create("jdbc:mysql://localhost:3306/classicmodels","myuser","P@ssw0rd!");
    }

    @Override
    public Optional<Customer> find(Integer customerNumber) {
        Optional<Customer> customer = jdbi.withHandle(handle ->
                handle.createQuery("select * from CUSTOMERS WHERE customerNumber = :customerNumber")
                        .bind("customerNumber",customerNumber)
                        .map(new CustomerRowMapper()).findOne());

        return customer;
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = jdbi.withHandle(handle ->
                handle.createQuery("select * from CUSTOMERS")
                        .map(new CustomerRowMapper())
                        .list());
        return customers;
    }
}
