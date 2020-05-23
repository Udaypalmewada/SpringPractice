package com.lc.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoanCalculatServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");

		String city, profession;
		double lamount, time,intrest;
		double rt=0.0;
		city = req.getParameter("city");
		profession = req.getParameter("profession");
		lamount = Double.parseDouble(req.getParameter("amount"));
		time = Double.parseDouble(req.getParameter("time"));
		
		// FileInputStream file = new FileInputStream("src/intrestrate.properties");
		 
		    Properties props = new Properties();
		    props.load(this.getClass().getClassLoader().getResourceAsStream("intrestrate.properties"));
		    if(city.equalsIgnoreCase("hyd")) {
		   rt= Double.parseDouble(props.getProperty(city));
		    }
		    if(city.equalsIgnoreCase("chi")) {
				   rt= Double.parseDouble(props.getProperty(city));
				    }
		    if(city.equalsIgnoreCase("bang")) {
				   rt= Double.parseDouble(props.getProperty(city));
				    }
						 intrest=(lamount*time*rt)/100;
					    pw.println("intst is::"+intrest);
					
	     
	  }
     
	
  }	
		