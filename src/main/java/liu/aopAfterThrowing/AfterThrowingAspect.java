package liu.aopAfterThrowing;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterThrowingAspect {
	@AfterThrowing(throwing="ex",pointcut="execution(* liu.aopAfterThrowing.*.afterThrow*(..))")
	public void handleException(Throwable ex) {
		System.out.println("目标方法抛出的异常："+ex);
		System.out.println("模拟异常处理");
	}
}
