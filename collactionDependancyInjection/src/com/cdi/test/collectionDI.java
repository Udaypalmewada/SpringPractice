package com.cdi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cdi.beans.Team;

public class collectionDI {

	public static void main(String[] args) {
		System.out.println("bean1");
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com\\cdi\\commomn\\application-context.xml"));
		System.out.println("bean2");
		Team team = factory.getBean("Team", Team.class);
		System.out.println("bean2");// traking the excution
		System.out.println(team);

	}

}
