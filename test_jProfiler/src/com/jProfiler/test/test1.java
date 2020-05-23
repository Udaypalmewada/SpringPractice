package com.jProfiler.test;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<=10;i++) {
		sample s=new sample();
       //s.m1();
		//System.out.println(s);
		}
		Thread.sleep(60000);
		System.out.println("main close");
	}

	
}
