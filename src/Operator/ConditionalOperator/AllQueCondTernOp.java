package Operator.ConditionalOperator;

import java.util.Scanner;

public class AllQueCondTernOp {

	public static void main(String[] args) {
		
	
		
//		Q:1

		int a = 5, b = 10;
		int c = (a > b) ? a++ : b++;
		System.out.println(a + " " + b + " " + c);

//----------------------------------------------------------------------


		
//		Q2
//		What is the output of the program:
		
//			int a = 3, b = 4, c = 5;
//			int result = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
//			System.out.println(result);
		
		
		
//		Q3
//		What is the output of the program:

//			int x = 10;
//			int y = 5;
//			int z = (x > y) ? (x < 15 ? x : y) : (x > 5 ? y : x);
//			System.out.println(z);
		
		
		
		
//		Q4
//		What is the output of the below program?
		
//				int x = 10;
//				int y = 5;
//				int z = 7;
//				int result = (x < y) ? (y < z ? z : y) : x;
//				System.out.println(result);
		
		
		
//		Q5
//		What is the output of the below program?

//				int a = 1, b = 2, c = 3;
//				int result = a < b ? a < c ? c : a : b;
//				System.out.println(result);
		
		
		
		
		
//		Q6
//		What is the output of the below program?
		
//				int a = 5;
//				int b = 10;
//				int c=(a>b) ? b++ : (a<b ? --b : b) ;
//				System.out.println(c);
		
		
		
		
		
//		Q7
//		What is the output of the below program?
		
//				int value=10;
//				int result=(value>5) ? (value<8?1:2) : 3;
//				System.out.println(result);
		
		
//		Q8
//		What is the output of the below program?
		
//				int x=5, y=7, z=3;
//				int result=(x>y) ? (x>z? x:z) : (y>z ? y:z);
//				System.out.println(result);
		
		
		
		
		
		
		
		
//		Q9
//		What is the output of the below program?
		
//				int x=5, y=7, z=3;
//				int result=(x<y) ? (x<z? x:z) : (y<z ? y:z);
//				System.out.println(result);
		
		
		
		
		
		
		
		
		// ============================================================================================
		// ============================================================================================
		// ============================================================================================
		// ============================================================================================
		// ============================================================================================
		// ============================================================================================
		// ============================================================================================
		
		
		
		
		
		
		
		
		
//		Q10
//		WAJP to check and print the given number
//		is an even number or not.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a Number : ");
//		int n = sc.nextInt();
//		
//		String result = n%2==0 ? "Even No"  : "Odd No" ;
//		System.out.println(result);
		
		
		
		
		
		
//		Q11
//		WAJP to check and print the given +ve
//		number is a three digit number or not.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a Number : ");
//		int n = sc.nextInt();
//		String result = (n>99 && n<1000) ? "3-Digit No" : "Not a 3-Digit No";
//		System.out.println(result);
		
		
		
//		Q12
//		WAJP to check and print the given
//		number is divisible by both 3 and 5 or
//		only by 3, only by 5 or None.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a Number : ");
//		int n = sc.nextInt();
//		String result = (n%3==0 && n%5==0) ? "No is Divided by both" : n%3==0 ? "No is only divided by 3" : n%5==0 ? "No is divided only by 5" :"None";
//		System.out.println(result);
		
		
		
		
		
//		Q13
//		For given numbers x and y. check whether
//		y is a factor of x or not.
//
//		Input: x=12, y=4
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Q14
//		WAJP to check whether the three sides of
//		a triangle is valid or not.
		
/*		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number of a : ");
		int a = sc.nextInt();
		System.out.print("Enter a Number of b : ");
		int b = sc.nextInt();
		System.out.print("Enter a Number of c : ");
		int c = sc.nextInt();
		
		
		String result = (a+b>c && b+c>a && a+c>b) ? "Valid Triangle" : "Invalid Triangle";
		System.out.println(result);
		
	*/	
		
		
		
		
		
		
//		Q15
//		WAJP to check whether the given
//		character is an upper case alphabet or
//		not.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a Number : ");
//		char c = sc.next().charAt(0);
//		
//		String result = (c>=65 && c<=90) ? "UpperCase" : "Not an UpperCase";
//		System.out.println(result);
		
		
		
		
//		Q16
//		WAJP to check whether the given
//		character is a lower case alphabet or not.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a Number : ");
//		char c = sc.next().charAt(0);
//		String result = (c>=97 && c<=122) ? "Lowercase" : "Not a LowerCase";
//		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
//		Q17
//		WAJP to check whether the given
//		character is an alphabet or not.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a Number : ");
//		char c = sc.next().charAt(0);
////		String result = (c>=65 && c<=90) || (c>=97 && c<=122) ? "Alphabet" : "Not an Alphabet";
//		String result = (c>='A' && c<='Z') || (c>='a' && c<='z') ? "Alphabet" : "Not an Alphabet";
//		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
//		Q18
//		Given a character, check if it's uppercase,
//		lowercase, digit or special character.
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Number : ");
//		char c = sc.next().charAt(0);
//		
//		String result = (c>=65 && c<=90) ? "UpperCase" : (c>=97 && c<=122) ? "LowerCase" : (c>=48 && c<=57) ? " Digit" : "Special Character";
//		
////		String result = (c>='A' && c<='Z') ? "It is an UpperCase Character" : (c>='a' && c<='z') ? "It is a LowerCase Character" : (c>='0' && c<='9') ? " It is a Digit character" : "Special Character";
//		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
//		Q19
//		WAJP to print the bigger of two numbers.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a Number of a : ");
//		int a = sc.nextInt();
//		System.out.print("Enter a Number of b : ");
//		int b = sc.nextInt();
		
//		int big = a>b ? a : b;
//		System.out.println("Biggest of 2 No is : "+big);
		
		
		
		
		
		
//		Q20
//		WAJP to print the smaller of two
//		numbers.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a Number of a : ");
//		int a = sc.nextInt();
//		System.out.print("Enter a Number of b : ");		
//		int b = sc.nextInt();
		
//		int small = a<b ? a : b;
//		int small = a>b ? b : a;
//		System.out.println("Smaller of " +a+ " and "+b+" is : "+small);
//		
		
		
		
		
		
		
		
		
//		Q21
//		WAJP to print the biggest of three
//		numbers.
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter first No : ");
//		int a = sc.nextInt();
//		System.out.print("Enter second No : ");
//		int b = sc.nextInt();
//		System.out.print("Enter third No : ");
//		int c = sc.nextInt();
		
//		1st - way
//		int big = a>b ? a : b>c ? b : c ;
		
//		2nd - way
//		int x = a>b ? a : b;
//		int biggest = x>c ? x : c;
		
//		3rd - way
//		int biggest = (a>b && a>c) ? a : (b>c ? b : c);
		
//		4th - way
//		int biggest = (a>b) ? (a<c ? a : c ): (b>c ? b : c );
		
//		System.out.println("Biggest of  " +a+ " and "+b+" and " +c+ " is : "+biggest);
		
		
		
		
		
		
		
		
		
		
//		Q22
//		WAJP to print the smallest of three
//		numbers.
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter first No : ");
//		int a = sc.nextInt();
//		System.out.print("Enter second No : ");
//		int b = sc.nextInt();
//		System.out.print("Enter third No : ");
//		int c = sc.nextInt();
//		
//		
//		int smallest = (a<b && a<c) ? a : (b<a && b<c) ? b : c;
//		System.out.println("Smallest is : " +smallest);
		
		
		
		
		
		
		
		
//		Q23
//		WAJP to print the biggest of four
//		numbers.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter first No : ");
//		int a = sc.nextInt();
//		System.out.print("Enter second No : ");
//		int b = sc.nextInt();
//		System.out.print("Enter third No : ");
//		int c = sc.nextInt();
//		System.out.print("Enter fourth No : ");
//		int d = sc.nextInt();
//		
////		int x = a>b && a>c ? a>d ? a : b>c && b>d ? b : c>d ? c : d; 
////		int y = x>d ? x : d;
////		System.out.println(y);
		
//		 int biggest = (a > b) 
//                 ? ((a > c) 
//                       ? ((a > d) ? a : d) 
//                       : ((c > d) ? c : d)) 
//                 : ((b > c) 
//                       ? ((b > d) ? b : d) 
//                       : ((c > d) ? c : d));
//		 System.out.println("Biggest No is : " +biggest);
		
		
//		int biggest = Math.max(Math.max(a, b), Math.max(c, d));
//
//        System.out.println("Biggest number is: " + biggest);

		
		
		
		
		
		
		
		
		
		
		
		
		
//		Q24
//		WAJP to print the smallest of four
//		numbers.
		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter first No : ");
//		int a = sc.nextInt();
//		System.out.print("Enter second No : ");
//		int b = sc.nextInt();
//		System.out.print("Enter third No : ");
//		int c = sc.nextInt();
//		System.out.print("Enter fourth No : ");
//		int d = sc.nextInt();
		
//		int x = a<b && a<c ? a : b<a && b<c ? b : c<a && c<b ? c : d;
//		int y = x<d ? x : d; 
//		
//		System.out.println("Smallest No is : " +y);
		
	/*
	  	int smallest = Math.min(Math.min(a,b) , Math.min(c,d));
		System.out.println("Smallest No is : "+smallest);
		
		*/
		
		
		
		
		
		
		
		
		
//		Q25
//		Print if a year is a leap year or NOT using
//		only conditional operator.
		

	/*	Scanner sc = new Scanner(System.in);
		System.out.print("Enter Year : ");
		int year = sc.nextInt();
		
		String result = year % 400 == 0 ? "Leap Year" : (year % 4 == 0 && year % 100 != 0) ? "Leap Year" : "Not a Leap Year";
		System.out.println(result);
		
		*/
		
		
		
		
		
		
		
	/*	Q26
		Test the Rank of a student

		int marks = 72;

		Output: "Distinction" (>=75), "First Class"
		(>=60), "Second Class" (>=50), “Pass“
		(>=35), “Fail”
	*/
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.print("Enter Marks : ");
		int marks = sc.nextInt();
		
		String result = marks>=75 ? "Distinction" : marks>=60 ? "First Class" : marks>=50 ? "Second Class" : marks>=35 ? "Pass" : "Fail" ;
		
		System.out.println(result);
		
	*/	
		
		
		
		
		
		
	/*	Q27
		Given three numbers, print them in
		sorted order (ascending)

		int a = 9, b = 2, c = 7;

		// Output: 2 7 9	
*/		
	/*	Scanner sc = new Scanner(System.in);
		System.out.print("Enter of a : ");
		int a = sc.nextInt();
		System.out.print("Enter of b : ");
		int b = sc.nextInt();
		System.out.print("Enter of c : ");
		int c = sc.nextInt();
		
		int smallest = a<b && a<c ? a : b<a && b<c ? b : c;
		int biggest = a>b && a>c ? a : b>a && b>c ? b : c;
		int secondBiggest = (a+b+c) - (biggest+smallest);
		System.out.println(smallest+ " "+secondBiggest+ " "+biggest);
		
	*/	
		
		
		
		
		
		
		
	/*	
		Q28
		Return second largest of three distinct
		numbers using ternary operator only.
	*/
		
/*		Scanner sc = new Scanner(System.in);
		System.out.print("Enter of a : ");
		int a = sc.nextInt();
		System.out.print("Enter of b : ");
		int b = sc.nextInt();
		System.out.print("Enter of c : ");
		int c = sc.nextInt();
		
		int smallest = a<b && a<c ? a : b<a && b<c ? b : c;
		int biggest = a>b && a>c ? a : b>a && b>c ? b : c;
		int secondLargest = (a+b+c) - (biggest+smallest);
		System.out.println("Second Largest No is : "+secondLargest);
		
	*/
		
		
		
		
		
	/*	Q30
		Statement: There are n coins. Each
		turn you can take 1 or 2 coins. What
		is the logic that the first person will
		win?
	*/
		
		
//		class Solution {
//		    public boolean canWinNim(int n) {
//		      return n % 3 !=0 ? true : false;
		      
		
		
		
		
		
		
		
		
		
		
		
		
		}	
	}


