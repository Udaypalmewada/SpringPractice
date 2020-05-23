package com.core.box;

public class product implements Runnable {

	@Override
	public void run() {
		 Box b= Box.getInstance();
		   b.add("television");
			b.remove("television");
		
	}

}
