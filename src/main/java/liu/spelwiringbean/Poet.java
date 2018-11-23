package liu.spelwiringbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Poet {
	private Poem poem;
	public void recite() {
		System.out.println("the poet begin to recite...");
		poem.perform();
	}
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/liu/spelwiringbean/spring-poem.xml");
		Poet poet=(Poet)context.getBean("poet");
		poet.recite();
		
		//Spring表达式解析器使用
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("'Hello World'.concat('!')");
		String message = (String) exp.getValue();
		System.out.println(message);
		
		exp=parser.parseExpression("new String('hello world').toUpperCase()");
		message=exp.getValue(String.class);
		System.out.println(message);
		
		exp=parser.parseExpression("T(java.lang.Math).abs(-1)");
		Integer value=exp.getValue(Integer.class);
		System.out.println(value);
	}
	
	public Poem getPoem() {
		return poem;
	}
	
	public void setPoem(Poem poem) {
		System.out.println("setpoem....");
		this.poem=poem;
	}
	
	
	

}
