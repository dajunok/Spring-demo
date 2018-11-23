package liu.constructorarg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac=new ClassPathXmlApplicationContext("/liu/constructorarg/spring-constructorargue.xml");
		Student student=(Student)ac.getBean("student");
		System.out.println(student.toString());
	}

}
