package com.example;


import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DataAccessServlet extends HttpServlet {
	
	
	//Global Constants
	public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

	
	public static String DB_URL = "jdbc:mysql://localhost:3306/person";
	
	// Default root user for mysql
	public static final String USER = "root";
	public static final String PASS = "root";// After mySQL config
	
	
	//JDBC 
	public Connection conn;
	public Statement stmt;
	public String sql;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			{
		
		
		// In case of LOSS of DAtabase connectivity
		// Include this in a JAVA try-catch block
		// DUMP to the eclipse CONSOLE any StackTrace
		try {
			// What the servlet SEND BACK to the client browser
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			
			String title = "Sheridan Person Database Result";
			
			String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " +
				        "transitional//en\">\n";
			
			out.println(docType +
	                "<html>\n" +
	                "<head><title>" + title +
	                "</title></head>\n" +
	                "<body bgcolor=\"#f0f0f0\">\n" +
	                "<h1 align=\"center\">" + title + "</h1>\n");
			
			// Standard JDBC connectivity (same in standard JAVA)
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();

			
			sql = "SELECT * FROM personTb1";

			
			// Resultset is what the servlet expects Back from 
			// the Mysql database
			ResultSet rs = stmt.executeQuery(sql);
			
			// as long as the result set is not empty or null 
			// Perform this loop operation
			while(rs.next()) {
				
			
				
				String first = rs.getString("firstName");
				String last = rs.getString("lastName");
				String em = rs.getString("email");	
			
			
				out.println("Student Id : " + first + "<br>");
				out.println(", Student Name : " + last + "<br>");
				out.println(", Course ID : " + em + "<br>");
				
			}
			
			out.println("</body></html>");
			
			rs.close();
			stmt.close();
			conn.close();			
			
		} catch (Exception ex) {
			ex.printStackTrace();
			
		}		
	}
}






