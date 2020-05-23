package com.st.beanWithRunnavle;

public class program2 implements Runnable{
	
	public void run() {
		long time1,time2;
		time1=System.nanoTime();
		
		for(int i=11;i<=20;i++) {
			System.out.println("p2::"+i);
		}
		time2=System.nanoTime();
		long t=time2-time1;
		System.out.println("time taken by p2::"+t/10000);
	}

}
