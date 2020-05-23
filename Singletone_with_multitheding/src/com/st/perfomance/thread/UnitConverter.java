package com.st.perfomance.thread;

public class UnitConverter {
	private static UnitConverter instance;
	private UnitConverter() {
		//"this is private conts dont remove it;
	}

	public static  UnitConverter getInstance(){
		if( instance==null) {
			instance =new UnitConverter();
		}
		return instance;
	}
	
}
