package com.cm.beans;

import java.util.List;

public class course {
	private String courseName;
	private List<String>subject;
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public void setSubject(List<String> subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "course [courseName=" + courseName + ", subject=" + subject + "]";
	}

}
