package liu.propertysourcewiringbean;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(ExpressiveConfig.class);
		Book bk=(Book)ctx.getBean("book");
		System.out.println(bk.toString());
	}
}
