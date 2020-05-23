package com.core.box;

import java.util.ArrayList;

import java.util.Iterator;

public class Box {
	private static Box instance;
	private String item;

	private Box() {
	}

	ArrayList<String> list = new ArrayList<>();

	public static Box getInstance() {
		if (instance == null) {
			instance = new Box();
		}
		return instance;

	}

	public  void add(String item) {
		int n = 0;
		for (int i = 1; i <= 10; i++) {
			n++;
			list.add(item);
		}
		
		System.out.println("added "+ item + ":" + n);
	}

	public void remove(String item) {
		int r = 0;
		for (int i = 1; i <=10; i++) {
			r++;
			list.remove(item);
		}
		System.out.println("removed "+item+ ":" + r);
	}

}
