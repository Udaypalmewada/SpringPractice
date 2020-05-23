package com.sp.beans;

import com.sb.convert.IMessageConverter;

public class MessageWriter {
	IMessageConverter iMessageConverter;
	String cMessage = null;

	public void writerMessage(String message) {
	    // iMessageConverter = new massageConverterFactory().CreateMassageconveretr("pdf");
	     //iMessageConverter = MassageConverterFactory.CreateMassageconveretr("html");
		
		cMessage= iMessageConverter.converter(message);
		System.out.println(cMessage);
	}

	public void setiMessageConverter(IMessageConverter iMessageConverter) {
		this.iMessageConverter = iMessageConverter;
	}
	
}
