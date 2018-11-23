package liu.aop.target;

import org.springframework.stereotype.Component;

@Component
public class BussinessService implements IBussinessService{
	public String doSomething() {
		System.out.println("doSomething executed");
		return "success";
	}

}
