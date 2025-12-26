package Operator.ArithmeticOperator;

public class Q2 {

	/*
	 * For a given number int n=5783; 
	 * Print each digit of the number one by one from
	 * Right to Left.
	 *  o/p: 
	 *  3
	 *  8
	 *  7 
	 *  5
	 */
	public static void main(String[] args) {

		int n = 5783;
		System.out.println(n%10);
		System.out.println((n/10)%10);
		System.out.println((n/100)%10);
		System.out.println((n/1000)%10);
	}

}
