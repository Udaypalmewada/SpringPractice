package com.ioc.beans;

public class Singletone {
	private static Singletone instance;
private Singletone() {}

public synchronized static Singletone getinstance() {
	if(instance==null) {
		instance=new Singletone();
		System.out.println("Hascode"+instance.hashCode());
	}
	return instance;
	
}

@Override
public String toString() {
	return "Singletone [ hashCode()=" + hashCode() +"]";
}

}
