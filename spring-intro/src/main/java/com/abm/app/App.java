package com.abm.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abm.component.Calculator;
import com.abm.component.Hello2;
import com.abm.component.HelloWorld;

public class App {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("my-spring-config.xml");
		for(int i=0; i<5; i++) {
			 HelloWorld hw = (HelloWorld) ac.getBean("hello");
			 System.out.println(hw.sayHello("Vikalp"));
		}
       
       Hello2 h2 = (Hello2) ac.getBean("hello2");
       System.out.println(h2.bolna("Dharmesh"));
        
        
        Calculator cc = (Calculator) ac.getBean("calc");
       cc.add(10, 20);
       cc.sub(10, 20);
       
       System.out.println("done from 2nd");
       System
       .out.println("done from 2nd");
      
   
	}

}
