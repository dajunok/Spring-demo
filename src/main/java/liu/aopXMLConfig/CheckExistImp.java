package liu.aopXMLConfig;

public class CheckExistImp implements CheckExist {	//定义一个类，增加一些验证逻辑，对被代理对象逻辑进行增强或完善

	public boolean checkIsEmpty(CoderProject project) {
		return project != null;
	}

}
