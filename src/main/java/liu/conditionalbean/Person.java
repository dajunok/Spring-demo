package liu.conditionalbean;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	   private String name;
	   
	    @Autowired
	    private  Animal animal;
	 
	    public Animal getAnimal() {
	        return animal;
	    }
	 
	    public void setAnimal(Animal animal) {
	        this.animal = animal;
	    }
	 
	    public String getName() {
	        return name;
	    }
	 
	    public void setName(String name) {
	        this.name = name;
	    }
}
