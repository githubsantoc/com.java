public class Palindrome{
	public static void main(String[] args){
        String input= args[0];
		String reverse = "";
		String lower="";
		input =input.toLowerCase();
		
		for( int i=0; i< input.length(); i++){
	    	if((input.charAt(i)>=97 && input.charAt(i)<=122)||(input.charAt(i)>=46 && input.charAt(i)<=57)){
				lower= lower + input.charAt(i);
			}
			if(input.charAt(i)== 32){
				continue;
			}
		}
		
		System.out.println("The string is palindrome" + input.length());
		for(int i=(lower.length()-1); i >=0; i--){
			reverse= reverse + lower.charAt(i);
		}
		
		if (lower.equals(reverse)){
			System.out.println("The string is palindrome");
		}
	}
}
		