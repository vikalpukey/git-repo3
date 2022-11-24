package com.abm.component.di;

import org.springframework.stereotype.Component;

@Component
public class IciciBank implements Bank{

	public void withdraw(int atmid, int acno, double amount) {
		// TODO Auto-generated method stu
		System.out.println("user of ICICIBANK "+ atmid+" wanting to withdraw "+amount);
		
	}

}
