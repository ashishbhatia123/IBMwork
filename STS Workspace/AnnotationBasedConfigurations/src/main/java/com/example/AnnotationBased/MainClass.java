package com.example.AnnotationBased;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.AnnotationBased.Beans.Student;
import com.example.AnnotationBased.Configuration.JavaConfiguration;


public class MainClass {

	public static void main(String[] args) {
		//String configLoc = "com/example/Main/Configuration/Xmlconfigurationfile.xml";
		//ApplicationContext context = new ClassPathXmlApplicationContext(configLoc);
		
		
		String configLoc = "com/example/Main/Configuration/Xmlconfigurationfile.xml";
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		
		Student std1 =(Student) context.getBean("student");
		System.out.println(std1.toString());
		
		
	}

}

