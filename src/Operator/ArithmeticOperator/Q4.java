package Operator.ArithmeticOperator;

public class Q4 {
	/*
	 * WAJP to swap two numbers. 
	 * a. With using a third variable 
	 * b. Without using third variable
	 */
	public static void main(String[] args) {
		
//		* a. With using a third variable
		

		int a=10;
		int b=20;
		System.out.println("Before Swapping");
		System.out.println(a);
		System.out.println(b);
	
	/*	
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping");
		System.out.println(a);
		System.out.println(b);
	*/
		
		
		
//		* b. Without using third variable
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping");
		System.out.println(a);
		System.out.println(b);
	

	}

}
