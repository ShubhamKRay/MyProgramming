package Operator.LogicalOperator;

import java.util.Scanner;

public class AllQueLogicOper {

	public static void main(String[] args) {
		
		
		
//		Q1
		
//		boolean a=true;
//		boolean b=false;
//		boolean c=true;
//		boolean result=(a && b) || (b && c);
//		System.out.println(result);
		
		
		
		
//		Q2
//		Solve and answer:-

//		int x=5;
//		int y=10;
//		boolean result=(++x > 5) && (--y < 10);
//		System.out.println(result);
//		System.out.println(x);
//		System.out.println(y);
		
		
		
		
		
//		Q3
//		Solve and answer:-

//		int x=5;
//		int y=10;
//		boolean result=(x++ > 5) && (--y < 10);
//		System.out.println(result);
//		System.out.println(x);
//		System.out.println(y);
		
		
		
		
		
//		Q4
//		Solve and answer:-
		
//		boolean a=true;
//		boolean b=false;
//		boolean c=true;
//		boolean result=(a || b) && (b || c);
//		System.out.println(result);
		
		
		
		
		
//		Q5
//		Solve and answer:-

//		int a=20;
//		int b=30;
//		System.out.println(a++>15 && b++>20);
//		System.out.println(a);
//		System.out.println(b);
		
		
		
		
		
		
//		Q6
//		Solve and answer:-
//      Important   a++>25 &&
//		int a=20;
//		int b=30;
//		System.out.println(a++>25 && b++>20);
//		System.out.println(a);
//		System.out.println(b);
		
		
		
		
		
		
		
		
		
		
//		Q7
//		Solve and answer:-

//		int a=20;
//		int b=30;
//		System.out.println(a++>25 || b++>20);
//		System.out.println(a);
//		System.out.println(b);
		
		
		
		
//		Q8
//		Solve and answer:-
//      Important    a++>15 ||
		
//		int a=20;
//		int b=30;
//		System.out.println(a++>15 || b++>20);
//		System.out.println(a);
//		System.out.println(b);
		
		
		
		
		
//		Q9 - HackerRank
		
//		For a given year print true if it is a leap year or
//		print false if it is not a leap year.
		
//		Given a year, determine whether it is a leap year. If it is a leap year, 
//		return the Boolean True, otherwise return False.
		
		
		        Scanner sc = new Scanner(System.in);
				System.out.print("Enter year : ");
				int year = sc.nextInt();
				
				if ((year%400==0)    ||    (year%4==0 && year%100!=0) )
					System.out.println("True");
				else
					System.out.println("False");
	}

}
