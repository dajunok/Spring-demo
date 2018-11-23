package liu.aopAnnotationConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	@org.junit.Test
	public void testAopByConfig() {
		@SuppressWarnings("resource")
		ApplicationContext context=new AnnotationConfigApplicationContext(AspectConfig.class);
		// 要获取真实对象bean，必须要在类上使用Componetn注解
		EmployeeService es=(EmployeeService)context.getBean(EmployeeService.class); //由于使用了接口，系统会通过JDK动态代理,所以此处不能使用EmployeeServiceImpl.class
		Employee employee=(Employee) context.getBean("employee");
		
		//把目标类强制转换为引用对象，然后调用引用对象的方法isPass()
		EmployeeCheckService ecs=(EmployeeCheckService) es;
		if(ecs.isPass(employee)) {
			es.getEmployeeInfo(employee);
			es.getEmployeeSex(employee);
		}
		employee=null;
		if(ecs.isPass(employee)) {
			es.getEmployeeInfo(employee);
			es.getEmployeeSex(employee);
		}
	}
}
