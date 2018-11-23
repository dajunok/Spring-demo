package liu.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("/liulijun/spring-mobil.xml");
		Mobil mobil=(Mobil)ac.getBean("mobil");
		mobil.printMobil();
	}

}
