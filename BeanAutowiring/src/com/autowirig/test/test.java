package com.autowirig.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.autowirig.beans.Robot;

public class test {

	public static void main(String[] args) {
BeanFactory factory=new XmlBeanFactory(new ClassPathResource
		("com\\autowirig\\common\\application-context2.xml"));
Robot robot=factory.getBean("robot",Robot.class);
System.out.println(robot);
	}

}
