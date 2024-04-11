package com.example.AnnotationBased.Beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("Deepak")
	private String name;
	@Value("101")
	private int rollnumber;
	@Value("Deepak@gmail.com")
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollnumber=" + rollnumber + ", email=" + email + "]";
	}
	
	
	
}
