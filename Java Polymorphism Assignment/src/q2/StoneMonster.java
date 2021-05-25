package q2;

public class StoneMonster extends Monster
{
//constructor
	public StoneMonster(String name) {
		super(name);
	}
	public String attack() {
		return name + " Attack with stones!";
	}
}
