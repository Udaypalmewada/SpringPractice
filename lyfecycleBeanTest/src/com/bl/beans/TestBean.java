package com.bl.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TestBean implements DisposableBean, InitializingBean {
  String name;
	@Override
public String toString() {
	return "TestBean [name=" + name + "]";
}

	public void setName(String name) {
	this.name = name;
}

	@Override
	public void afterPropertiesSet() throws Exception {
        System.out.println("init method()");
	}

	@Override
	public void destroy() throws Exception {
        System.out.println("destroy method");
	}

	
}
