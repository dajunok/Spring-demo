package liu.spelwiringbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("/liu/spelwiringbean/spring-spelconfig.xml");
		BlankDisc blankDisc=(BlankDisc)ac.getBean("blankdisc");
		System.out.println(blankDisc.getTitle()+blankDisc.getArtist());
		
		ApplicationContext context=new ClassPathXmlApplicationContext("/liu/spelwiringbean/spring-poem.xml");
		User user=(User)context.getBean("user");
		user.printUser();
	}

}
