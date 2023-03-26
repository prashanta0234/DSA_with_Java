package dsa_with_java;

import java.util.Arrays;

public class SieveofEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean prime[]=sieveo(10);
		for(int i=0;i<prime.length;i++) {
			if(prime[i]) {
				System.out.println( i);
			}
		}
  
	}
	
	
	public  static boolean[] sieveo(int num) {
		boolean[] isprime=new boolean[num+1];
		Arrays.fill(isprime, true);
		isprime[0]=false;
		isprime[1]=false;
		for(int i=2;i*i<=num;i++) {
			for(int j=i*2;j<=num;j+=i) {
				isprime[j]=false;
				
			}
			
		}
		return isprime;
	}

}
