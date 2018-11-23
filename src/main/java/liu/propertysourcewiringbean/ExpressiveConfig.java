package liu.propertysourcewiringbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/liu/propertysourcewiringbean/book.properties")
public class ExpressiveConfig {
	@Autowired
	Environment env;
	
	public boolean authorExists =env.containsProperty("author"); //判断author属性是否存在
	public String[] profiles=env.getDefaultProfiles(); //返回默认profile名称的数组
	
	
	@Bean("book")
	public Book  book() {
		return new Book(env.getProperty("bookName"), 
				env.getProperty("copyright"), 
				env.getProperty("author"), 
				env.getProperty("page",Integer.class));
		
	}

}
