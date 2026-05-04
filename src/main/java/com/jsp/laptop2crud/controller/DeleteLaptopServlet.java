package com.jsp.laptop2crud.controller;

import java.io.IOException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import com.jsp.laptop2crud.dao.LaptopDao;

@WebServlet("/delete")
public class DeleteLaptopServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        int id = Integer.parseInt(req.getParameter("id"));

        LaptopDao.deleteById(id);

        resp.sendRedirect("display");
    }
}