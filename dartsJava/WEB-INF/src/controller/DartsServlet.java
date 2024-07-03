package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DartsServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.getRequestDispatcher("./jsp/menu.jsp").forward(req, resp);
		
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String gamemode = req.getParameter("gamemode");
		
		if ( gamemode.equals("01") ) {
			req.getRequestDispatcher("/ZeroOneController").forward(req, resp);
		} else if ( gamemode.equals("Cricket") ) {
			req.getRequestDispatcher("/CricketController").forward(req, resp);
		} else if ( gamemode.equals("Practice") ) {
			req.getRequestDispatcher("/PracticeController").forward(req, resp);
		} else {
			req.getRequestDispatcher("./jsp/menu.jsp").forward(req, resp);
		}
		
	}
	
}
