package org.jsp.springboot.controller;
import java.util.Scanner;

import org.jsp.springboot.dao.EmployeDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class EmployeeController {

	static Scanner sc=new Scanner(System.in);
	
	static EmployeDao dao;
	
static {
	ApplicationContext context=new ClassPathXmlApplicationContext("hibernate-template.xml");
	dao=context.getBean(EmployeDao.class);
}
	
	public static void main(String[] args) { 
	
	
		System.out.println("1. save employee");
		System.out.println("2. update employee");
		System.out.println("3. fetch employee");
		System.out.println("4. delete employee");
		System.out.println("5. find all employee");
	}
}
