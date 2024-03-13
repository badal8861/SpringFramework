package contructorInj;

public class PanCard {

	private String number;
	private String name;
	
	public void setNumber(String number) {
		this.number=number;
	}
	public String getNumber() {
		return number;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
	return name;
	}
	public void display()
	{
		System.out.println(" pan number is "+ number);
		System.out.println(" pan card name is "+name);
	}
}

