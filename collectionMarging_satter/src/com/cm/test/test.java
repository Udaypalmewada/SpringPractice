package com.cm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cglib.proxy.Factory;
import org.springframework.core.io.ClassPathResource;

import com.cm.beans.course;

public class test {

	public static void main(String[] args) {
BeanFactory Factory=new XmlBeanFactory(new ClassPathResource("com/cm/common/application-context.xml"));
	course cs=Factory.getBean("course1",course.class);
	System.out.println(cs);
	}

}
