package rectangle;

public class Rectangle{
	
	public static void main(String[] args){
		double l = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		Rect r = new Rect(l,b);
		System.out.println(r);
		if(r.isSquare()){
			System.out.println("It is square");
		} else{
			System.out.println("It is not a square");
		}
		
	}
	}