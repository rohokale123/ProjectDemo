package logicalprogram;

public class PrimeNumbers {
	
	
	//prime number is a number that can be divided exactly only by itself and 1
	
	public static void main(String[]args) {
		
		int temp=0;
		
		for(int a=2;a<=100;a++)
		{
			
			for(int i=2;i<=a-1;i++)
				
			{
				if(a%i==0)
				{
					temp = temp+1;
					
				}
			}
			
			if(temp==0)
			{ 
				System.out.println(a);
			}
	        else
			{
				temp=0;
			}
		}
		
		
	}

}
