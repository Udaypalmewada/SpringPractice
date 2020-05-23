package com.lc.servlet;

import java.util.Map;

public class Ceche {
	private static Ceche instance;
	private Map<String, Object> datamap;

	private Ceche() {
	}

	public static Ceche getinstance() {
		if (instance == null) {
			Ceche ceche = new Ceche();
		}
		return instance;

	}

	public void put(String key, Object value) {
		datamap.put(key, value);
	}
	public Object get(String key) {
		
		return datamap.containsKey(key);
		}

	public boolean containsKey(String key) {

		return datamap.containsKey(key);
	}

}
