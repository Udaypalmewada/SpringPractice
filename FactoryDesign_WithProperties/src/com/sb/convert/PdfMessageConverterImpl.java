package com.sb.convert;

public class PdfMessageConverterImpl implements IMessageConverter{
	public String converterPdf(String message) {
		return message;
	}

	@Override
	public String converter(String message) {
		
		return "<pdf> " + message + " </pdf>";
	}
}