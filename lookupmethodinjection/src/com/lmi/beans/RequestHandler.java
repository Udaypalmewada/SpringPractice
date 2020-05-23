package com.lmi.beans;

public class RequestHandler {
	private String data;
	
public RequestHandler() {
System.out.println("request handler");
}
public void setData(String data) {
		this.data = data;
	}

public void request() {
	System.out.println("requested data:"+data+"\t hashCode::"+hashCode());
}

}
