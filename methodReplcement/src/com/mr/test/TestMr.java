package com.mr.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.mr.beans.Healthpalnaer;

public class TestMr {

	public static void main(String[] args) {
BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/mr/common/application-context.xml"));
Healthpalnaer hp=factory.getBean("healthplaner", Healthpalnaer.class);
hp.planefinder("uday", 25, 40, "india");

	}

}
