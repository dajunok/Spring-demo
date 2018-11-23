package liu.aopAfterReturning;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterReturningAspect {
	//匹配com.abc.service下的类中以afterReturning开始的方法。returning="returnValue"用于获取目标方法中的返回值。这个参数值名称一定要和增强方法中的参数名称和参数顺序相同。
	@AfterReturning(returning="returnValue",pointcut="execution(* liu.aopAfterReturning.*.afterAdvice(..))")
	public void log(Object returnValue) {
		System.out.println("目标方法返回值： "+returnValue);
		System.out.println("模拟日志记录功能......");
	}

}
