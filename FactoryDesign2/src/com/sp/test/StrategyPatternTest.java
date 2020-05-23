package com.sp.test;

import com.sb.convert.HtmlMessageConverterImpl;
import com.sb.convert.IMessageConverter;
import com.sb.convert.PdfMessageConverterImpl;
import com.sp.beans.MessageWriter;

 public class StrategyPatternTest {
	 
	public static void main(String[] args) {
		
		MessageWriter messageWriter = new MessageWriter();
		IMessageConverter messageConverter = new PdfMessageConverterImpl();
		messageWriter.setiMessageConverter(messageConverter);
		
		messageWriter.writerMessage("Welcome to Strategy Design Pattern");
	
	
	}
}
