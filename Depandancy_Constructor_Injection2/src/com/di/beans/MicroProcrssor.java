package com.di.beans;

public class MicroProcrssor {

	public String process(String VoicCommond) {
		String message = null;
		System.out.println("microprocess.proces()");
		if (VoicCommond.equals("helo")) {
			message = "Hello !How Are You";
		}

		else if (VoicCommond.equals("hy")) {
			message = "GoodMorning !Have A Good Day";
		}
		else {
			message = "OOPs wrong input";
		}
		
		return message;

	}

}
