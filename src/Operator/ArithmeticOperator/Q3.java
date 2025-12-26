package Operator.ArithmeticOperator;

/*For a given number int n=5783;
Print each digit of the number one by one from Left to Right.
o/p:
5
7
8
3
*/

public class Q3 {

	public static void main(String[] args) {
		int n=5783;
		System.out.println((n/1000)%10);
		System.out.println((n/100)%10);
		System.out.println((n/10)%10);
		System.out.println(n%10);
	}
}
