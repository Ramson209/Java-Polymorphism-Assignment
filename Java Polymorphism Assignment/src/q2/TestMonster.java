package q2;
public class TestMonster
{
	public static void main (String[]args) {
		//declare reference of superclass and assisgn instance of subclasses.
		
		Monster m1 = new FireMonster("Fire Lion");
		Monster m2 = new WaterMonster("Strike");
		Monster m3 = new StoneMonster("Blizzard");
		
		System.out.println(m1.attack());
		System.out.println(m2.attack());
		System.out.println(m3.attack());
}
}
