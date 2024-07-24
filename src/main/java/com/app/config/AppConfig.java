package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.app.Address;
import com.app.Employee;

@Configuration
public class AppConfig {
	
	@Bean
	@Scope(value = "singleton")
	public Employee getSingletonSingletonEmployee() {
		Employee employee = new Employee(2002, "Mukesh", 29, "System Enginner", getSingletonAddress());
		
		return employee;
	}
	
	@Bean
	@Scope(value = "singleton")
	public Employee getSingletonPrototypeEmployee() {
		Employee employee = new Employee(2002, "Mukesh", 29, "System Enginner", getPrototypeAddress());
		
		return employee;
	}
	
	@Bean
	@Scope(value = "prototype")
	public Employee getPrototypeSingletonEmployee() {
		Employee employee = new Employee(2002, "Mukesh", 29, "System Enginner", getSingletonAddress());
		
		return employee;
	}
	
	@Bean
	@Scope(value = "prototype")
	public Employee getPrototypePrototypeEmployee() {
		Employee employee = new Employee(2002, "Mukesh", 29, "System Enginner", getPrototypeAddress());
		
		return employee;
	}
	
	@Bean
	@Scope(value = "singleton")
	public Address getSingletonAddress() {
		Address address = new Address("220-12/1", "Madhapur", "Hyderabad", "Telangana", "India", "506110");
		
		return address;
	}
	
	@Bean
	@Scope(value = "prototype")
	public Address getPrototypeAddress() {
		Address address = new Address("220-12/1", "Madhapur", "Hyderabad", "Telangana", "India", "506110");
		
		return address;
	}
	
}
