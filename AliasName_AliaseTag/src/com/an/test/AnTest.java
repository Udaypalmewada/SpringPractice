package com.an.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.an.beans.Toy;

public class AnTest {

	public static void main(String[] args) {
    BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com//an//common/application-context.xml"));
    Toy toy=factory.getBean("Ameria@2.0",Toy.class);
    System.out.println(toy);
	}

}
