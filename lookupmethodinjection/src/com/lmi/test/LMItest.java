package com.lmi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.lmi.beans.Container;

public class LMItest {
 
	public static void main(String[] args) {
      BeanFactory beanFactory=new XmlBeanFactory(new 
    		  ClassPathResource("com/lmi/common/application-context.xml"));
      Container container=beanFactory.getBean("container",Container.class);
	container.proccess("hello");
	container.proccess("hello");
	container.proccess("hello");
	}

}
