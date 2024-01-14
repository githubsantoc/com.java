public class BugFixedFibonacci{
	public static void main(String[] args){
		int fib0 =0;
		int fib1 = 1;
		int n = Integer.parseInt(args[0]);
		System.out.println("The fibonacci sequence is :\n" );
		for(int i=0; i < n; i++){
			int fibn= fib0  + fib1;
			System.out.print(fib0+" ");
			fib0=fib1;
			fib1=fibn;
			
			
		}
	}
}
			
		
		