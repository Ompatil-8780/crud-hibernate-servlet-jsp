package com.jsp.laptop2crud.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.jsp.laptop2crud.dao.LaptopDao;
import com.jsp.laptop2crud.entity.LaptopEntity;
@WebServlet("/display")
public class LaptopServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// (optional: use this for save if needed)
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<LaptopEntity> list = LaptopDao.getAll();

		req.setAttribute("data", list);

		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		rd.forward(req, resp);
	}
}