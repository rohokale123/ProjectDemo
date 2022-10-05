package logicalprogram;

public class Palindrome {
	
	public static void main(String[]args) {
		
		
		int a=121;    //u can put here any value 
		int b=a; //121
		int rem;
		int rev=0; //121
		
		while(b!=0) { //1
			
			
			rem=b%10;    //1  //reminder
			rev=rev*10+rem;   //120+1=121
			b=b/10;     //quotient
			
		}
		if(a==rev) {
			System.out.println("given  number is palindrome");
			
		}
		else {
			
			System.out.println("given no is not palindrome");
		}
	}

}
