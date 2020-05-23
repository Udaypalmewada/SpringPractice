package com.st.beans;

public class program extends Thread  {
	
	public void run() {
		//program p1=new program();
		//System.out.println("p1:"+p1.currentThread());
		
		for(int i=0;i<=10;i++) {
			//Thread.sleep(10000);
			System.out.println("p1::"+i);
			
		}
		
	

	}
}
