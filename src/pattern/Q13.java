package pattern;

import java.util.Scanner;

public class Q13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of Rows : ");
		int n = sc.nextInt();
	
		
		
/*		// Q13 - 1st way
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				
				System.out.print("* ");
				
				
			}
			System.out.println();

		}
	*/
		
		
		printPattern(n);
	}

	
	
	
	
	public static void printPattern(int n) {
		int star=1;
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=star; j++) {
				System.out.print("* ");
			}
			star++;
			System.out.println();
		}
		
	}
}
