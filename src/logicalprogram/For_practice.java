package logicalprogram;

public class For_practice {

	public static void main(String[]args) {
		
		String a="pragti";
		String rev="";
		
		for(int b=a.length()-1;b>=0;b--)
		{
			
			rev=rev+a.charAt(b);
		}
		System.out.println(rev);
	}
}