package com.st.beanWithRunnavle;

public class test {

	public static void main(String[] args) {
		
		
		program p1 = new program();
		program2 p2 = new program2();

		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		
        t1.start();
        t2.start();
       
       


  
     
  
	}

}
