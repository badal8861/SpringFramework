package spring;

public class User {

	private long phone;
	private String password;
	
	public User() {
System.out.println("no-arg consructor from user class");
	}
	
	public void display() {
		System.out.println("phone number:"+phone);
		System.out.println("password:"+password);
	}

	public User(long phone, String password) {
		this.phone = phone;
		this.password = password;
		System.out.println("parameterized constructor from user");
	}
	
}
