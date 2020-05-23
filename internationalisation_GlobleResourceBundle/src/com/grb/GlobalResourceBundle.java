package com.grb;


import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class GlobalResourceBundle {
	static Properties props=null;
	private GlobalResourceBundle(Properties props) {
		  this.props=props;
	}
	
	public static GlobalResourceBundle getBundle(String[] baseNames,Locale locale)
	{
		GlobalResourceBundle global=null;
		ResourceBundle bundle=null;
        Properties props=null;
		props=new Properties();
		for(String baseName:baseNames)
		{
			bundle=ResourceBundle.getBundle(baseName,locale );
			Set<String> key=bundle.keySet();
			for(String keys:key)
			{
				props.put(keys, bundle.getString(keys));
				
			}
		}
		global=new GlobalResourceBundle(props);
		return global;
	}	
	public String getMessage(String key)
	{
		
		return props.getProperty(key);
	}
}
