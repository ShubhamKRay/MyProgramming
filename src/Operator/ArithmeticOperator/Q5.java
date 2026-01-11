package Operator.ArithmeticOperator;

public class Q5 {
	
/*	For the given three numbers.
 *  Swap 1st into 2nd, 2nd into 3rd and 3rd into 1st number.
	
	a.With using fourth variable
	
	b.Without using fourth variable
*/
	
	
	
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;

		System.out.println("Before Swapping");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("-----------------------");

		//a.
		//With using fourth variable

/*		-------------
		Before:
		1st = a
		2nd = b
		3rd = c

		After swap:
		1st = c
		2nd = a
		3rd = b
		-------------
*/

//		int temp = a;  // fourth variable
//		a = c;        // 3rd → 1st
//		c = b;        // 2nd → 3rd
//		b = temp;     // 1st → 2nd
//		System.out.println("After swapping");
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);



//#####################################################

		//b.
		//Without using fourth variable


		a = a + b + c;   // a = 60

		b = a - (b + c); // b = 10
		c = a - (b + c); // c = 20
		a = a - (b + c); // a = 30

		System.out.println("After swapping");

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);







	}
}
