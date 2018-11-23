package liu.aop.annotationArgs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/liu/aop/annotationArgs/spring-aopargs.xml");
		ArgsModel argsModel=(ArgsModel)context.getBean(ArgsModel.class);
		ParentModel parentModel=(ParentModel)context.getBean(ParentModel.class);
		
		argsModel.testArgs(parentModel);
		argsModel.stringArgs("zhangSan");
	}

}
