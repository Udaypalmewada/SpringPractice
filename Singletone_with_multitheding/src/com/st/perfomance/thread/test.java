package com.st.perfomance.thread;

public class test {

	public static void main(String[] args) {
		long time1,time2;
		
     work w=new work() ;
     work w1=new work() ;
    
     time1 = System.nanoTime();
     w.start();
     w1.start();
     time2 = System.nanoTime();
    
	}

}
