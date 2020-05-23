package com.ioc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.ioc.beans.Singletone;

public class test1 {

	public static void main(String[] args) {
   		ApplicationContext context=new ClassPathXmlApplicationContext("com//ioc//common//application-context.xml");	
		
		Singletone sin2=context.getBean("singletone", Singletone.class);
		    System.out.println(sin2);
		    Singletone sin4=context.getBean("singletone", Singletone.class);
		    System.out.println(sin4);
		
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com//ioc//common/application-context.xml"));
    Singletone sin=factory.getBean("singletone", Singletone.class);
    System.out.println(sin);
    Singletone sin1=factory.getBean("singletone", Singletone.class);
    System.out.println(sin1);
	
	
	}

}
