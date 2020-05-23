package com.st.beanWithRunnavle;

public class program implements Runnable{
	
	public void run() {
		long time1,time2;
		
		program p1=new program();
		 Thread t1=new Thread(p1);

		time1=System.nanoTime();
		
		for(int i=1;i<=10;i++) {
			System.out.println("p1::"+i);
			}
		time2=System.nanoTime();
		long t=time2-time1;
		System.out.println("time taken by p1::"+t/10000);
		System.out.println("=======================");
	}

}
