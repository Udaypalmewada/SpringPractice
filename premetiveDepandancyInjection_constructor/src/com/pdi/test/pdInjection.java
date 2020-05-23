package com.pdi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pdi.beans.Address;

public class pdInjection {

	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource
				("com\\pdi\\commomn\\application-context.xml"));
		Address address=factory.getBean("officeAddress" ,Address.class);
		System.out.println(address);

	}

}
