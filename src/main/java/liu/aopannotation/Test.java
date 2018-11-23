package liu.aopannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac=new AnnotationConfigApplicationContext(SchoolAspect.class);
		School school=(School)ac.getBean("student");
		school.peClass(new Teacher("体育老师"));
	}

}
