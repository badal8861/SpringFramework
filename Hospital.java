package org.jsp.springboot.init.annotation1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hospital {

	private String name;
	private String founder;
	
	public Hospital(@Value (value="Forum") String name, @Value (value="Badal") String founder) {
		this.name = name;
		this.founder = founder;
	}
	
	public void display() {

		System.out.println("Name:"+name);
		System.out.println("Founder:"+founder);
		System.out.println("-----------------");
	}
	
	
}
