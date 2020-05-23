 package com.convert.pattern;
public class HtmlMessageConverterImpl implements IMessageConverter {
	public String converterHtml(String message) {
		return message;
	}

	@Override
	public String converter(String message) {
		System.out.println("<html><body> " + message + " </html></body>");
		return message;
	}
}
