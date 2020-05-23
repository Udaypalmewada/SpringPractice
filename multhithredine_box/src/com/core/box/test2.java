package com.core.box;

import java.util.ArrayList;
import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		String name = null;
		String itemlist=null;
		Scanner sc = new Scanner(System.in);
		
			System.out.println("enter the item");
			name = sc.nextLine();
			int j=0;
				for(int i=1;i<=10;i++) {
					
					list.add(name);
					j++;
				}		
				System.out.print(name+":"+j);
					System.out.println(list);
		
	              }
}
