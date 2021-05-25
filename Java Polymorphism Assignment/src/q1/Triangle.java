//define Triangle,subclass of shape
package q1;

public class Triangle
{
	//private member variables
	
	private int base;
	private int height;
	
	//constructor
	
	public Triangle (String color,int base,int height) {
		super();
		this.base=base;
		this.height=height;
		
	}
	
	public String toString() {
		return "Triangle of Base = " + base + " and Height = " + height + ",Subclass of " + super.toString();
	}
public double getArea() {
	return 0.5*base*height;
}
}
