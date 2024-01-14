public class Fact{
	public static void main(String[] args){
	int a= Integer.parseInt(args[0]);
	int b=1;
	for(int i=a; i>0; --i){
	b *= i;
	}
	System.out.println("Factorial"+b);
	}
}