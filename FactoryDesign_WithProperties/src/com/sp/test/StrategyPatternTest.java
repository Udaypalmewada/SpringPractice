package com.sp.test;

import com.sb.convert.IMessageConverter;
import com.sp.beans.MessageWriter;
import com.sp.helper.AppFectory;

public class StrategyPatternTest {

	public static void main(String[] args) throws Exception {

		MessageWriter messageWriter = (MessageWriter) AppFectory.createObject("MessageWriter.class");
		IMessageConverter messageConverter = (IMessageConverter) AppFectory.createObject("massageConverter.class");
		// IMessageConverter messageConverter = (IMessageConverter)
		// AppFectory.createObject("massageConverterpdf.class");
		messageWriter.writerMessage("Welcome to Strategy Design Pattern");

	}
}
