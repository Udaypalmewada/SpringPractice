package com.st.servlet;

public class singletone {
private static singletone instance;
private singletone() {}
public synchronized static  singletone getInstance() {
	if(instance==null) {
	 instance= new singletone();
	 System.out.println("single tone class");}
	   return instance;
	
}
}
