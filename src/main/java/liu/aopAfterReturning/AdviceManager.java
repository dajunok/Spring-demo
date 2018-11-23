package liu.aopAfterReturning;

import org.springframework.stereotype.Component;

@Component
public class AdviceManager {
	//将被AfterReturningAdviceTest的log方法匹配
	public String afterAdvice() {
		System.out.println("目标方法：afterAdvice()");
		return "我是目标类AdviceManager的afterAdvice()方法返回值";
	}
}
