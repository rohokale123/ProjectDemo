package logicalprogram;

public class Reverse_Number {
	
	public static void main(String[]args) {
		
		int num=1234;
		int rev=0;
		while(num!=0) {
			
			int reminder=num%10; //4-3-2-1
			rev=rev*10+reminder; //43-432-4321
			num=num/10;     //1234-123-12-1
			
			
		}
		System.out.println(rev);
	}

}
