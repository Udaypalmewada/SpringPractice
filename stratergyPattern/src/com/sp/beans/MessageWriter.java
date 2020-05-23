package com.sp.beans;

import com.convert.pattern.HtmlMessageConverterImpl;
import com.convert.pattern.IMessageConverter;
import com.convert.pattern.PdfMessageConverterImpl;

public class MessageWriter {
	IMessageConverter iMessageConverter;
	String converterMessage = null;

	public void writerMessage(String message) {
		iMessageConverter = new HtmlMessageConverterImpl();
		// iMessageConverter = new PdfMessageConverterImpl();
		converterMessage = iMessageConverter.converter(message);
	}
}
