package liu.aopAdvice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AdviceAspect {
	//匹配com.abc.service下的类中以before前缀开头的方法
	@Before("execution(* liu.aopAdvice.*.befor*(..))")
	public void permissionCheck() {
		System.out.println("模拟权限检查！");
	}

}
