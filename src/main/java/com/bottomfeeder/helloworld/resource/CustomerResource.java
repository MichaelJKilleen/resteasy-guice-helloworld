package com.bottomfeeder.helloworld.resource;

import com.bottomfeeder.helloworld.model.Customer;
import com.bottomfeeder.helloworld.model.CustomerBuilder;
import com.bottomfeeder.helloworld.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("customer")
public class CustomerResource {

    private static final Logger logger = LoggerFactory.getLogger(CustomerResource.class);

    private final CustomerService customerService;

    @Inject
    public CustomerResource(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GET
    @Path("{customerID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer getCustomer(@PathParam("customerID") Integer customerID) {
        return customerService.find(customerID).orElse((new CustomerBuilder()).createCustomer());
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomers() {
        return Response.ok(customerService.findAll()).build();
    }
}