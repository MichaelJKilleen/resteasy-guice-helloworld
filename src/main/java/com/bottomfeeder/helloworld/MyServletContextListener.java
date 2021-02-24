/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bottomfeeder.helloworld;

import com.bottomfeeder.helloworld.resource.CustomerResource;
import com.google.inject.Module;
import java.util.List;
import javax.servlet.ServletContext;
import org.jboss.resteasy.plugins.guice.GuiceResteasyBootstrapServletContextListener;

/**
 *
 * @author dherik
 */
public class MyServletContextListener extends GuiceResteasyBootstrapServletContextListener  {

    @Override
    protected List<? extends Module> getModules(ServletContext context) {
        List modules1 = super.getModules(context);
        modules1.add(new HelloModule());
        modules1.add(new ClassicModelsModule());
        System.out.println(modules1.toString());
        return modules1;
    }
    
}
