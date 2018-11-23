package liu.propertyplaceholder;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GenerateProperty {

	public static void main(String[] args) throws IOException {
/*		//创建属性文件
		Properties settings=new Properties();
		settings.put("roleName", "角色名称");
		settings.put("roleCode", "角色代码");
		settings.put("userName", "用户名称");
		settings.put("userAge", "30");
		FileOutputStream out=new FileOutputStream("D:\\Java\\imoocwork\\Spring-Demo\\src\\main\\java\\liu\\PropertyPlaceholder\\placeholder.properties");
		settings.store(out, "Book Properties");*/
		
/*		//创建属性文件db.Properties
		Properties settings=new Properties();
		settings.put("driveClass", "0");
		settings.put("url", "1");
		settings.put("userName", "2");
		settings.put("password", "3");
		FileOutputStream out=new FileOutputStream("D:\\Java\\imoocwork\\Spring-Demo\\src\\main\\java\\liu\\PropertyPlaceholder\\db.properties");
		settings.store(out, "DB Properties");*/
		
		//创建属性文件app.Properties
		Properties settings=new Properties();
		settings.put("disc.title", "Sgt. Peppers Lonely Hearts Club Band");
		settings.put("disc.artist", "The Beatles");
		FileOutputStream out=new FileOutputStream("F:\\SpringSource\\workspace\\Spring-Demo\\src\\main\\java\\liu\\spelwiringbean\\app.properties");
		settings.store(out, "App Properties");		

	}

}
