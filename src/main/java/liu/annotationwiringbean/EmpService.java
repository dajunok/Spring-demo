package liu.annotationwiringbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmpService {
	private Emp emp;
	
	@Autowired
	@Qualifier(value="userDao")
	public void setEmp(Emp emp) {
		System.out.println("annotation wire...");
		this.emp=emp;
	}
	
	public void play() {
		emp.play();
	}

}
