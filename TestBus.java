package autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBus {

	public static void main(String[] args) {

		ApplicationContext context=new AnnotationConfigApplicationContext("autowired");
		Bus b=context.getBean(Bus.class);
		b.getE().start();
	}

}
