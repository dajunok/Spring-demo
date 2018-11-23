package liu.componentscanwiringbean;


import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
//@Scope(scopeName="ConfigurableBeanFactory.SCOPE_PROTOTYPE")
@Scope(value="ConfigurableBeanFactory.SCOPE_SINGLETON",
	   proxyMode=ScopedProxyMode.INTERFACES)
public class EmpDao implements Emp {
	public void play() {
		System.out.println("EmpDao:play...");

	}

}
