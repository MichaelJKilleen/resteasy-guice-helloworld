package com.bottomfeeder.helloworld.persist.dao;

import com.bottomfeeder.helloworld.model.Customer;
import com.bottomfeeder.helloworld.persist.CustomerPersist;
import com.bottomfeeder.helloworld.persist.DataSourceFactory;
import com.bottomfeeder.helloworld.persist.mapper.CustomerRowMapper;
import com.google.inject.Inject;
import org.jdbi.v3.core.Jdbi;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

public class CustomerDao implements CustomerPersist {

    // Move this to a provider.
    private final DataSourceFactory dataSourceFactory;

    @Inject
    public CustomerDao(DataSourceFactory dataSourceFactory) {
        this.dataSourceFactory = dataSourceFactory;
    }

    @Override
    public Optional<Customer> find(Integer customerNumber) {
        DataSource dataSource = this.dataSourceFactory.getDataSource(DataSourceFactory.DBTYPES.MYSQL);
        Jdbi jdbi = Jdbi.create(dataSource);
        Optional<Customer> customer = jdbi.withHandle(handle ->
                handle.createQuery("select * from CUSTOMERS WHERE customerNumber = :customerNumber")
                        .bind("customerNumber", customerNumber)
                        .map(new CustomerRowMapper()).findOne());
        return customer;
    }

    @Override
    public List<Customer> findAll() {
        DataSource dataSource = this.dataSourceFactory.getDataSource(DataSourceFactory.DBTYPES.MYSQL);
        Jdbi jdbi = Jdbi.create(dataSource);
        List<Customer> customers = jdbi.withHandle(handle ->
                handle.createQuery("select * from CUSTOMERS")
                        .map(new CustomerRowMapper())
                        .list());
        return customers;
    }
}