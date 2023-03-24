package dsa_with_java;

public class TrailingZaro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=20;
		int res=0;
		for(int i=5;i<=number;i*=5) {
			
			res+=number/i;
		}
         System.out.println(res);
	}

}
