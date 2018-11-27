package com.mvc.controller;

import java.lang.String;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class processTicketServlet extends HttpServlet {
    public processTicketServlet() {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        RegisteredUser user = new RegisteredUser();
        int SeniorTicketNo = Integer.parseInt(request.getParameter("seniorTicketNo"));
        int AdultTicketNo = Integer.parseInt(request.getParameter("adultTicketNo"));
        int MinorTicketNo = Integer.parseInt(request.getParameter("minorTicketNo"));


    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {


    }
}
