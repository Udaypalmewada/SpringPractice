package com.blp.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Calculator implements InitializingBean, DisposableBean {

	private int a;
	private int b;
	private int sum;
	
	public Calculator(int a) {
		this.a = a;
	}
	

	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	@Override
	public void destroy() throws Exception {
System.out.println("Destroing.......");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
           this.sum=this.a*this.b;
	}


	@Override
	public String toString() {
		return "Calculator [a=" + a + ", b=" + b + ", mul=" + sum + "]";
	}
 
}
