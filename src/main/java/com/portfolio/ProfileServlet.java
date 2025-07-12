package com.portfolio;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        request.setAttribute("name", "John Escuyos");
        request.setAttribute("title", "Full Stack Developer");
        request.setAttribute("about", "Experienced developer skilled in Java, Spring, HTML/CSS, and JavaScript.");
        request.getRequestDispatcher("profile.jsp").forward(request, response);
    }
}