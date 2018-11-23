package liu.aop.target;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**target()切点函数通过判断目标类是否按类型匹配指定类来决定连接点是否匹配. 用于匹配当前目标对象类型的执行方法；
 * 注意是目标对象的类型匹配，这样就不包括引入接口也类型匹配；
 * 
 * target()和this()两者都仅接受类名的入参，虽然类名可以带“+”，但是对于这两个函数来讲，使用或者不是用，效果完全相同。
 * 如果有多个切面，注意多切面织入的顺序，如果不加织入的顺序， doTransport 方法的切面无法织入。
 */

@Aspect
public class TargetAspect {
	@AfterReturning("target(liu.aop.target.IBussinessService)")
	public void crossCuttingCode() {
		System.out.println("some logic is here");
	}
}
