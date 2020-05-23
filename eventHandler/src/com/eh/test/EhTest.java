package com.eh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.eh.beans.UpdateCityController;

public class EhTest {

	public static void main(String[] args) {
  /*  BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com//eh//common//application-context.xml"));
	*/
	ApplicationContext context=new ClassPathXmlApplicationContext("com//eh//common//application-context.xml");
		UpdateCityController res=context.getBean("reloadSource",UpdateCityController.class);
	res.updatecity(1,"bhopal");
	System.out.println(res);
	}

}
