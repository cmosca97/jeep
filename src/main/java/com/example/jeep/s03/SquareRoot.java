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

        try {
            double cur = Double.parseDouble(number);

            double result = Math.sqrt(cur);
            if (Double.isNaN(result)) {
                request.setAttribute("message", "Please, insert a positive number!");
            } else {
                request.setAttribute("result", result);
            }

        } catch (Exception ex) {
            log.error("Invalid input", ex);
            request.setAttribute("message", "Please, insert a number!");
        }

        request.getRequestDispatcher("squareRoot.jsp").forward(request, response);
    }
}
