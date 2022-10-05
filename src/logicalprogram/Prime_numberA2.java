package logicalprogram;

public class Prime_numberA2 {
	
	public static void main(String[]args) {
		
		int temp=0;
		for(int a=100;a>=2;a--)
		{
			
			for(int b=2;b<=a-1;b++) 
			{
				
				if(a%b==0)
				{
					
					temp=temp+1;
				}
				
			}
			if(temp==0)
			{
				
				System.out.println(a);
			}
			else {
				
				temp=0;
			}
		}
	}
	
}

