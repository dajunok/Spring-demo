package liu.aopannotation;

import org.springframework.stereotype.Component;

@Component("student")
public class Student implements School{

	public Integer peClass(Teacher teacher) {
		System.out.println(teacher.toString());
		return 10;
	}


	public Integer mathClass(Teacher teacher) {
		System.out.println(teacher.toString());
		return 20;
	}

	public Integer physicsClass(Teacher teacher) {
		System.out.println(teacher.toString());
		return 30;
	}

	public Integer chineseClass(Teacher teacher) {
		System.out.println(teacher.toString());
		return 40;
	}

	public Integer englishClass(Teacher teacher) {
		System.out.println(teacher.toString());
		return 50;
	}

	public void meeting(String meetingName, String address) {
		System.out.println(meetingName+"  "+address);		
	}
	
}
