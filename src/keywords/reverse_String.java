package keywords;

public class reverse_String {
	
	public static void main(String[]args) {
		
		String a="pragati";
		String rev="";
		
		for(int b=a.length()-1;b>=0;b--) {
			
			rev=rev+a.charAt(b);
		}
		System.out.println(rev);
	}

}
