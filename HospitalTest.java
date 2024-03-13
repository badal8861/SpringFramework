package org.jsp.springboot.init.annotation1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HospitalTest {

	public static void main(String[] args) {

		ApplicationContext context=new AnnotationConfigApplicationContext("org.jsp.springboot.init.annotation1");
		Hospital h=context.getBean(Hospital.class);
		h.display();
	}

}
