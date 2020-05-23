package com.st.perfomance.runnable;

public class UnitConverter {
	private static UnitConverter instance;
	private UnitConverter() {
		//"this is private conts dont remove it");
	}

	public static synchronized UnitConverter getInstance(){
		if( instance==null) {
			instance =new UnitConverter();
		}
		return instance;
	}
	
}
