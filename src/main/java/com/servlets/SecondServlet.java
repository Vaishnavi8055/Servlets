package com.servlets;/*
 * Created by Vaishnavi Chaurasia
 * 26-Sep-21
 * 10:43 PM
 * JavaTest
 */

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class SecondServlet extends GenericServlet {

    // It has all 4 methods with body (Lifecycle) but 1 method do not have body (service())
    // only service method needs to be override in generic servlet


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("This is output from Generic Servlet");

        // for output in console
        servletResponse.setContentType("text/html");
        PrintWriter out  = servletResponse.getWriter();
        out.println("<h1>This is my output from my Second servlet method using Generic .........</h1>");
        out.println("<h1>Date -" + new Date().toString()+ "</h1>");
    }
}
