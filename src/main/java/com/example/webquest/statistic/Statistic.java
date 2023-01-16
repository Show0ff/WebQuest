package com.example.webquest.statistic;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

public class Statistic {


    public void getFullStatistic(HttpServletRequest request) {
        getIpAddress(request);
        getName(request);
        getCounterOfGames(request);

    }
    public void getCounterOfGames(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Integer counter = (Integer) session.getAttribute("counter");
        if (counter == null) {
            session.setAttribute("counter", 1);
            counter = 1;
        } else {
            session.setAttribute("counter", counter+1);
        }
    }

    public void getIpAddress(HttpServletRequest request) {
        String remoteAddr = request.getRemoteAddr();
        request.getSession().setAttribute("ip",remoteAddr);
        request.setAttribute("remoteAddr", remoteAddr);
    }

    public void getName(HttpServletRequest request) {
        String name = request.getParameter("name");
        request.getSession().setAttribute("name", name);
    }
}
