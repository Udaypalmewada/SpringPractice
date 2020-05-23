package com.om.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LongRunningServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=null;
       out=resp.getWriter();
       int hashcode=0;
       hashcode=this.hashCode();
       for(int i=1;i<=10000;i++) {
    	   try {
    			Thread.sleep(100);
    		} catch (InterruptedException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    	   out.print("Agent::"+i+"hascode"+hashcode);
      
       }
       out.flush();
       out.println("hii");
       out.close();
	}

}
