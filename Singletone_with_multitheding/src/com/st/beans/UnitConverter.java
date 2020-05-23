package com.st.beans;

public class UnitConverter {
	private static UnitConverter instance;
	private UnitConverter() {
		System.out.println("this is private conts dont remove it");
	}

	public static UnitConverter getInstance(){
		if( instance==null) {
			instance =new UnitConverter();
		}
		return instance;
	}
	
}
