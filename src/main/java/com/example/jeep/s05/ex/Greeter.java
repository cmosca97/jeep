package com.example.jeep.s05.ex;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/s05/ex/greeter")

public class Greeter extends HttpServlet {
    private static final Logger log = LogManager.getLogger(Greeter.class);
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        log.trace("Name is {" + name + "}");
        String mood = request.getParameter("mood");
        log.trace(name + " is feeling {" + mood + "}");
        
        if (name == null || name.isEmpty()) {
            request.setAttribute("name", "stranger");
        }
        
//        request.setAttribute("name", name);
//        request.setAttribute("mood", mood);
        request.getRequestDispatcher("mood.jsp").forward(request, response);
    }

}
