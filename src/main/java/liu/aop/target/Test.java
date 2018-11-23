package liu.aop.target;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private ApplicationContext context;
	
	@org.junit.Test
	public void testTarget() {
		context=new ClassPathXmlApplicationContext("classpath:/liu/aop/target/spring-aoptarget.xml");
		BussinessService bussinessService=context.getBean("bussinessService",BussinessService.class);
		
		bussinessService.doSomething();
		
	}

}
