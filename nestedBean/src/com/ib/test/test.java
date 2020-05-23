package com.ib.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cglib.proxy.Factory;
import org.springframework.core.io.ClassPathResource;

import com.ib.beas.FuleTank;
import com.ib.beas.Motor;

public class test {

	public static void main(String[] args) {

		BeanFactory parant = new XmlBeanFactory(new ClassPathResource("com/ib/common/application-child.xml"));
			
		BeanFactory child = new XmlBeanFactory(new ClassPathResource("com/ib/common/application-parant.xml"),parant);
		Motor motor = child.getBean("motor", Motor.class);
		System.out.println(motor);
			}

}
