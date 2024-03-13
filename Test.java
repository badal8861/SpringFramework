package initdestroymethods;

public class Test {
static {
	System.out.println("test class loaded into jvm memory");
}
public Test() {
System.out.println("test object is getting created");
}
public void hii() {
System.out.println("hii from test class");

}
public void byee() {
	System.out.println("byee from test class");
}
}
