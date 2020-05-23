package com.bpp.BPPtest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bpp.beans.Launcher;
import com.bpp.beans.Rocket;
import com.bpp.beans.objectTrekerBeanPostProcessor;

public class Bpptest {

	public static void main(String[] args) {
 BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/bpp/common/application-context.xml"));
 
 objectTrekerBeanPostProcessor bpp=factory.getBean("objectTreker", objectTrekerBeanPostProcessor.class);
 ((ConfigurableListableBeanFactory)factory).addBeanPostProcessor(bpp);
 
 Launcher launcher=factory.getBean("launcher", Launcher.class);
 System.out.println("objectCreated::"+bpp.getInstaces());
	Rocket rocket=factory.getBean("rocket", Rocket.class);
	System.out.println("objectCreated::"+bpp.getInstaces());

	}

}
