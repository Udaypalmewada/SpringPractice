package com.ai.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.cglib.proxy.Factory;

public class Car implements BeanFactoryAware {
	private IEngine engine;
	private String beanid;
	private BeanFactory Factory;

	public Car(String beanid) {
		System.out.println("Car()");
		this.beanid = beanid;
	}

	public void run() {
		engine = Factory.getBean(beanid, IEngine.class);
		engine.start();
		System.out.println("running");

	}

	@Override
	public void setBeanFactory(BeanFactory factory) throws BeansException {
		System.out.println("setBEan()");
		this.Factory = factory;
	}

}
