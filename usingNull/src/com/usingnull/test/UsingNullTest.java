package com.usingnull.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.usingnull.beans.person;

public class UsingNullTest {

	public static void main(String[] args) {
 BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com\\usingnull\\common\\application-context.xml"));
	person person=factory.getBean("person",person.class);
	System.out.println(person);
	}

}
