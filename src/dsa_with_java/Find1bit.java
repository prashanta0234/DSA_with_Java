package dsa_with_java;

public class Find1bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		find who many 1 bit in a number
		
		int number=20;
		int count=0;
		while(number>0) {
			number=(number&(number-1));
			count++;
		}
		System.out.println(count);

	}

}
