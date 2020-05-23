package com.lmi.beans;

public abstract class Container {
	

	public Container() {
System.out.println("cointener");
	}
	public void proccess(String data) {
		
		RequestHandler hr=lookupB();
        hr.setData(data);
		hr.request();
          }
	public abstract RequestHandler lookupB();
	
}
	