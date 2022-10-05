package keywords;

public class A3 {
     
	   //this
	   // use 3 : use to call or invoke current class constructor
	
	A3(){  //A3(String a)
		
		System.out.println("hello pragati");
	}
	
	A3(int a ){
		
		this(); //this("hello");
		System.out.println("hey pragati");
		
	}
	
	public static void main(String[]args) {
		
		A3 ab=new A3(10);
	}
	
	
}
