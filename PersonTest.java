package org.jsp.springboot.init.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonTest {

	public static void main(String[] args) {

		ApplicationContext context=new AnnotationConfigApplicationContext("org.jsp.springboot.init.annotation");
		Person p=context.getBean(Person.class);
		p.display();
		
	}

}
