package com.inter.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserDataServlet extends HttpServlet{
	String name=null,age=null,mob=null;
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter pw = null;
	pw = resp.getWriter();
	resp.setContentType("text/html");
 
pw.println("cha incoding::"+req.getCharacterEncoding());
pw.println("<br>local addres::"+req.getLocalAddr());
pw.println("<br>local name::"+req.getLocalName());
pw.println("<br> local port::"+req.getLocalPort());
pw.println("<br> method::"+req.getMethod());
pw.println("<br> pathinfo::"+req.getPathInfo());
pw.println("<br> protocol::"+req.getProtocol());
//pw.println("<br> realpath::"+req.getRealPath());
pw.println("<br>remort addres::"+req.getRemoteAddr());
pw.println("<br> remort user::"+req.getRemoteUser());
pw.println("<br>local session id::"+req.getRequestedSessionId());
pw.println("<br>local language ::"+req.getLocale());

 
  pw.close();
  
  
  
  
}
}
