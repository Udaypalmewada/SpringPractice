package com.idRef.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.idRef.beans.Car;

public class idrefTest {

	public static void main(String[] args) {
 BeanFactory factory=new XmlBeanFactory(new ClassPathResource
		 ("com//idRef//common//application-context.xml"));
 Car car=factory.getBean("car",Car.class);
// System.out.println(car);
 car.drive();

	}

}
