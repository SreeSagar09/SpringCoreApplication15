package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.app.Employee;
import com.app.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee ssEmployee1 = (Employee) applicationContext.getBean("getSingletonSingletonEmployee");
		Employee ssEmployee2 = (Employee) applicationContext.getBean("getSingletonSingletonEmployee");
		Employee ssEmployee3 = (Employee) applicationContext.getBean("getSingletonSingletonEmployee");
		System.out.println("Super class - singleton & sub class - singleton");
		System.out.println(System.identityHashCode(ssEmployee1)+" & "+System.identityHashCode(ssEmployee1.getAddress()));
		System.out.println(System.identityHashCode(ssEmployee2)+" & "+System.identityHashCode(ssEmployee2.getAddress()));
		System.out.println(System.identityHashCode(ssEmployee3)+" & "+System.identityHashCode(ssEmployee3.getAddress()));
		
		Employee spEmployee1 = (Employee) applicationContext.getBean("getSingletonPrototypeEmployee");
		Employee spEmployee2 = (Employee) applicationContext.getBean("getSingletonPrototypeEmployee");
		Employee spEmployee3 = (Employee) applicationContext.getBean("getSingletonPrototypeEmployee");
		System.out.println("Super class - singleton & sub class - prototype");
		System.out.println(System.identityHashCode(spEmployee1)+" & "+System.identityHashCode(spEmployee1.getAddress()));
		System.out.println(System.identityHashCode(spEmployee2)+" & "+System.identityHashCode(spEmployee2.getAddress()));
		System.out.println(System.identityHashCode(spEmployee3)+" & "+System.identityHashCode(spEmployee3.getAddress()));
		
		Employee psEmployee1 = (Employee) applicationContext.getBean("getPrototypeSingletonEmployee");
		Employee psEmployee2 = (Employee) applicationContext.getBean("getPrototypeSingletonEmployee");
		Employee psEmployee3 = (Employee) applicationContext.getBean("getPrototypeSingletonEmployee");
		System.out.println("Super class - prototype & sub class - singleton");
		System.out.println(System.identityHashCode(psEmployee1)+" & "+System.identityHashCode(psEmployee1.getAddress()));
		System.out.println(System.identityHashCode(psEmployee2)+" & "+System.identityHashCode(psEmployee2.getAddress()));
		System.out.println(System.identityHashCode(psEmployee3)+" & "+System.identityHashCode(psEmployee3.getAddress()));
		
		Employee ppEmployee1 = (Employee) applicationContext.getBean("getPrototypePrototypeEmployee");
		Employee ppEmployee2 = (Employee) applicationContext.getBean("getPrototypePrototypeEmployee");
		Employee ppEmployee3 = (Employee) applicationContext.getBean("getPrototypePrototypeEmployee");
		System.out.println("Super class - prototype & sub class - prototype");
		System.out.println(System.identityHashCode(ppEmployee1)+" & "+System.identityHashCode(ppEmployee1.getAddress()));
		System.out.println(System.identityHashCode(ppEmployee2)+" & "+System.identityHashCode(ppEmployee2.getAddress()));
		System.out.println(System.identityHashCode(ppEmployee3)+" & "+System.identityHashCode(ppEmployee2.getAddress()));
		
	}
}
