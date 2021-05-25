//the superclass monster defines the expected common behavious for it subclasses.
package q2;

public class Monster
{
//protected instance variable
	protected String name;
	
	//constructor
	public Monster(String name) {
		this.name=name;
	}
	
	//define common behaviour for all its subclasses
	
	public String attack() {
		return "i dont know how to attack!";
	}
}



