package com.eh.beans;

import org.springframework.context.ApplicationEvent;

public class ReloadEvent extends ApplicationEvent{
	private String tableName;
	
  public ReloadEvent(Object source/*,String tableName*/) {
		super(source);
		//this.tableName=tableName;
		System.out.println("ReloadEventApp");
	}

public void setTableName(String tableName) {
	this.tableName = tableName;
}

public String getTableName() {
	return tableName;
}

}
