package com.cdi.beans;

import java.util.List;

public class Team {
	private String projectname;
	private List<String>mamber;
	
	
	public List<String> getMamber() {
		return mamber;
	}
	public void setMamber(List<String> mamber) {
		this.mamber = mamber;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	@Override
	public String toString() {
		return "Team [projectname=" + projectname + ", mamber=" + mamber + "]";
	}
	
	
	}
