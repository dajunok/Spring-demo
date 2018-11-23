package liu.aopAdvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings({ "resource" })
		ApplicationContext context=new ClassPathXmlApplicationContext("/liu/aopAdvice/spring-aopadvice.xml");
		AdviceManager manager=context.getBean(AdviceManager.class);
		manager.beforAddvice();
	}

}
