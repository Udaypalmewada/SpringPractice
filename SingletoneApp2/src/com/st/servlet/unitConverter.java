package com.st.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/app1")
public class unitConverter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String name=null,lname=null;
		PrintWriter pw=null;
		pw=res.getWriter();
		
		res.setContentType("text/html");
		/*name=req.getParameter("name");
		lname=req.getParameter("lname");
	
		pw.println("<h2> name is:"+name+"<br>");
		pw.println("<h2> last name is"+lname);*/
		
		singletone s=singletone.getInstance();
		singletone s1=singletone.getInstance();
		singletone s2=singletone.getInstance();
		singletone s3=singletone.getInstance();
		
		pw.println("<h2> HashCode of class"+s.hashCode());
		pw.println("<h2> HashCode of class"+s1.hashCode());
		pw.println("<h2> HashCode of class"+s2.hashCode());
		pw.println("<h2> HashCode of class"+s3.hashCode());
		
		pw.close();
	}

	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
