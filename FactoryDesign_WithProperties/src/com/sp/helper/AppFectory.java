package com.sp.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AppFectory {
public static Object createObject(String lClassName) throws Exception  {
	Properties props=null;
	String className=null;
	Object obj=null;
	props =new Properties();
	//Absolute path
	
		props.load(new FileInputStream(new File("F:\\study\\Spring\\FactoryDesign_WithProperties\\"
				+ "src\\com\\sp\\commomn\\Appclass.properties")));
	className=props.getProperty(lClassName);
	Class clazz=Class.forName(className);
	obj=clazz.newInstance();
	
	
	return obj;
	


	}
}
