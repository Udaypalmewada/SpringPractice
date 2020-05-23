package com.sp.beans;

import com.sb.convert.HtmlMessageConverterImpl;
import com.sb.convert.IMessageConverter;
import com.sb.convert.PdfMessageConverterImpl;
import com.sp.helper.massageConverterFactory;

public class MessageWriter {
	IMessageConverter iMessageConverter;
	String converterMessage = null;

	public void writerMessage(String message) {
	   //  iMessageConverter = new massageConverterFactory().CreateMassageconveretr("pdf");
	     iMessageConverter = new massageConverterFactory().CreateMassageconveretr("html");
		
		converterMessage = iMessageConverter.converter(message);
	}
}
