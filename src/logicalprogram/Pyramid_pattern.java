package logicalprogram;

public class Pyramid_pattern {

	public static void main(String[]args) {
		
		for(int a=1;a<=5;a++) //OR(int a=1;a<=5;a++)
		{
			
			for(int b=5;b>=a;b--)  //OR(int b =1;a>=a,b--)
			{
				
				System.out.print("  *");
			}
			System.out.println();
		}
		
	}
}
