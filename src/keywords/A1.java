package keywords;

public class A1 {
     //this
	//use to refer current class instance variable
	
	
	int a;
	
	void m1(int a) {
		
		this.a=a;
		System.out.println(10);
		
	}
	
public static void main(String[]args) {
	
	  A1 abc=new A1();
	  abc.m1(100);
	  
	  
	
}
}
