package contructorInj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPanCad {

public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("pancard.xml");
	PanCardHolder p=context.getBean("myPerson",PanCardHolder.class);
	p.getP().display();
}
}
