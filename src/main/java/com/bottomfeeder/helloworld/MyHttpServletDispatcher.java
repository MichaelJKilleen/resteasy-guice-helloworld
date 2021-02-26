package com.bottomfeeder.helloworld;

//import com.sun.org.slf4j.internal.Logger;
//import com.sun.org.slf4j.internal.LoggerFactory;

import org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;


//@WebServlet(urlPatterns = {"/rest/*"})
public class MyHttpServletDispatcher extends HttpServletDispatcher {
    private static final Logger logger = LoggerFactory.getLogger(MyHttpServletDispatcher.class);

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        super.init(servletConfig);
        logger.info("In the init");

    }
}
