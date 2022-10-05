package keywords;

public class A6 {
	
	//super
	//use 1: use to refer parent class instance variable
	int a;

}


class A4 extends A6  {
	

	void m1(int a) {
		
		super.a=a;
	}
	
	public static void main(String[]args) {
		
		A4 abc=new A4();
		abc.m1(10);
		
		System.out.println(abc.a);
		
	}
}