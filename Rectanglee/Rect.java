package rectangle;

public class Rect{
	private double length;
	private double breadth;
	
	public Rect(double length, double breadth){
	  this.length = length;
	  this.breadth = breadth;
	}
	
	public double getLength(){
		return length;
	}
	
	public double getBreadth(){
		return breadth;
	}
	
	public double diagonalLength(double length, double breadth){
	  double x = Math.pow(length, 2) + Math.pow(breadth, 2);
	  double diagonal = Math.sqrt(x);
	  return diagonal;
	}
	public double area(double length, double breadth){
		return length*breadth;
	}
	public double perimeter( double length, double breadth){
		double p = (2*(length + breadth));
		return p;
	}
	
	@Override
	public String toString(){
		return "The length of rectangle is "+ getLength()
		+ "\nThe breadth of rectangle is "+ getBreadth()
		+ "\nThe area of rectangle is "+ area(length,breadth)
		+ "\nThe perimeter of rectangle is "+ perimeter(length,breadth)
		+ "\nThe length of diagonal of rectangle is "+ diagonalLength(length,breadth);
	}
	
	public boolean isSquare(){
		if(length == breadth){
			return true;
		}
		return false;
	}
}

//look towards equals
	
	  
	