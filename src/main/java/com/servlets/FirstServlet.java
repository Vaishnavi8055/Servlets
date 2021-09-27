package com.servlets;/*
 * Created by Vaishnavi Chaurasia
 * 26-Sep-21
 * 9:30 PM
 * JavaTest
 */

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class FirstServlet implements Servlet {

    // Life Cycle Methods of Servlets - these methods will run automatically by the server

    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("creating  object -...");
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Service -...");

        // set the content type of response
        servletResponse.setContentType("text/html");
        PrintWriter out  = servletResponse.getWriter();
        out.println("<h1>This is my output from my servlet method .........</h1>");
        out.println("<h1>Date -" + new Date().toString()+ "</h1>");

    }

    public void destroy() {
        System.out.println("Destroying  object -...");
    }

    // Non Cycle methods -  these methods will only run when called but not automatically by the server

    public ServletConfig getServletConfig() {

        return null;
    }

    public String getServletInfo() {
        return null;
    }

}
