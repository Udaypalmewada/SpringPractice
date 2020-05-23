package com.bi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bi.beans.Car;

public class Bean_Inheritance_test {

	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com\\bi\\common\\application-context.xml"));
		Car car=factory.getBean("car",Car.class);
		Car car1=factory.getBean("car1",Car.class);
    System.out.println(car);
    System.out.println(car1);
	}

}
