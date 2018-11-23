package liu.aop.annotationArgs;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**通过判别目标方法运行时入参对象类是否标注特定注解来指定连接点。如@args(com.yuan.advice.args.PrintArgs) 
 * 表示任何一个目标方法，如果方法入参类标注了PrintArgs注解，该方法就会被拦截。
 */

@Component
@Aspect
@Order(-1)
public class ArgsAspect {
	Logger logger = LoggerFactory.getLogger(ArgsAspect.class);
	
	@Before("@annotation(liu.aop.annotationArgs.PrintArgs) || @args(liu.aop.annotationArgs.PrintArgs))")  // or 
	public void printArgs(JoinPoint joinPoint) {
		logger.info("{},此方法入参对象类或方法上面标注了@PrintArgs注解",joinPoint.getSignature());
	}

}
