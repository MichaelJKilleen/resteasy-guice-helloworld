package com.bottomfeeder.helloworld.persist.mapper;

import com.bottomfeeder.helloworld.model.Customer;
import com.bottomfeeder.helloworld.model.CustomerBuilder;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerRowMapper implements RowMapper<Customer> {

    @Override
    public Customer map(ResultSet resultSet, StatementContext ctx) throws SQLException {
        CustomerBuilder customerBuilder = new CustomerBuilder();

        customerBuilder.setCustomerNumber(resultSet.getInt("customerNumber"))
                .setContactFirstName(resultSet.getString("contactFirstName"))
                .setContactLastName(resultSet.getString("contactLastName"))
                .setAddressLine1(resultSet.getString("addressLine1"))
                .setAddressLine2(resultSet.getString("addressLine2"))
                .setCity(resultSet.getString("city"))
                .setState(resultSet.getString("state"))
                .setPostCode(resultSet.getString("postalCode"))
                .setPhone(resultSet.getString("phone"))
                .setCustomerName(resultSet.getString("customerName"))
                .setCountry(resultSet.getString("country"))
                .setCreditLimit(resultSet.getBigDecimal("creditLimit"));

        return customerBuilder.createCustomer();
    }
}
