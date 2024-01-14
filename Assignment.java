public class Assignment{
	public static void main(String[] args){
	int a= Integer.parseInt(args[0]);
	int sum=0;
	int sum1=a*((a+1)/2);
	for(int i=1; i<=a; ++i){
	System.out.print(i+"  ");
	sum+=i;
	}
	
	System.out.println();
	int squareSum=0;
	for(int i=1; i<=a; ++i){
	System.out.print(i*i+"  ");
	}
	System.out.println();
	for(int i=1; i<=a; ++i){
		float b=1/(i*i);
	System.out.print(b+"  ");
	
	
	}
	System.out.println("The sum of series is "+sum);
	System.out.println("The sum of series is "+sum1);
	}
}//Stacktrace


