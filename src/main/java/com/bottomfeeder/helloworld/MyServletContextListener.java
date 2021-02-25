/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bottomfeeder.helloworld;

import com.google.inject.Module;
import org.jboss.resteasy.plugins.guice.GuiceResteasyBootstrapServletContextListener;

import javax.servlet.ServletContext;
import java.util.List;

/**
 * @author mkilleen
 */
public class MyServletContextListener extends GuiceResteasyBootstrapServletContextListener  {

    @Override
    protected List<? extends Module> getModules(ServletContext context) {
        List modules = super.getModules(context);
        modules.add(new HelloModule());
        modules.add(new ClassicModelsModule());
        System.out.println(modules.toString());
        return modules;
    }

}
