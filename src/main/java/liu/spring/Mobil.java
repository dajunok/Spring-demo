package liu.spring;

import sun.nio.cs.ext.TIS_620;

public class Mobil {
	private String brand;
	private String model;
	
	public Mobil(String brand,String model) {
		this.brand=brand;
		this.model=model;
	}
	
	public void printMobil() {
		System.out.println("MyMobil:"+this.brand+"  "+this.model+"\n"+this);
		
	}

}
