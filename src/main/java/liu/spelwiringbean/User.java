package liu.spelwiringbean;

public class User {
	
	private String username;
	private String password;
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return this.username;
	}
	public String getPassword() {
		return this.password;
	}
	public void printUser(){
		System.out.println("当前用户名："+username+" ,密码："+password);
	}
}

