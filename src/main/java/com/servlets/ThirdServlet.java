package com.servlets;/*
 * Created by Vaishnavi Chaurasia
 * 27-Sep-21
 * 12:40 AM
 * JavaTest
 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

// it is protocol specific - doPost , doGet
public class ThirdServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);

        System.out.println("this is get method -...");

        // set the content type of response
        resp.setContentType("text/html");
        PrintWriter out  = resp.getWriter();
        out.println("<h1>This is my output from my http servlet method .........</h1>");
        out.println("<h1>Date -" + new Date().toString()+ "</h1>");

    }
}
