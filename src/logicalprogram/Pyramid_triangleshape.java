package logicalprogram;

public class Pyramid_triangleshape {
	
	public static void main(String[]args)
	{
		
		for(int a=1;a<=5;a++)
		{			for(int b=5;b>=a;b--)
					{
					System.out.print(" ");
					}
					for(int c=1;c<=a;c++)
					{
						System.out.print(" *");
					}
		
			System.out.println();
			}
			for(int d=5;d>=1;d--) {
			for(int e=1;e<=d;e++)
			{
				System.out.print(" *");
			}
			for(int f=1;f<=d;f++)
			{
				System.out.print(" ");
				
			}
			System.out.println();
		}
	}
	
	}
	
