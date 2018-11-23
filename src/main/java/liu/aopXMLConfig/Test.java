package liu.aopXMLConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@org.junit.Test
	public void testAopByXml() {
		// 动态生成切面
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/liu/aopXMLConfig/spring-aopxml.xml");
		// 获取被代理对象
		CoderProjectService coderProjectService=(CoderProjectService)context.getBean("coderProjectService");
		// 获取项目类（参数）
		CoderProject project=(CoderProject)context.getBean("project");
		// 获取增强类（将被代理对象强制转化成增强类）
		CheckExist ce=(CheckExist)coderProjectService;
		if(ce.checkIsEmpty(project)) {
			coderProjectService.getProjectInfo(project);
		}else {
			System.out.println("被代理对象不能为空");
		}
	}

}
