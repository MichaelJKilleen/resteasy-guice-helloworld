package com.bottomfeeder.helloworld.resource;

import com.bottomfeeder.helloworld.model.Customer;
import com.bottomfeeder.helloworld.service.CustomerService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

@Path("customer")
public class CustomerResource {
    private final CustomerService customerService;

    @Inject
    public CustomerResource(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GET
    @Path("{customerID}")
    public String getCustomer(@PathParam("customerID") Integer customerID) {
        //return customerService.find(customerID).get();
        return "Test 123";
    }

    @GET
    public List<Customer> getCustomers() {
        return customerService.findAll();
    }
}