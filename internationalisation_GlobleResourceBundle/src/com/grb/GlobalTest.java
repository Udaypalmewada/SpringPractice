package com.grb;

import java.util.Locale;
import java.util.Properties;

public class GlobalTest {
	public static void main(String[] args) {
		Properties props=null;
		Locale locale=Locale.getDefault();
		String[] baseNames=new String[] {"welcome_en_US","welcome_en_GB","welcome_en_IN"};
		System.out.println(locale);
		GlobalResourceBundle bundle=GlobalResourceBundle.getBundle(baseNames, locale);
		 
		String str=bundle.getMessage("welcome.msg");
		System.out.println(str);
	   
		
		}
}
