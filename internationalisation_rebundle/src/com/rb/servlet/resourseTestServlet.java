package com.rb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class resourseTestServlet extends HttpServlet{
@Override
public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    PrintWriter pw=null;
    pw=resp.getWriter();
    resp.setContentType("text/html");
    Locale locale=req.getLocale();
    pw.println(locale+"::");
    try {
    	String baseName = "rb\\\\props\\\\welcome";
	
	ResourceBundle res = ResourceBundle.getBundle(baseName,locale);
	pw.println(res.getString("welcome.msg"));

   }catch(Exception e) {
	System.out.println("resourseTestServlet.service()");
	pw.println("fie not found");
}
	
	
}

}
