package com.cm.beans;

import java.beans.ConstructorProperties;
import java.util.List;

public class course {
	private String courseName;
	private List<String>subject;
	@ConstructorProperties({"courseName","subject"})
	public course(String courseName, List<String> subject) {
		this.courseName = courseName;
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return "course [courseName=" + courseName + ", subject=" + subject + "]";
	}

}
