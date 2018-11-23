package liu.aopXMLConfig;

//注意⚠️：可以定义接口，也可以不定义，定义接口时使用jdk动态代理，不定义接口时使用cglib动态代理；
public interface CoderProjectService {
	public void getProjectInfo(CoderProject coderProject);
}
