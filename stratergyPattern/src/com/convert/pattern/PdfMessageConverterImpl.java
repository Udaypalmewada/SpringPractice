package com.convert.pattern;

public class PdfMessageConverterImpl implements IMessageConverter{
	public String converterPdf(String message) {
		return message;
	}

	@Override
	public String converter(String message) {
		System.out.println("<pdf> " + message + " </pdf>");
		return message;
	}
}