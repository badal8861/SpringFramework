package Primary_Qualifier_Annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value="Bike")
@Primary
public class Bike implements Vehicle{

	public void start() {

		System.out.println("Bike is started");
	}
	

	
}
