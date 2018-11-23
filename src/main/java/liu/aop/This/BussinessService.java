package liu.aop.This;

import org.springframework.stereotype.Component;

@Component
public class BussinessService implements IBussinessService {

	public String doBussiness() {
		System.out.println("doBussiness executed");
		return "success";
	}
	
	public String doAnother() {
		System.out.println("doAnother executed");
		return "success";
	}

}
