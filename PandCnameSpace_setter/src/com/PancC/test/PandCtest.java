package com.PancC.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.PancC.beans.Toy;

@SuppressWarnings("deprecation")
public class PandCtest {

	public static void main(String[] args) {
     BeanFactory factory=new XmlBeanFactory(new ClassPathResource
    		 ("com/PancC/common/application-context.xml"));
     Toy toy=factory.getBean("toy",Toy.class);
     System.out.println(toy);
	}

}
