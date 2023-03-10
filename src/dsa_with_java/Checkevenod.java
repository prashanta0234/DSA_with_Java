package dsa_with_java;

public class Checkevenod {
	
	static String check(int num) {
		if((num&1)==0) {
			return "even";		}
		return "Odd";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println(check(10));
	System.out.println(check(11));

	}

}
