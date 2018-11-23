package liu.aopAfterThrowing;

import org.springframework.stereotype.Component;

@Component
public class AdviceManager {
	//将被AfterThrowingAdviceTest的handleException方法匹配
	// 需要注意的是：如果一个异常在程序内部已经处理，那么Spring AOP将不会处理该异常。只有当目标方法抛出一个未处理的异常时，该异常将会作为对应的形参传给增强处理的方法
	public void afterThrowing() {
		System.out.println("方法： afterThrowing");
		try{
			int a=10/0;			
		}catch (ArithmeticException ae) {
			System.out.println("算术异常已处理");
		}
		String s=null;
		System.out.println(s.substring(0, 3));
	}
}
