package liu.aopXMLConfig;

//创建一个类来处理业务逻辑，作为要织入切面中的被代理对象
public class CoderProjectServiceImpl implements CoderProjectService {

  public void getProjectInfo(CoderProject coderProject) {
      System.out.println("项目名称：" + coderProject.getProjectName() + "－－项目版本号:" + coderProject.getProjectVersion()
              + "－－项目描述：" + coderProject.getProjectDesc());
  }

}
