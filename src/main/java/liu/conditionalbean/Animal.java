package liu.conditionalbean;

public class Animal {
	private String name;
	 
    public String getName() {
        return getClass().getName();
    }
 
    public void setName(String name) {
        this.name = name;
    }
}