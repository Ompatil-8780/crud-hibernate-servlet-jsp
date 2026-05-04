package com.jsp.laptop2crud.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import com.jsp.laptop2crud.dao.LaptopDao;
import com.jsp.laptop2crud.entity.LaptopEntity;

@WebServlet("/search")
public class SearchLaaptopServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String keyword = req.getParameter("keyword");

        List<LaptopEntity> list = LaptopDao.searchByName(keyword);

        req.setAttribute("data", list);

        RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
        rd.forward(req, resp);
    }
}