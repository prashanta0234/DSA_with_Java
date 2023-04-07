package dsa_with_java;

import java.math.BigInteger;

public class TowerOFHonoi {
	
	 static  BigInteger claculate(int a) {
		 BigInteger nMinusOne = BigInteger.valueOf(2).pow(a-1);
		 BigInteger res = BigInteger.valueOf(2).multiply(nMinusOne.subtract(BigInteger.ONE)).add(BigInteger.ONE);

		 return res;
	 }

	public static void main(String[] args) {
		
           System.out.println(claculate(3));
	}

}
