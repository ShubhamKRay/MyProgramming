package Loop.WhileLoop.WhileLoop1;

public class WhileLoop1 {

	public static void main(String[] args) {
		
		
//		Q1
//		WAJP to print all the numbers from 1 to 10.

//		int i = 1;
//		while(i<=10) {
//			System.out.println("i is : " +i);
//			i++;
//		}
		
		
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++		
		
		
//		Q2
//		WAJP to print all the numbers from 10 to 1.
		
//		int i = 10;
//		while(i>=1) {
//			System.out.println("i is : "+i);
//			i--;
//		}
		
		
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++		
		
//		Q3
//		WAJP to print all the even numbers from 1 to 100.
		
		
//		int i = 1;
//		while(i<=100) {
//			if (i%2==0) 
//				System.out.println("Even No is : "+i);
//			i++;
//		}
		
		
		
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++		
	
		
		
		
//		Q4
//		WAJP to print all the odd numbers from 1 to 100.
		
//		int i = 0;
//		while(i<=100) {
//			if (i%2==1) 
//				System.out.println("Odd No is : "+i);
//			i++;
//				
//		}
		
		
		
		
		
		
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
		
		
		
		
//		Q5
//		WAJP to print and count all the numbers from 1 to 100 which are divisible by 7.
		
		
//		int i = 1;
//		int count = 0;
//		while(i<=100) {
//			if(i%7==0) {
//				System.out.println(i);
//				count++;
//			}
//			i++;
//		}
//		System.out.println("Total Count is : "+count);
//		
		
		
		
		
		
		
		
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
	
		
		
		
		
		
		
//		Q6
//		WAJP to print and count all the numbers from 1 to 100 which are divisible by 7 or ends with 7.
		
		
//		int i = 1;
//		int count = 0;
//		while(i<=100) {
//			if(i%7==0 || i%10==7) {
//				System.out.println(i);
//				count++;
//			}
//			i++;
//		}
//		System.out.println("Total count is : "+count);
		
		
		
		
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++		

		
		
		
		
//		Q7
//		WAJP to print and count all the numbers from 1 to 1000 which are divisible by 7 and also ends with 7.
		
//		int count = 0;
//		int i = 1;
//		while(i<=1000) {
//			if(i%7==0 && i%10==7) {
//				System.out.println(i);
//				count++;
//			}
//			i++;
//		}
//		System.out.println("Total count is : "+count);
		
		
		
		
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++		

		
		
		
/*		
		Q8
		WAJP to print all the factors of a number.(number itself excluded)
		i/p: 28
		o/p: 1 2 4 7 14
*/
		
//		1st Way : 
	
//		int n = 28;
//		int i = 1;
//		while(i<28) {
//			if(n%i==0) {
//				System.out.println(i);
//			
//			}
//			i++;
//		}
//			
	
//-----------------------------------------------------------------------------------------------		
		
//		2nd Way 
		
//		Kisi bhi Number ka Factor hamesha uske Half number tak hi number se mil jate hai
//		Kisi bhi Number ka factor (n/2) se bada nhi hota hai.
		
	
//		int n = 28;
//		int i = 1;
//		while(i<=n/2){
//			if (n%i==0) {
//				System.out.println(i);
//			
//			}
//			i++;
//			
//		}
//	
		
		
//-----------------------------------------------------------------------------------------------		
	
		
		
		
//		3rd Way
//		Kisi bhi Number ka Factors uske sqrt(n) se jyada nhi hota hai
		
//		int n = 28;
//		int i = 1;
//		while(i*i<=n){
//			if (n%i==0) {
//				int fact1 = i;
//				int fact2 = n/i;
//				System.out.println(fact1);
//				System.out.println(fact2);
//			
//			}
//			i++;
		
//-----------------------------------------------------------------------------------------------		

		}


}
