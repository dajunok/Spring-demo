package liu.componentscanwiringbean;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=EmpService.class)
public class Test {
	@Autowired
	@Qualifier("uDao")
	private Emp emp;

	@org.junit.Test
	public void play() {
		emp.play();
	}


}
