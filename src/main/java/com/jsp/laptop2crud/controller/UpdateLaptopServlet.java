package com.jsp.laptop2crud.controller;

import java.io.IOException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import com.jsp.laptop2crud.dao.LaptopDao;
import com.jsp.laptop2crud.entity.LaptopEntity;

@WebServlet("/update")
public class UpdateLaptopServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {

        LaptopEntity l = new LaptopEntity();

        l.setId(Integer.parseInt(req.getParameter("id")));
        l.setNameString(req.getParameter("name"));
        l.setPrice(Integer.parseInt(req.getParameter("price")));
        l.setRam(Integer.parseInt(req.getParameter("ram")));
        l.setRom(Integer.parseInt(req.getParameter("rom")));
        l.setVerstionString(req.getParameter("version"));
        l.setColorString(req.getParameter("color"));
        l.setWeight(Double.parseDouble(req.getParameter("weight")));

        LaptopDao.update(l);

        resp.sendRedirect("display");
    }
}