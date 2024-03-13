package initdestroymethods;

public class Test2 {
	static {
		System.out.println("test2 class loaded into jvm memory");
	}
	public Test2() {
	System.out.println("test2 object is getting created");
	}
	public void hii() {
	System.out.println("hii from test2 class");

	}
	public void byee() {
		System.out.println("byee from test2 class");
	}
	}
