package liu.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
/*	@org.junit.Test
	public void run() {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("/liu/demo/spring.xml");
		ac.getBean("empService");
	}*/
	
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("/liu/demo/spring.xml");
		EmpService es=(EmpService)ac.getBean("empService");
	}
}
