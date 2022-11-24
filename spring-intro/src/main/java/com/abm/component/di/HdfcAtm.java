package com.abm.component.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hdfc")
public class HdfcAtm implements Atm {
	
	@Autowired
	private Bank bank;
	public void withdraw(int acno, double amount) {
		System.out.println("User at HDFCBANK wanting to withdra "+ amount);
		bank.withdraw(121, acno, amount);
		
	}

}
