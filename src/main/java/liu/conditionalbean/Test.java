package liu.conditionalbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Person person = (Person)context.getBean("person");
        System.out.println(person.getAnimal().getName());
	}

}
