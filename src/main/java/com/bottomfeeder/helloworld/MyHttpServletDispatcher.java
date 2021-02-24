package com.bottomfeeder.helloworld;

import org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

public class MyHttpServletDispatcher extends HttpServletDispatcher {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        super.init(servletConfig);
    }
}
