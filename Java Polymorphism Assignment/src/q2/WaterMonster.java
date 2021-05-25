package q2;

public class WaterMonster extends Monster
{
//constructor 
	public WaterMonster(String name) {
		super(name);
	}
	
	public String attack() {
		return name + " Attack with water!";
	}
}
