package liu.aop.This;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private ApplicationContext context;
	
	@org.junit.Test
	public void testThis() {
		context=new ClassPathXmlApplicationContext("classpath:/liu/aop/This/spring-aopthis.xml");
		BussinessService bussinessService=(BussinessService)context.getBean("bussinessService");
		
		//匹配this
		bussinessService.doBussiness();
		bussinessService.doAnother();
		
		((ITransportService)bussinessService).doTransport();
	}

}
