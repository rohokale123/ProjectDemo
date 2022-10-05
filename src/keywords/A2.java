package keywords;

public class A2 {
	
	//this
	//use 2: use to call current class methods
	
	void m1(int a, String b)
	{
		
		System.out.println("hii pragati");
		
	}
	
	void m2(int c)
	{
		
			this.m1(10,"hello"); 
	
		System.out.println("hello pragati");
		
	}
    public static void main(String[]Args) {
    	
    	A2 abc=new A2();
    	
    	abc.m2(10);
    }
}
