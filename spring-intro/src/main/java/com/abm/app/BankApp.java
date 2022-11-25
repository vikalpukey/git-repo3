package com.abm.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abm.component.HelloWorld;
import com.abm.component.di.HdfcAtm;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("my-spring-config.xml");
		HdfcAtm hd = (HdfcAtm) ac.getBean("hdfc");
		hd.withdraw(121, 150);
		
		//HelloWorld hw = (HelloWorld) ac.getBean("hello");
		System.out.println("Done form orignal");
		System
		.out.println("Done form orignal");
	
	}

}
