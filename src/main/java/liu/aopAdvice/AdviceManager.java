package liu.aopAdvice;

import org.springframework.stereotype.Component;

@Component
public class AdviceManager {
	public void beforAddvice() {
		//这个方法将被BeforeAdviceTest类的permissionCheck匹配到
		System.out.println("目标方法：beforAddvice ");
	}

}
