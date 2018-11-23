package liu.aopannotation;



import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages="liu.aopannotation")
@Aspect
public class SchoolAspect {
	@Pointcut("execution(* liu.aopannotation.School.peClass(..)) && args(Teacher)")
	public void AspectSh() {}
	
	@Before("AspectSh()")
	public void sayhello() {
		System.out.println("Good morning teacher...");
	}
	
	
}
