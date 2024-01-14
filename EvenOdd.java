public class EvenOdd{
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++) {
            int num=Integer.parseInt(args[i]);
			checkEvenOdd(num);
		}
	}
		static void checkEvenOdd(int num){
            if((num%2)==0){
                System.out.println(num+" is even");
            }else{
			System.out.println(num+" is odd");
            }
        }
        

    }