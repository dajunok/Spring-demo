package liu.demo;

public class EmpService {
	private EmpDao empDao;
	
	public void setEmpDao(EmpDao empDao) {
		System.out.println("EmpService --> EmpDao");
		this.empDao = empDao;
	}
	
}
