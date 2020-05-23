package com.sp.beans;

import com.sb.convert.IMessageConverter;
import com.sp.helper.AppFectory;
import com.sp.helper.MassageConverterFactory;

public class MessageWriter {
	IMessageConverter iMessageConverter;

	public void writerMessage(String message) throws Exception {
		String cMessage = null;

		/*we are cretaing object of class by using logical name of class("html") thas way it is tightly
		 * cuploed by another class 
		 * iMessageConverter = MassageConverterFactory.CreateMassageconveretr("html");*/
		//down the is making are class 0 cupling 
		iMessageConverter = (IMessageConverter) AppFectory.createObject("massageConverter.class");
		cMessage = iMessageConverter.converter(message);
		System.out.println(cMessage);
	}

	public void setiMessageConverter(IMessageConverter iMessageConverter) {
		this.iMessageConverter = iMessageConverter;
	}

}
