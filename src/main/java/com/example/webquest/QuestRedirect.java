package com.example.webquest;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class QuestRedirect {

    public void redirectOperation(HttpServletRequest request, HttpServletResponse response, String losePath, String rightPath) throws ServletException, IOException {
        String answer = request.getParameter("answer");

        if (answer.equals("decline")) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/losesPages/FirstLose.jsp");
            requestDispatcher.forward(request,response);


        } else if (answer.equals("accept")) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/stages/stage2.jsp");
            requestDispatcher.forward(request,response);
        } else {
            request.getRequestDispatcher("WEB-INF/errorCases/errorCase.jsp");
        }
    }
}
