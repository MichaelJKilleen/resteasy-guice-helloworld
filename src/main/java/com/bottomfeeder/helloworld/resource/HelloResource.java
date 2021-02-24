package com.bottomfeeder.helloworld.resource;

import com.bottomfeeder.helloworld.service.IGreeterService;
import com.google.inject.Inject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("hello")
public class HelloResource
{
   private final IGreeterService greeter;

   @Inject
   public HelloResource(final IGreeterService greeter)
   {
      this.greeter = greeter;
   }

   @GET
   @Path("{name}")
   public String hello(@PathParam("name") final String name) {
      return greeter.greet(name);
   }
}
