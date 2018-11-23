package liu.aopAnnotationConfig;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/*
 * 定义一个配置类，通过java配置的方式获取切面
 */
@Configurable
@ComponentScan(basePackages="liu.aopAnnotationConfig")
@EnableAspectJAutoProxy  //自动代理，代替了动态代理的实现
public class AspectConfig {
	@Bean
	public EmployeeAspect getAspect() {
		return new EmployeeAspect();
	}
	
	@Bean("employee")
	public Employee getEmployee(@Value("#{'张三'}")String userName,@Value("#{'男'}")String sex) {
		Employee employee=new Employee();
		employee.setUserName(userName);
		employee.setSex(sex);
		return employee;		
	}
	
}
