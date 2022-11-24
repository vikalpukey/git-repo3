package com.abm.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abm.component.CarPart;
import com.abm.component.CarPartInventory;

public class CarPartTest {

	@Test
	public void test_adding_carpart() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		CarPartInventory cpinv = (CarPartInventory)ctx.getBean("carpart3");
		CarPart cp = new CarPart();
		cp.setPartName("  Light ");
		cp.setCarModel("JCB");
		cp.setPrice(15000);
		cp.setQuantity(2);
		cpinv.addNewPart(cp);
		
	}
	@Test
	public void fetch(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		CarPartInventory cpinv = (CarPartInventory)ctx.getBean("carpart5");
		List<CarPart> list =cpinv.getAvailableParts();
		for(CarPart cp: list) {
			System.out.println("----------------------");
		System.out.println("Car model :"+cp.getCarModel());
		System.out.println("Car part :"+cp.getPartName());
		System.out.println("part no :"+cp.getPartNo());
		System.out.println("Price :"+cp.getPrice());
		System.out.println("Quantity :"+cp.getQuantity());
		}
		
	}
	 

}
