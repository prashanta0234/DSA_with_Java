package dsa_with_java;

public class Xors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		find the only non repeating number in an array where every element repeat twice
		
		int[] arr= {5,4,1,4,3,5,1,3,2};
		int length=arr.length-1;
		int res=0;
		while(length>=0) {
			res^=arr[length];
			length--;
			
		}
		System.out.println(res);

	}

}
