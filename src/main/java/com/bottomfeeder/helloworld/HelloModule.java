package com.bottomfeeder.helloworld;

import com.bottomfeeder.helloworld.resource.HelloResource;
import com.bottomfeeder.helloworld.service.GreeterService;
import com.bottomfeeder.helloworld.service.IGreeterService;
import com.google.inject.Binder;
import com.google.inject.Module;

public class HelloModule implements Module
{
   public void configure(final Binder binder)
   {
      binder.bind(HelloResource.class);
      binder.bind(IGreeterService.class).to(GreeterService.class);
   }
}
