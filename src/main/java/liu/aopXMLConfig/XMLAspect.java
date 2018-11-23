package liu.aopXMLConfig;

import org.aspectj.lang.ProceedingJoinPoint;

public class XMLAspect {  //定义一个切面，没有任何注解，需要在XML中进行配置
	    // 引入增强类
	    public CheckExistImp checkExistImp;

	    public void before(CoderProject pro) {
	        System.out.println("项目名称：　" + pro.getProjectName() + "before...");
	    }

	    public void around(ProceedingJoinPoint pjp) {
	        System.out.println("around before...");
	        try {
	            pjp.proceed();
	        } catch (Throwable e) {
	            e.printStackTrace();
	        }
	        System.out.println("around after...");
	    }

	    public void after() {
	        System.out.println("after...");
	    }

	    public void afterThrowing() {
	        System.out.println("afterThrowing...");
	    }

	    public void afterReturning() {
	        System.out.println("afterReturning...");
	    }
}	


