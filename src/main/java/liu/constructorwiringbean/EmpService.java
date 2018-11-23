package liu.constructorwiringbean;

public class EmpService {
	@SuppressWarnings("unused")
	private Emp emp;	
	public EmpService(Emp emp) {
		System.out.println("contructor wire...");
		this.emp=emp;
	}
	

}
