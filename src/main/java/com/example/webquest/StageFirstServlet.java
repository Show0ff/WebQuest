package com.example.webquest;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "stageFirstServlet", value = "/stageFirst")
public class StageFirstServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        String name = request.getParameter("name");
        request.setAttribute("name", name);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/stages/stage1.jsp");
        requestDispatcher.forward(request,response);

    }

    public void destroy() {
    }
}