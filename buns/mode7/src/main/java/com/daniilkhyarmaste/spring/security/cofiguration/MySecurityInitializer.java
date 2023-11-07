package com.daniilkhyarmaste.spring.security.cofiguration;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class MySecurityInitializer extends AbstractSecurityWebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

    }
}
