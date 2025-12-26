package Loop.WhileLoop.WhileLoop1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	

		
//   Q-11	 WAJP to print a number is prime number or not.	
		boolean result = isPrime(10);
		System.out.println(result);
		
	}
		public static boolean isPrime(int n) {
			if(n<2)
				return false;
			int i = 2;
			int count=0;
			while(i*i<=n) {
				if(n%i==0)
					return false;
				i++;
			}
			return true;
		
		
		
		
		
		
		
		
	}

}
