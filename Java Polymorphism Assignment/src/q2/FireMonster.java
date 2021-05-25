package q2;

public class FireMonster extends Monster
{
//constructor 
	public FireMonster(String name) {
		super(name);
	}
	public String attack() {
		return name + "  Attack with fire!";
	}
}
