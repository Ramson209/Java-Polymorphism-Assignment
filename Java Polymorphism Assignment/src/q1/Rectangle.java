//define Rectangle, subclasss of shape
package q1;

public class Rectangle
{
//private member varaiables
	private int length;
	private int width;
	
	
	
	//constructor
	
	public Rectangle(String color,int length,int width) {
	    
		super();
		this.length=length;
		this.width=width;
		
		
		
	}
	
	public String toString() {
		return "Rectangle of Length = " + length + " and  Width = " + width + ", subclass of " + super.toString();
}
	
	public double getArea() {
		return length*width;
	}

	
}
