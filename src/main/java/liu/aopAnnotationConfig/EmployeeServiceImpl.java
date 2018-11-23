package liu.aopAnnotationConfig;

import org.springframework.stereotype.Component;

@Component
public class EmployeeServiceImpl implements EmployeeService {

	public void getEmployeeInfo(Employee employee) {
		System.out.println("name:"+employee.getUserName()+";sex:"+employee.getSex());

	}

	public void getEmployeeSex(Employee employee) {
		System.out.println("性别："+employee.getSex());

	}

}
