package com.abm.component;

import org.springframework.stereotype.Component;

@Component("calc") //altenative to <bean id="calc" class "..Calculator"
public class Calculator {
	public void add(int a, int b) {
		System.out.println(a+b);
		
	}
	public void sub(int a, int b) {
		System.out.println(a-b);
		
	}


}
