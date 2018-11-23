package liu.aopannotation;

import org.springframework.stereotype.Component;

public class Teacher {
	private String name;
	
	public Teacher(String name) {
		this.name=name;
	}
	
	@Override
	public String toString() {
		return name;
	}

}
