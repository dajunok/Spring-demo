package liu.propertyplaceholder;

public class DataSource {
    private String driveClass;  //驱动类

    private String url; //jdbc地址

    private String userName; //用户名

    private String password; //密码

    public String getDriveClass() {
        return driveClass;
    }

    public void setDriveClass(String driveClass) {
        this.driveClass = driveClass;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "DataSource [driveClass=" + driveClass + ", url=" + url + ", userName=" + userName + ", password=" + password + "]";
    }

}
