package org.jsp.springboot.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BabyIceCreamTest {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("baby.xml");
		Baby b=context.getBean("baby",Baby.class);
		b.getIceCream().eat();
		
	}

}
