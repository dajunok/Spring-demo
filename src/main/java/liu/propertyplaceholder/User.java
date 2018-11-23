package liu.propertyplaceholder;

public class User {
	private String userName;
    private int userAge;
    private Role role;
 
    public String getUserName() {
        return userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
 
    public int getUserAge() {
        return userAge;
    }
 
    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
 
    public Role getRole() {
        return role;
    }
 
    public void setRole(Role role) {
        this.role = role;
    }

}
