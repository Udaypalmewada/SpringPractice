package com.fs.beans;

public class PdfMessageConverterImpl implements IMessageConverter {

	@Override
	public String convert(String message) {
		return "<pdf><body>" + message + "</body></pdf>";
	}
}