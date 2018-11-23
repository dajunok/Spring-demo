package liu.aop.annotationArgs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**通过判别目标方法运行时入参对象类是否标注特定注解来指定连接点。如@args(com.yuan.advice.args.PrintArgs) 
 * 表示任何一个目标方法，如果方法入参类标注了PrintArgs注解，该方法就会被拦截。
 * @annotation表示标注了某个注解的所有方法。
 */

@Component
public class ArgsModel { //目标类
	Logger logger=LoggerFactory.getLogger(ArgsModel.class);
	public void testArgs(ParentModel parentModel) { //入参对象类：ParentModel
		logger.info("入参为{}",parentModel);
	}
	
	@PrintArgs
	public void stringArgs(String name) { 
		logger.info("方法上面注解{}",PrintArgs.class.getName());
	}

}
