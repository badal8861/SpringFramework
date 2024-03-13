package initdestroymethods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("testt.xml");
		Test t=context.getBean("test", Test.class);
		((ClassPathXmlApplicationContext)context).close();
	}
}
