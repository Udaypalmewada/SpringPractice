package com.st.servlet;

public class UnitConverter {

	private static UnitConverter instance ;
    private UnitConverter() {
		
	}

	public synchronized static UnitConverter getInstance() {

		if (instance == null) {
			instance  = new UnitConverter();
		}

		return instance;
	}

}
