package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.sql.DataSource;



public class EchoServlet extends HttpServlet {
	
	private DataSource dataSource;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// Step 1:  Set up the printwriter
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/plain");
		
		// Step 2:  Get a connection to the database
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		
		try {
			myConn = dataSource.getConnection();
			
			// Step 3:  Create a SQL statements
			String sql = "select * from personTb1";
			myStmt = myConn.createStatement();
			
			// Step 4:  Execute SQL query
			myRs = myStmt.executeQuery(sql);
			
			// Step 5:  Process the result set
			while (myRs.next()) {
				String email = myRs.getString("email");
				out.println(email);
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}

}
