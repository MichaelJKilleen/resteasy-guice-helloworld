/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bottomfeeder.helloworld;

import com.bottomfeeder.helloworld.persist.PersistModule;
import com.google.inject.Module;
import org.jboss.resteasy.plugins.guice.GuiceResteasyBootstrapServletContextListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContext;
import java.util.List;

/**
 * @author mkilleen
 */
//@WebListener
public class MyServletContextListener extends GuiceResteasyBootstrapServletContextListener  {
    private static final Logger logger = LoggerFactory.getLogger(MyServletContextListener.class);
    @Override
    protected List<? extends Module> getModules(ServletContext context) {
        logger.info("Running getModules");
        //logger.
        List modules = super.getModules(context);
        modules.add(new HelloModule());
        modules.add(new ClassicModelsModule());
        modules.add(new PersistModule());
        logger.info(modules.toString());
        return modules;
    }

}
