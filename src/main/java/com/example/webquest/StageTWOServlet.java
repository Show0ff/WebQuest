package com.example.webquest;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "StageOneServlet", value = "/stageTwo")
public class StageTWOServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String answer = req.getParameter("answer");

        if (answer.equals("decline")) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/losesPages/FirstLose.jsp");
            requestDispatcher.forward(req,resp);


        } else if (answer.equals("accept")) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/stages/stage2.jsp");
            requestDispatcher.forward(req,resp);
        } else {
            req.getRequestDispatcher("WEB-INF/errorCases/errorCase.jsp");
        }

    }



}
