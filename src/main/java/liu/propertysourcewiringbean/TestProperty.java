package liu.propertysourcewiringbean;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperty {

	public static void main(String[] args) throws IOException {
		Properties settings=new Properties();
		settings.put("bookName", "Spring实战");
		settings.put("copyright", "人民邮政出版社出版");
		settings.put("author", "Craig Walls");
		settings.put("page", "312");	
		FileOutputStream out=new FileOutputStream("D:\\Java\\imoocwork\\Spring-Demo\\src\\main\\java\\liu\\propertysourcewiringbean\\book.properties");
		settings.store(out, "Book Properties");

	}

}
