package org.jsp.springboot.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarTest {

	public static void main(String[] args) {

		ApplicationContext context=new AnnotationConfigApplicationContext("org.jsp.springboot.annotation");
		Car c=context.getBean(Car.class);
		c.start();
	}

}
