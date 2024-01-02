package com.example.servletdemo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@WebServlet("/journal")
public class JournalServlet extends HttpServlet {

  List<String> entries = new ArrayList<>();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.getRequestDispatcher("/index.jsp").include(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    String title = req.getParameter("title");
    String content = req.getParameter("content");

    String output = "Title: " + title + "<br>Content: " + content + "<br>";

    entries.add(output);

    req.getRequestDispatcher("/index.jsp").include(req, resp);

    PrintWriter out = resp.getWriter();
    for(String entry : entries) {
      out.println(entry);
    }

  }
}
