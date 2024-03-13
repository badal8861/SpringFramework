package Primary_Qualifier_Annotations;

import org.springframework.stereotype.Component;

@Component(value="train")
public class Train implements Vehicle {

	public void start() {

		System.out.println("train is started");
	}
	

}
