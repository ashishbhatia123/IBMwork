package com.example.XMLConfiguration.Main;


import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.XMLConfiguration.Beans.Student;


public class MainClass {

	

		public static void main(String[] args) {
			
			String configLoc = "/com/example/XMLConfiguration/Configuration/Xmlconfigurationfile.xml";
			ApplicationContext context = new ClassPathXmlApplicationContext(configLoc);
			Student std1 =(Student) context.getBean("stdobj1");
			System.out.println(std1.toString());
		}
		
	
}
