package com.di.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.di.beans.Assistant;

public class DepandancyInjaction {

	public static void main(String[] args) {
		System.out.println("main()");
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com//di//common//application-context.xml"));
		System.out.println("bean");
		Assistant assistance = factory.getBean("Assistant", Assistant.class);
		System.out.println("main after bean");
		assistance.help("helo");
	}

}
