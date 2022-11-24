package com.abm.component;

import org.springframework.stereotype.Component;

@Component("splChck")
public class SpellCheaker {
	public void Check(String document) {
		System.out.println("Hello "+document);
	}

}
