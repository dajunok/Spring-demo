package liu.aopannotation;

public interface School {
	public Integer  peClass(Teacher teacher);  
	public Integer mathClass(Teacher teacher);
	public Integer physicsClass(Teacher teacher);
	public Integer chineseClass(Teacher teacher);
	public Integer englishClass(Teacher teacher);
	
	public void meeting(String meetingName,String address);

}
