package com.st.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UnitMeasurServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("enetr in servlet");
		PrintWriter pw=res.getWriter();;
		
		res.setContentType("text/html");
		int number=0;
		number=Integer.parseInt(req.getParameter("t1"));
		
		if(number/2==0) {
			pw.println("number is evenv");
		}
		
		
		worker w1=new worker();
		pw.println("hachcode is"+w1.hashCode());
	}
	

}
