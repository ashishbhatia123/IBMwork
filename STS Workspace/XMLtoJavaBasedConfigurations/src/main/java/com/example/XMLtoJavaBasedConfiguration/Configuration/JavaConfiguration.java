package com.example.XMLtoJavaBasedConfiguration.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.XMLtoJavaBasedConfiguration.Beans.Student;

@Configuration
public class JavaConfiguration {

	
	@Bean
	public Student stdobj1()
	{
		Student std = new Student();
		std.setName("Deepak");
		std.setRollnumber(1);
		std.setEmail("Deepak@gmail.com");
		return std;
		
	}
	
	@Bean("stdobj2")
	public Student anymethodname() 
	{
		Student std = new Student();
		std.setName("Deepak");
		std.setRollnumber(1);
		std.setEmail("Deepak@gmail.com");
		return std;
	}
	
}
