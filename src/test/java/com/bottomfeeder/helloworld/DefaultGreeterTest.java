package com.bottomfeeder.helloworld;

import com.bottomfeeder.helloworld.service.GreeterService;
import com.bottomfeeder.helloworld.service.IGreeterService;
import org.junit.Assert;
import org.junit.Test;

public class DefaultGreeterTest
{
   @Test
   public void testGreet()
   {
      final IGreeterService greeter = new GreeterService();
      Assert.assertEquals("Hello foo", greeter.greet("foo"));
      Assert.assertEquals("Hello bar", greeter.greet("bar"));
   }
}
