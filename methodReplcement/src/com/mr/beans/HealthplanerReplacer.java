package com.mr.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class HealthplanerReplacer implements MethodReplacer{

	@Override
	public String[] reimplement(Object obj, Method methos, Object[] arg) throws Throwable {
		System.out.println("this replaced method");
		String[] plane = { "plane_65", "sorry..." };
		System.out.println(plane[0]);
		return plane;
		
	}

}
