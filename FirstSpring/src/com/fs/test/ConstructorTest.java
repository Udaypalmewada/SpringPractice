package com.fs.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.fs.beans.MessageWriter;

public class ConstructorTest {
	public static void main(String[] args) {
	
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com//fs//common//application-context.xml"));
		
		MessageWriter messageWriter = factory.getBean("messageWriter", MessageWriter.class);
		
		messageWriter.writeMessage(" Welcome to Spring! ");
	}
}