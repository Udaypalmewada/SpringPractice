package com.bfp.beans;

import java.sql.Connection;

public class ConectionProvider {
	Connection con=null;
	private String drivername;
	private String url;
	private String user;
	private String pws;
	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public void setPws(String pws) {
		this.pws = pws;
	}
	public Connection getConnection(String driver,String url,String name,String user,String pws){
		
		return con;
		
	}
	
}
