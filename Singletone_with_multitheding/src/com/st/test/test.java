package com.st.test;

import com.st.beans.program;
import com.st.beans.program2;

public class test {

	public static void main(String[] args) {
		program p1=new program();
		//program2 p2=new program2();
		p1.start();
		
	//p1.start();//if we want to
	//p1.run();//if we run directly it will join current thread excecution 
	//p2.start();
		System.out.println("p1:"+p1.currentThread());
		
	}

}
