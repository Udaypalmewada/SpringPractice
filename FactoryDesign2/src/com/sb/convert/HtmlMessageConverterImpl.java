 package com.sb.convert;
public class HtmlMessageConverterImpl implements IMessageConverter {
	public String converterHtml(String message) {
		return message;
	}

	@Override
	public String converter(String message) {
		
		 return "<html><body> " + message + " </body></html>";
	}
}
