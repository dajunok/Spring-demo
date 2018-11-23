package liu.aopAfterThrowing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/liu/aopAfterThrowing/spring-aopafterthrowing.xml");
		AdviceManager manager=context.getBean(AdviceManager.class);
		manager.afterThrowing();
		
	}

}
