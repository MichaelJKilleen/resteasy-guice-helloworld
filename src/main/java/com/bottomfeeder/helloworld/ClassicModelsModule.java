package com.bottomfeeder.helloworld;

import com.bottomfeeder.helloworld.resource.CustomerResource;
import com.bottomfeeder.helloworld.service.CustomerService;
import com.bottomfeeder.helloworld.service.DefaultCustomerService;
import com.google.inject.Binder;
import com.google.inject.Module;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassicModelsModule implements Module {
    private static final Logger logger = LoggerFactory.getLogger(ClassicModelsModule.class);
    @Override
    public void configure(Binder binder) {
        binder.bind(CustomerResource.class);
        binder.bind(CustomerService.class).to(DefaultCustomerService.class);
        logger.info("Added CustomerResource and CustomerService");

    }
}
