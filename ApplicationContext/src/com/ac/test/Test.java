package com.ac.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ac.beans.Bank;

public class Test {

	public static void main(String[] args) {

		/*BeanFactory factory=new XmlBeanFactory
				(new ClassPathResource("com/ac/common/application-context.xml"));
	*/
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext
				("com/ac/common/application-context.xml");
	Bank bank=context.getBean("bank", Bank.class);
	System.out.println(bank);
	}

}
