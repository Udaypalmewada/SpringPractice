package com.eh.beans;

import org.springframework.context.ApplicationListener;

public class ReloadEventListen implements ApplicationListener<ReloadEvent>{

	@Override
	public void onApplicationEvent(ReloadEvent event) {
		//System.out.println("EventListener");
System.out.println("Data is reloading......"+event.getTableName());		
	}

}
