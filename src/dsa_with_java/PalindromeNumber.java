package dsa_with_java;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=404;
		int res=0;
		int originalNumber=number;
		
		while(number>0) {
			int lastDigit=number%10;
			res=res*10+lastDigit;
			number/=10;
		}
		
		if(originalNumber==res) {
			System.out.println("number is palindrome.");
		}else {
		System.out.println("NUmber is not palindrome");}

	}

}
