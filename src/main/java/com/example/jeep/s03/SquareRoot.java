package com.example.jeep.s03;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/s03/squareRoot")

public class SquareRoot extends HttpServlet {
    private static final Logger log = LogManager.getLogger(SquareRoot.class);
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String number = request.getParameter("number");
        log.trace("Number is {" + number + "}");
        
        double cur = Double.parseDouble(number);
        if (number == null) {
            System.out.println("Please, insert a positive number!");
        }
        double result = Math.sqrt(cur);
        
        request.setAttribute("result", result);
        request.getRequestDispatcher("squareRoot.jsp").forward(request, response);
    }
}
