package keywords;

public class A5 {
	  //super
	// use 2 : USE to call parent class methods
	
	void m1() {
		
		System.out.println("m1");
	}

}
 class B1 extends A5{
	  
	void m2() {
		
		super.m1();
		System.out.println("m2");
		
	}
	
	public static void main(String[]args) {
		
		B1 abc= new B1();
		
		abc.m2();
	}
	
}