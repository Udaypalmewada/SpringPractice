package com.st.perfomance.runnable;

public class test {

	public static void main(String[] args) {
		long time1,time2;
     work w=new work() ;
     Thread t=new Thread(w);
     Thread t1=new Thread(w);
     System.out.println(t.getState());
 	time1 = System.nanoTime();
     t.start();
     System.out.println(t.getState());
     t1.start();
 	time2 = System.nanoTime();
 	System.out.println("time tacken");
 	System.out.println(time2-time1);
	}

}
