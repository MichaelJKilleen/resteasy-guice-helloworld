package com.bottomfeeder.helloworld;

import com.bottomfeeder.helloworld.resource.CustomerResource;
import com.bottomfeeder.helloworld.service.CustomerService;
import com.bottomfeeder.helloworld.service.DefaultCustomerService;
import com.google.inject.Binder;
import com.google.inject.Module;

public class ClassicModelsModule implements Module {
    @Override
    public void configure(Binder binder) {
        binder.bind(CustomerResource.class);
        binder.bind(CustomerService.class).to(DefaultCustomerService.class);
    }
}
