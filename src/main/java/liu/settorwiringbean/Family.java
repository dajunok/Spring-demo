package liu.settorwiringbean;

public class Family {
	private Member father;
	private Member mother;
	private Member son;
	private int amount;	
	
	private House house;

	public void setFather(Member father) {
		this.father = father;
	}
	public void setMother(Member mother) {
		this.mother = mother;
	}
	public void setSon(Member son) {
		this.son = son;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void setHouse(House house) {
		this.house = house;
	}
	
	
}
