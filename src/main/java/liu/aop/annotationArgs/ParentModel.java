package liu.aop.annotationArgs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**通过判别目标方法运行时入参对象类是否标注特定注解来指定连接点。如@args(com.yuan.advice.args.PrintArgs) 
 * 表示任何一个目标方法，如果方法入参类标注了PrintArgs注解，该方法就会被拦截。
 */

@Component
@PrintArgs(name="parmentModel")
public class ParentModel {
	Logger logger =LoggerFactory.getLogger(ParentModel.class);
	
	public void methodA(String hello) {
		logger.info("parmentModel method");
	}

}
