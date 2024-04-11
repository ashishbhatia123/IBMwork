package com.example.XMLtoJavaBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.XMLtoJavaBasedConfiguration.Beans.Student;
import com.example.XMLtoJavaBasedConfiguration.Configuration.JavaConfiguration;



public class MainClass {

	public static void main(String[] args) {
		String configLoc = "com/example/XMLtoJavaBasedConfiguration/Configuration/JavaConfiguration.java";
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		Student std1 =context.getBean("stdobj1",Student.class);
		System.out.println(std1);
		
		Student std2 =context.getBean("stdobj2",Student.class);
		System.out.print(std2);
	}

}
