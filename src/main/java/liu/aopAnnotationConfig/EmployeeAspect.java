package liu.aopAnnotationConfig;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;

/**
* 定义一个切面
* 
* @Aspect 该注解表示这个类就是一个切面了
*/
@Aspect
public class EmployeeAspect {
	/**
     * 定义一个切点，通知aop什么时候启动拦截并织入对应流程
     *  注意以下几点： 
     * 1、方法返回类型＊ 和方法之间有空格
     * 2、在下面的四个方法中引用这个切点时方法名要加括号
     * 3、execution正则表达式中的方法就是一个连接点，将代理对象和切面相连,如果不定义这个连接点，则不会将代理对象的方法和切面相连
     *   DeclareParents注解用于引入其他类功能来完善被织入的类
     * 	1、value＝"liu.aopAnnotationConfig.EmployeeCheckServiceImpl+" 表示对类EmployeeServiceImpl进行增强，有了这个定义之后，
     * 		就能将EmployeeServiceImpl类强制转化成要引入的类型了，可以理解为让EmployeeServiceImpl实现了EmployeeCheckService接口，毕竟看这个注解的名称就是让属性成为注解值的接口嘛！
     * 	2、defaultImpl代表它默认的实现类
     * 
     */
	//定义一个EmployeeCheckService类的成员变量作为引入对象,目标类EmployeeService后面的 “+” 号，表示只要是EmployeeService及其子类都可以添加新的方法
	@DeclareParents(value="liu.aopAnnotationConfig.EmployeeService+",defaultImpl=EmployeeCheckServiceImpl.class)
	public EmployeeCheckService employeeCheckService;  //新增功能对应的接口
	
	
	@Pointcut("execution(* liu.aopAnnotationConfig.EmployeeServiceImpl.getEmployeeInfo(..))")
	public void getInfo() {}  //Pointcut切点签名
	
	@Around("getInfo()")
	public void around(ProceedingJoinPoint pjp) {
		System.out.println("around before...");
		try {
			pjp.proceed();
		}catch (Throwable e) {
			System.out.println(e.getLocalizedMessage());
		}
		System.out.println("around after...");
	}
	
	//这些参数就是通过连接点方法传进去的，比如之前的连接点方法getEmployeeInfo(Employee employee);它里面有一个参数，现在我想把这个参数只传递给前置通知before，那么此时before的切点就不能引用公共方法，而是重写自己的，并传入参数
	@Before("execution(* liu.aopAnnotationConfig.EmployeeServiceImpl.getEmployeeSex(..)) && args(employee)")
	public void before(Employee employee) {
		System.out.println("before:代理方法执行之前，username："+employee.getUserName());
	}
	
	@After("getInfo()")
	public void after() {
		System.out.println("after:代理方法执行完毕");
	}
	
	@AfterReturning("getInfo()")
	public void afterReturning() {
		System.out.println("afterReturning：代理方法执行完毕，执行成功");
	}
	
	@AfterThrowing("getInfo()")
	public void afterThrowing() {
		System.out.println("afterThrowing：代理方法执行完毕，执行过程出现异常");
	}
	
	
}




















