package liu.aop.This;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;

/**this()切点函数则通过判断代理类是否按类型匹配指定类来决定是否和切点匹配。 
 * 用于匹配当前AOP代理对象类型的执行方法；注意是AOP代理对象的类型匹配，这样就可能包括引入接口也类型匹配。 
 * this中使用的表达式必须是类型全限定名，不支持通配符。
 * this()和target()两者都仅接受类名的入参，虽然类名可以带“+”，但是对于这两个函数来讲，使用或者不是用，效果完全相同。
 * 
 */
@Aspect
public class ThisAspect implements Ordered {
	//织入任何运行期对象为ITransportService的Bean中
	@AfterReturning("this(liu.aop.This.ITransportService)")
	public void corssCuttingCode() {
		System.out.println("some logic is here \n ");
	}

	public int getOrder() {
		return 1;
	}

}
