package logicalprogram;

public class Reverse_String {
	
	public static void main(String[]args) {
		
		String a="Software testing";
		String rev="";
		
		System.out.println("orignal String = "+a);
		
		for(int b=a.length()-1;b>=0;b--)
		{
			
			rev=rev+a.charAt(b);
		}
		System.out.println("After reverse string = "+rev);
	}
	
	
}
