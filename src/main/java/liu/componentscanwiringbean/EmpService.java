package liu.componentscanwiringbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
@ImportResource("/liu/componentscanwiringbean/spring-componentscan.xml")
public class EmpService {
	@Qualifier("eDao")
	@Autowired(required=false)
	private Emp emp;
	
	@Bean
	@Qualifier("uDao")   //自定义限定符
	public UserDao userDao() {
		return new UserDao();
	}
	
	@Bean
	@Qualifier("eDao")   //自定义限定符
	public EmpDao empDao() {
		return new EmpDao();
	}
}
