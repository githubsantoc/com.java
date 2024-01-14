public class Calculator{
	public static void main(String[] args){
		String a= args[0];
		int b= Integer.parseInt(args[1]);
		int c= Integer.parseInt(args[2]);
		if(a.equals("+")){
				int sum= b+c;
				System.out.println("Sum="+sum);
		}
		else if(a.equals("-")){
				int sub= b-c;
				System.out.println("Subraction="+sub);
		}
		else if(a.equals(".")){
				int mul= b*c;
				System.out.println("Multiply="+mul);
		}
		else {
				int div= b/c;
				System.out.println("Division="+div);
		}
	}
}
			