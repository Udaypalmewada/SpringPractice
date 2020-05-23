package com.core.scoreboard;

public class Test {

public static void main(String[] args) {
		Match match=new Match();
		Thread t1=new Thread(match);
		Thread t2=new Thread(match);
		t1.start();
		t2.start();
		
	}

}