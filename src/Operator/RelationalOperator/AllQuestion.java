package Operator.RelationalOperator;

public class AllQuestion {

	public static void main(String[] args) {
		
		// Q:1
		// Evaluate the expression:
//		int x = 5, y = 10;
//		System.out.println(x == y == false);
		

		
		
//		Q:2
//
//		Evaluate the expression:
//		
//		int x=64, y=20;
//		System.out.println(x+y>3*y);
//		System.out.println((x+y)/12==0);
//		System.out.println((x+y)/12!=0);
//		System.out.println((x+y)/12==7);
//		System.out.println((x+y)/12!=7);
		
		
		
//		Q:3
//
//		Evaluate the expression:
		
		
//		int x=64, y=20, z=1900;
//		System.out.println((x+y)%12==0);
//		System.out.println((x+y)%12!=0);
//		System.out.println(z%100!=0);

		
		
		
//		Q:4
//
//		Evaluate the expression:
			
		
	/*	
	    Step 1: 0.0 / 0.0
	    
		Floating-point me (Java, IEEE-754 standard ke hisaab se):
		
		1.0 / 0.0 → Infinity
	   -1.0 / 0.0 → -Infinity
		0.0 / 0.0 → NaN (Not a Number)
		
		👉 So, d = NaN.

		Step 2: Evaluate comparisons with NaN
		
		IEEE-754 ke rules:
		
		NaN == NaN → false
		NaN != NaN → true
		NaN < anything → false
		NaN > anything → false
		NaN <= anything → false
		NaN >= anything → false   
	*/
		
//		double d = 0.0/0.0;
//		System.out.println(d == d);
//		System.out.println(d != d);
//		System.out.println(d < d);
//		System.out.println(d > d);
//		System.out.println(d <= d);

		
		
		
		
		
		
//		Q:5
//		Evaluate the expression:
			
//		int x = 5;
//		System.out.println(1 < x < 10);
		
/*
Step 1: Analyze

In Java, the expression 1 < x < 10 does NOT work like in Python.

Java does not allow chaining of relational operators.

Here’s why:

1 < x evaluates first.

1 < x is 1 < 5, which is true.

Now you are left with true < 10.

⚠️ But true < 10 is illegal in Java, because true is a boolean, and < expects numbers.

✅ Correct Way in Java

You must use the logical AND operator &&:

int x = 5;
System.out.println(1 < x && x < 10); // true


1 < x → true

x < 10 → true

true && true → true

✅ Output:

true
 */
		













//		Q:6
//		Evaluate the expression:
			
			
//		char c1 = 'A';
//		char c2 = 65;
//		System.out.println(c1 == c2);
//		System.out.println(c1 < 'a');
//		System.out.println('Z' < 'a');
		
		
		
		
//		Q:7
//		Evaluate the expression:
			
//		boolean p = true;
//		boolean q = false;
//		System.out.println(p == q == false);
		
		
		
		
		
//		Q:8
//		Evaluate the expression:
			
		int p = 3, q = 5;
		System.out.println((p += 2) > (q -= 2));
		System.out.println(p + " " + q);
		
		
		
		
		
		
	}
		

}
