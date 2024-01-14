public class Prime{
	public static void main(String[] args){
		int num= Integer.parseInt(args[0]);
		if(isPrime(num)){
			System.out.println(num+" is prime");
		} else{
				System.out.println(num+" is not prime");
		}

	}	

static boolean isPrime(int num){
			if (num<=1)
				return false;
			for (int i=2; i<num; i++){
				if (num%i==0){	
					return false;
				} 
				
			}
			return true;
		}
}

		
					