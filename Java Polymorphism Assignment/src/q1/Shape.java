//define superclass Shape
package q1;

public class Shape
{
//private member variables
	
	private String color;
	
	//constructor 
	
	public Shape (String color) {
		this.color=color;
	}
	public String toString() {
		return "Shape of color=\"" + color + "\"";
	}
	// All shapes must have a method called getArea()
	
	public double getArea () {
		return 0;
	}
}
