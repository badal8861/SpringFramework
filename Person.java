package org.jsp.springboot.init.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
@Value(value="25")
	private int age;
	private String name;
	
	public void display() {

		System.out.println("Age:"+age);
		System.out.println("Name:"+name);
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	@Value(value="Badal")
	public void setName(String name) {
		this.name = name;
	}
	
}
