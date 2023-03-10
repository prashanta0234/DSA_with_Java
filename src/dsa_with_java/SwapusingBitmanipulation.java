package dsa_with_java;

public class SwapusingBitmanipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5;
		int b=10;
		
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);

	}

}
