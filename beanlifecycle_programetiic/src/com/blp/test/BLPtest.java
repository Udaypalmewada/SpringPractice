package com.blp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.blp.beans.Calculator;

public class BLPtest {

	public static void main(String[] args) {
BeanFactory factory=new XmlBeanFactory(new ClassPathResource
		("com/blp/common/application-context.xml"));
Calculator calculator=factory.getBean("calculator",Calculator.class);
System.out.println(calculator);
((ConfigurableListableBeanFactory)factory).destroySingletons();
	}

}
