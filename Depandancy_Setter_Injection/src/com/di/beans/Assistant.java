package com.di.beans;

public class Assistant {
private	MicroProcrssor microprocessor;
	
	public void setMicroprocessor(MicroProcrssor microprocessor) {
		System.out.println("set()");
		this.microprocessor = microprocessor;
	}

	public void help(String VoicCommond) {
		String message=null;
		System.out.println("help()");
		message=microprocessor.process(VoicCommond);
		System.out.println(message);
	
	
}
}
