package com.bl.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bl.beans.TestBean;

public class test {
	
	public static void main(String[] args) {
  BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/bl/common/application-context.xml"));
      TestBean bean=factory.getBean("testbean",TestBean.class);
   System.out.println(bean);
	}

}
