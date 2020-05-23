package com.core.box;

public class customer {

	public static void main(String[] args) {
		product c=new product();
		   Thread t1=new Thread(c);
		   Thread t2=new Thread(c);
		   t1.start();
		   t2.start(); 
	}

}
