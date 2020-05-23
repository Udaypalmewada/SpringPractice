package com.di.beans;

public class Assistant {
	private MicroProcrssor microprocessor;

	public Assistant() {
		System.out.println("microprocess()");
	}

	public Assistant(MicroProcrssor microprocessor) {
		System.out.println("microprocess()");
		this.microprocessor = microprocessor;
	}

	public void help(String VoicCommond) {
		String message = null;
		System.out.println("help()");
		message = microprocessor.process(VoicCommond);
		System.out.println(message);

	}
}
