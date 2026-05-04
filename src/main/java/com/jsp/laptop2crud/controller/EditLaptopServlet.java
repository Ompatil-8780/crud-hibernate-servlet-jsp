package com.jsp.laptop2crud.controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import com.jsp.laptop2crud.dao.LaptopDao;
import com.jsp.laptop2crud.entity.LaptopEntity;

@WebServlet("/edit")
public class EditLaptopServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));

		LaptopEntity l = LaptopDao.getById(id);

		req.setAttribute("laptop", l);

		RequestDispatcher rd = req.getRequestDispatcher("edit.jsp");
		rd.forward(req, resp);
	}
}