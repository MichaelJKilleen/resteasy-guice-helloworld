package com.bottomfeeder.helloworld.service;

public class GreeterService implements IGreeterService
{
   public String greet(final String name)
   {
      return "Hello " + name;
   }
}
