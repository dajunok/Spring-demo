package liu.aop.This;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.core.Ordered;

/**Spring中提供了一个Ordered接口。
 * Ordered接口，顾名思义，就是用来排序的。
 * Spring是一个大量使用策略设计模式的框架，这意味着有很多相同接口的实现类，那么必定会有优先级的问题。
 * 于是，Spring就提供了Ordered这个接口，来处理相同接口实现类的优先级问题。
 * 如果有多个切面，注意多切面织入的顺序，如果不加织入的顺序， doTransport 方法的切面无法织入。
 */

@Aspect
public class AddTransportForBussinessAspect implements Ordered{
	// (1)value 为BussinessService添加接口实现, (2)defaultImpl要添加的接口的默认的接口实现类
	@DeclareParents(value="liu.aop.This.BussinessService+",defaultImpl=TransportService.class)
	public ITransportService iTransportService; // (3) 要实现的目标接口
	
	public int getOrder() {
		return 2;
	}

}
