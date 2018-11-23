package liu.annotationwiringbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac=new ClassPathXmlApplicationContext("/liu/annotationwiringbean/spring-annotation.xml");
		EmpService es=(EmpService)ac.getBean("empService");
		es.play();

	}

}
