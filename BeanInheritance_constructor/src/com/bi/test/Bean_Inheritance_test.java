package com.bi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bi.beans.Bus;
import com.bi.beans.Car;

public class Bean_Inheritance_test {

	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new
				ClassPathResource("com\\bi\\common\\application-context.xml"));
		System.out.println("ABC");
		//Car car=factory.getBean("car",Car.class);
		Bus bus=factory.getBean("bus",Bus.class);
    System.out.println(bus);
    //System.out.println(car1);
	}

}
