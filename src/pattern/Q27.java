package pattern;

import java.util.Scanner;

public class Q27 {

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the Rows : ");
				int n = sc.nextInt();
				printPattern(n);

			}
			
			
	/*		
			//1st way
			public static void printPattern(int n) {
				int star  =1;       char c = 'A';
				
				for(int i=1; i<=n; i++) {
					  
					for(int j=1; j<=star; j++) {
						System.out.print(c++ +" ");
					}
					star++;    
					System.out.println();
				}
			}

		}

	*/	
		
		
		
		
		
		
		

//2nd way
public static void printPattern(int n) {
	int star  =1;       int num = 65;
	
	for(int i=1; i<=n; i++) {
		  
		for(int j=1; j<=star; j++) 
			System.out.print( (char) (num++) +" ");
		
		star++;    
		System.out.println();
	}
}

}






