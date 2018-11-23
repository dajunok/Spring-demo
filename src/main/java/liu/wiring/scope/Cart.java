package liu.wiring.scope;


import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**Bean的作用域
 * Spring定义了多种作用域， 可以基于这些作用域创建bean， 包括：
 * ●单例（ "singleton"） ： 在整个应用中， 只创建bean的一个实例。
 * ●原型（ "prototype"） ： 每次注入或者通过Spring应用上下文获取的时候 都会创建一个新的bean实。
 * ●会话（ "session"） ： 在Web应用中， 为每个会话创建一个bean实例。
 * ●请求（ "request"） ： 在Web应用中， 为每个请求创建一个bean实例
 * 代理模型：
 * ●ScopedProxyMode.TARGET_CLASS  ：适应于Cglib动态代理
 * ●ScopedProxyMode.INTERFACES	：适应于JDK动态代理，需要使用接口
 */

@Component("cart")
@Scope(value="singleton",proxyMode =ScopedProxyMode.TARGET_CLASS)
public class Cart {
	public void  addGoods() {
		System.out.println("添加商品");
	}
	
}
