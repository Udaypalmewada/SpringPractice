package com.bfpp.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSurce {
private String className;
private String url;
private String username;
private String password;
public void setClassName(String className) {
	this.className = className;
}
public void setUrl(String url) {
	this.url = url;
}
public void setUsername(String username) {
	this.username = username;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "DataSurce [className=" + className + ", url=" + url + ", username=" + username + ", password=" + password
			+ "]";
}

public Connection getConnection(String className,String url,String user,String password) throws SQLException {
	//Class.forName(className);
	Connection con=DriverManager.getConnection(url, user, password);
	
	return con;
	}

}
