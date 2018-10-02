package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.sql.DataSource;

import ca.sheridancollege.beans.Person;

public class EchoServlet extends HttpServlet {

	private DataSource dataSource;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Step 1: Set up the printwriter
				PrintWriter out = resp.getWriter();
				resp.setContentType("text/plain");

				out.println("EchoServlet at your service!");

				String stremail = req.getParameter("email");
				String strcolor = req.getParameter("color");
				String strage = req.getParameter("age");
				
				
				String[] arrskills = req.getParameterValues("skills");

				List<Person> personList = new CopyOnWriteArrayList<Person>();
				
				personList.add(stremail,strcolor,strage,arrskills[]);
				
				for (Person person : personList) {
					resp.getWriter().append("<h3>" + person.toString() + "</h3>");
				}
			}
}
