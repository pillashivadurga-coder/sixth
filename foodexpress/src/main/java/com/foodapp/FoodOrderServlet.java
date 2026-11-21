package com.foodapp;
 
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
 
public class FoodOrderServlet extends HttpServlet {
 
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
 
        response.setContentType("text/html");
 
        PrintWriter out = response.getWriter();
 
        out.println("<h1>Food Order Successful!</h1>");
        out.println("<h2>Welcome to FoodExpress</h2>");
    }
}
 
