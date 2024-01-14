public class BugFixedStat{
	public static void main(String[] args){
		
		if(args.length == 0){
			System.out.println("Please enter the data");
			return;
		}
		
		int num[] =new int[args.length];
		
		double sum = 0;
		for(int i = 0; i <args.length; i++){
			 num[i] = Integer.parseInt(args[i]);
		}
		
		System.out.print("The sorted array is : "); 
		for(int i=0; i <num.length; i++){
			for(int j=  i + 1; j < num.length; j++){  
				int tmp = 0;  
				if (num[i] > num[j]){  
					tmp = num[i];  
					num[i] = num[j];  
					num[j] = tmp;  
				}  
			}  
			System.out.print(num[i] + " "); 
		}
		System.out.println("\nThe maximum value among them is "+ num[num.length-1]); 
		System.out.println("\nThe minimum value among them is "+ num[0]); 
		
		//logic to calculate mean of data
		for(int i=0; i <num.length; i++){
			sum += num[i];
		}
		double mean = sum / num.length;
		System.out.println("\nThe mean value is : "+ mean); 
		
		//logic to calculate median
		double len = num.length;
		double position = (len + 1) / 2;
		//if positioin is like 2.5 then md = 2 position + 0.5(3 position - 2 position) 
		double md = num[(int)position-1] + ((position - (int)position) *( num[(int)position] - num[(int)position - 1]));
		System.out.println("\nThe median value is : "+ md); 
		
		//logic to calculate standard deviation
		double x;
		double x2 = 0;
		for(int i = 0; i < num.length; i++){
			x = (double)num[i] - mean ;
			x2 += Math.pow(x, 2);
		}
		double standardDeviation = Math.sqrt(x2 / num.length);
		System.out.println("\nThe standard deviation is : "+ standardDeviation); 
		
	}
}