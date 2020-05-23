package com.om.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.om.beans.Address;
import com.om.beans.AmewzonOrderManagementService;

public class AlisTest {

	public static void main(String[] args) {
BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com\\om\\common\\appplication-context.xml"));
AmewzonOrderManagementService aws=factory.getBean("amewzonOrderManagementService",AmewzonOrderManagementService.class);
Address adr=factory.getBean("address", Address.class);
aws.plaseOrder(adr);

	
	}

}
