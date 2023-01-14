package com.example.webquest;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "StageThreeServlet", value = "/stageThree")
public class StageThreeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String answer = req.getParameter("answer");
        if (answer.equals("decline")) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/losesPages/SecondLose.jsp");
            requestDispatcher.forward(req,resp);
        } else {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/stages/stage3.jsp");
            requestDispatcher.forward(req,resp);
        }
    }

}
