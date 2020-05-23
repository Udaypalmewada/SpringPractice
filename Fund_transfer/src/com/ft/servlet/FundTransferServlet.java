package com.ft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FundTransferServlet extends HttpServlet {
	private String faccount = null;
	private String toaccount = null;
	private double amount = 0;
	private double faccontbal = 0;
	private double toaccountbal = 0;

	@SuppressWarnings("resource")
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		PreparedStatement qps1 = null;

		java.sql.Connection con = null;
		PrintWriter pw = null;
		pw = res.getWriter();
		res.setContentType("text/html");
		faccount = req.getParameter("fromaccount");
		toaccount = req.getParameter("toaccount");
		amount = Double.parseDouble(req.getParameter("amount"));

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/udaytest", "root", "");
			System.out.println("conected");
			qps1 = con.prepareStatement("select bal from test1 where acno=?");
			qps1.setString(1, faccount);
			ResultSet rs1 = qps1.executeQuery();
			if (rs1.next()) {
				faccontbal = rs1.getInt(1);
			}
			Thread.sleep(7000);
			qps1 = con.prepareStatement("select bal from test1 where acno=?");
			qps1.setString(1, toaccount);
			rs1 = qps1.executeQuery();
			if (rs1.next()) {
				toaccountbal = rs1.getInt(1);
			}

			pw.println("toaccountbal::" + toaccountbal + " frombal::" + faccontbal);
			faccontbal = faccontbal - amount;
			toaccountbal = toaccountbal + amount;
			pw.println("<br>fund-Transfer Success full<br>");
			pw.println("toaccountbal::" + toaccountbal + " frombal::" + faccontbal);
			PreparedStatement ups = con.prepareStatement("update test1 set bal=? where acno=?");
			ups.setString(2, toaccount);
			String s = Double.toString(toaccountbal);
			ups.setString(1, s);
			System.out.println("updatedt");
			ups.executeUpdate();
			PreparedStatement ups1 = con.prepareStatement("update test1 set bal=? where acno=?");
			ups1.setString(2, faccount);
			String s2 = Double.toString(faccontbal);
			ups1.setString(1, s2);
			ups1.executeUpdate();
			System.out.println("updatedt");
			rs1.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {

				qps1.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
