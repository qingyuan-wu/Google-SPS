package com.google.sps.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String name = request.getParameter("name");
    String email = request.getParameter("email");

    // Print the value so you can see it in the server logs.
    System.out.println("You submitted: " + name);
    System.out.println("You submitted: " + email);

    // Write the value to the response so the user can see it.
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    
    response.getWriter().println("Your name: " + name + ". Your email: " + email);
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Your submission</title>");
    out.println("</head>");
    out.println("<body bgcolor=\"white\">");
    out.println("<div>");
    out.println("Your name: " + name + ". Your email: " + email);
    out.println("</div>");
    out.println("<a href=\"/\">Back</a>");
    out.println("</body>");
    out.println("</html>");
  }
}