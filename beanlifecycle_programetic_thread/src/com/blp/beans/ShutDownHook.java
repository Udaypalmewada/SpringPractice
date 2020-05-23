package com.blp.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class ShutDownHook extends Thread 
{ 
	private BeanFactory beanFactory;
	private ConfigurableListableBeanFactory factory;
	
  public BeanFactory getBeanFactory() {
		return beanFactory;
	}

	public void setBeanFactory(BeanFactory beanFactory) {
		this.beanFactory = beanFactory;
	}

public static void main(String[] args) 
  { ShutDownHook sh=new ShutDownHook();
  
    Runtime.getRuntime().addShutdownHook(new Thread(sh) 
    { 
      public void run() 
      { 
    	 
        System.out.println("Shutdown Hook is running !"); 
      } 
    }); 
    System.out.println("Application Terminating ..."); 
  } 
} 
