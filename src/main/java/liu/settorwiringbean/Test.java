package liu.settorwiringbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring-settorwiringbean.xml");
		Family family=(Family)ac.getBean("family");
		System.out.println(family.toString());
	}

}
