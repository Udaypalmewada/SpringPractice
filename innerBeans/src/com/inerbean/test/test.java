package com.inerbean.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.inerbean.beans.cycle;

public class test {

	public static void main(String[] args) {
BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com\\inerbean\\common\\application-contect.xml"));
cycle cycle=factory.getBean("cycle",cycle.class);
System.out.println(cycle);

	}

}
