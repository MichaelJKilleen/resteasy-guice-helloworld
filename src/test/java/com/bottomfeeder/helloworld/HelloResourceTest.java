package com.bottomfeeder.helloworld;

import com.bottomfeeder.helloworld.resource.HelloResource;
import com.bottomfeeder.helloworld.service.IGreeterService;
import org.junit.Assert;
import org.junit.Test;

public class HelloResourceTest
{
   @Test
   public void testHello() {
      final HelloResource helloResource = new HelloResource(new IGreeterService()
      {
         public String greet(final String name)
         {
            return "greeting";
         }
      });
      Assert.assertEquals("greeting", helloResource.hello("foo"));
   }
}
