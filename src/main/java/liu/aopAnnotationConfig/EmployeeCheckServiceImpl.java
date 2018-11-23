package liu.aopAnnotationConfig;

import org.springframework.stereotype.Component;

@Component
public class EmployeeCheckServiceImpl implements EmployeeCheckService {

	public boolean isPass(Employee employee) {
		return employee !=null;
	}

}
