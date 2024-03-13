package springboot;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestCar {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("car.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		Car c=factory.getBean("mycar",Car.class);
		c.start();
		
	}
}
