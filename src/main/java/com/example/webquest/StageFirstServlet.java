package com.example.webquest;

import java.io.*;

import com.example.webquest.statistic.Statistic;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "stageFirstServlet", value = "/stageFirst")
public class StageFirstServlet extends HttpServlet {

   private final Statistic statistic = new Statistic();


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        statistic.getFullStatistic(request);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/stages/stage1.jsp");
        requestDispatcher.forward(request,response);


    }

    public void destroy() {
    }
}