package com.idRef.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Car {
	private IEngen engin;
	private String manfacturar;

	public void setEngin(IEngen engin) {
		this.engin = engin;
	}

	public void setManfacturar(String manfacturar) {
		this.manfacturar = manfacturar;
	}

	@Override
	public String toString() {
		return "Car [engin=" + engin + "]";
	}

	public void drive() {
		// engin =new yamnhEnginImpl();
		// engin=new suzukiEnginImpl();

		BeanFactory factory = null;
		factory = new XmlBeanFactory(new ClassPathResource("com//idRef//common//application-context.xml"));
		engin = factory.getBean(manfacturar, IEngen.class);
		engin.start();
		System.out.println("Driving Car");

	}

}
