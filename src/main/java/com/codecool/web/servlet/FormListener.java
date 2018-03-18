package com.codecool.web.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

// Extend HttpServlet class
@WebServlet("/formSubmit")
public class FormListener extends HttpServlet {

    private String message;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        message=req.getParameter("e-mail");
        resp.setContentType("text/html");
        String respMsg = "<h1> You have subscribed with this e-mail: "+message;
        PrintWriter pw = resp.getWriter();
        pw.println(respMsg);
    }


}
