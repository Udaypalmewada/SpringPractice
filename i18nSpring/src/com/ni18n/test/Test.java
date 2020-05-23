package com.ni18n.test;

import java.util.Locale;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {

	public static void main(String[] args) {
		//BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com\\ni18n\\common\\application-context.xml"));
		ApplicationContext factory=new ClassPathXmlApplicationContext
				("com/ni18n/common/application-context.xml");	
		MessageSource msg = factory.getBean("messageSource", MessageSource.class);
		System.out.println(Locale.getDefault());
		System.out.println(msg.getMessage("welcome.msg", null, Locale.getDefault()));
	}

}
