package init.disposal;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Demo implements InitializingBean,DisposableBean {
	static {
		System.out.println("Demo class has been loaded into JVM");
	}
	public Demo() {
System.out.println("Demo Object is getting created");
}
	public void destroy() throws Exception {
System.out.println("Demo Object is destroyed");		
	}
	public void afterPropertiesSet() throws Exception {
System.out.println("Demo object is initialized");		
	}
	

}
