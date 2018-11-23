package liu.aopAfterReturning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings({ "resource" })
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/liu/aopAfterReturning/spring-aopAfterReturning.xml");
		AdviceManager manager=context.getBean(AdviceManager.class);
		manager.afterAdvice();
	}

}
