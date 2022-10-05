package logicalprogram;

public class Factorial_number {
	
	
	//factorial number
	public static void main(String[]args) {
		
		int a=5;
		int b=1;
		
		for(int c=1;c<=a;c++) {
			
			b=b*c;
		}
		System.out.println("factorial of " + a +" is"+b);
		
	}
	
}