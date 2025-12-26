package pattern;

import java.util.Scanner;

public class Yesterday22Sep {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Rows : ");
			int n = sc.nextInt();
			printPattern(n);

		}
		

	
	
	
		
		//Pyramid 
//		public static void printPattern(int n) {
//			int star = 1; int space = n-1;
//			
//			for(int i=1; i<=n; i++) {
//				for(int j = 1; j<=space; j++)
//					System.out.print("    ");
//				for(int j = 1; j<=star; j++)
//					System.out.print("*   ");
//				star+=2; space--;
//				System.out.println();
//			}
//				
//		}
	
	
	
/*	 Output :
		Enter the Rows : 
			5
			                *   
			            *   *   *   
			        *   *   *   *   *   
			    *   *   *   *   *   *   *   
			*   *   *   *   *   *   *   *   * 
	
*/	
	
	
	
	
	
	
	
	
	
	
	
	/*   // Space Pyramid Pattern
	
	public static void printPattern(int n) {
		int star = 1; int space = n-1;
		
		for(int i=1; i<=n; i++) {
			for(int j = 1; j<=space; j++)
				System.out.print("  ");
			for(int j = 1; j<=star; j++)
				System.out.print("*   ");
			star++; space--;
			System.out.println();
		}
			
	}
	
/*	
   Enter the Rows : 5

        *   
      *   *   
    *   *   *   
  *   *   *   *   
*   *   *   *   * 
	
	
	
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	
	//Q16
	public static void printPattern(int n) {
		int star=n;    int space=0;
		
		for(int i=1; i<=n; i++) {
			for(int j = 1; j<=space; j++)
				System.out.print("  ");
			for(int j = 1; j<=star; j++)
				System.out.print("* ");
			star--; space++;
			System.out.println();
		}
			
	}
	
	/*
	//Output
	Enter the Rows : 
		5
		* * * * * 
		  * * * * 
		    * * * 
		      * * 
		        * 
	                     */
	
	
	
	
	
	
	
	
	
	
	/*
	
	//Inverted Pyramid
	public static void printPattern(int n) {
		int star=2*n-1;    int space=0;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++)
				System.out.print("  ");
			for(int j=1; j<=star; j++)
				System.out.print("* ");
			star-=2; space++;
			System.out.println();
		}
			
	}
	   
	Enter the Rows : 
		5
		* * * * * * * * * 
		  * * * * * * * 
		    * * * * * 
		      * * * 
		        * 
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	
	//Q-94
	public static void printPattern(int n) {
		int star=n;    int space=0;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++)
				System.out.print("  ");
			for(int j=1; j<=star; j++)
				System.out.print("*   "); //2space extra dal diya nhi to Q-16 ki tarah ho jata baki sab same
			star--; space++;
			System.out.println();
		}
			
	}
	
	/*
	Output
	7
	*   *   *   *   *   *   *   
	  *   *   *   *   *   *   
	    *   *   *   *   *   
	      *   *   *   *   
	        *   *   *   
	          *   *   
	            *  
	
	*/
	
	
	
	
	
	
	
/*	
	
	public static void printPattern(int n) {
		int star=n;    int space=0;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++)
				System.out.print("  ");
			for(int j=1; j<=star; j++)
				System.out.print(star+"   "); //2space extra dal diya nhi to Q-16 ki tarah ho jata baki sab same
			 star--;   space++;
			System.out.println();
		}
			
	}
	Enter the Rows : 
		5
		5   5   5   5   5   
		  4   4   4   4   
		    3   3   3   
		      2   2   
		        1   

	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	//Q95
	public static void printPattern(int n) {
		int star=n;    int space=0;  int num=1;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++)
				System.out.print("  ");
			for(int j=1; j<=star; j++)
				System.out.print(num+"   "); //2space extra dal diya nhi to Q-16 ki tarah ho jata baki sab same
			 star--; num++;  space++;
			System.out.println();
		}
			
	}	
	
	
	Enter the Rows : 
		5
		1   1   1   1   1   
		  2   2   2   2   
		    3   3   3   
		      4   4   
		        5   

	*/
	
	
	
	
	
	
	/*
	//2nd Way
	public static void printPattern(int n) {
		int star=n;    int space=0;  
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++)
				System.out.print("  ");
			for(int j=1; j<=star; j++)
				System.out.print(i+"   "); //2space extra dal diya nhi to Q-16 ki tarah ho jata baki sab same
			 star--;  space++;
			System.out.println();
		}
			
	}
	
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	
	Q-96
	public static void printPattern(int n) {
		int star=n;    int space=0;  int num=1;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++)
				System.out.print("  ");
			for(int j=1; j<=star; j++)
				System.out.print(num%2+"   "); //2space extra dal diya nhi to Q-16 ki tarah ho jata baki sab same
			 star--; num++;  space++;
			System.out.println();
		}
			
	}	
	
	Enter the Rows : 
		5
		1   1   1   1   1   
		  0   0   0   0   
		    1   1   1   
		      0   0   
		        1   
*/
	
	
	
	
	/*
	  
	  	        
	//2nd Way	        
	public static void printPattern(int n) {
		int star=n;    int space=0;  
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++)
				System.out.print("  ");
			for(int j=1; j<=star; j++)
				System.out.print(i%2+"   "); //2space extra dal diya nhi to Q-16 ki tarah ho jata baki sab same
			 star--;  space++;
			System.out.println();
		}
			
	}        
		*/        
		
	
	
	
	
	/*	        
		
		        
		        
		        
		        
		        
	
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
//		Q-97        
	public static void printPattern(int n) {
		int star=n;    int space=0;  int num=1;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++)
				System.out.print("  ");
			for(int j=1; j<=star; j++)
				System.out.print(num++ +"   "); //2space extra dal diya nhi to Q-16 ki tarah ho jata baki sab same
			 star--;   space++;   num=1;
			System.out.println();
		}
			
	}       
		        
	Output	        
	Enter the Rows : 
		5
		1   2   3   4   5   
		  1   2   3   4   
		    1   2   3   
		      1   2   
		        1  
		        
	*/	        
		        
		        
	
	
	
	
	
	
	
	
	/*
	//2nd way
	public static void printPattern(int n) {
		int star=n;    int space=0;  
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++)
				System.out.print("  ");
			for(int j=1; j<=star; j++)
				System.out.print(j+"   "); //2space extra dal diya nhi to Q-16 ki tarah ho jata baki sab same
			 star--;  space++;
			System.out.println();
		}
			
	}	
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	
//	Q-98
	public static void printPattern(int n) {
		int star=n;    int space=0;  
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++)
				System.out.print("  ");
			for(int j=1; j<=star; j++)
				System.out.print(j%2+"   "); //2space extra dal diya nhi to Q-16 ki tarah ho jata baki sab same
			 star--;  space++;
			System.out.println();
		}
			
	}
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	
//	Q-99
	public static void printPattern(int n) {
		int star=n;    int space=0;  int num=1;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++)
				System.out.print("  ");
			for(int j=1; j<=star; j++)
				System.out.print(num++ +"   "); //2space extra dal diya nhi to Q-16 ki tarah ho jata baki sab same
			 star--;   space++;   
			System.out.println();
		}
			
	} 
	
//	Output
	Enter the Rows : 
		5
		1   2   3   4   5   
		  6   7   8   9   
		    10   11   12   
		      13   14   
		        15   

	*/
	
	
	
	
	
	
	
	
	
	
//	Q13
//	
//	public static void printPattern(int n) {
//		  
//	
//		int star=1;  
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=star; j++) 
//				System.out.print("* ");
//			star++;
//			System.out.println();
//		}
//	
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Q14
//	public static void printPattern(int n) {
//		  
//	
//		int star=n;  
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=star; j++) 
//				System.out.print("* ");
//			star--;
//			System.out.println();
//		}
//	
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Q-17
//	public static void printPattern(int n) {
//		  
//	
//		int star=1; 
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=star; j++) 
//				
//				System.out.print(i+" ");
//			star++;
//			System.out.println();
//		}
//	
//	}
	
	
	
	
	
	
	
	
	
	
	
//	Q-18
//	public static void printPattern(int n) {
//	
//		int star=1; 
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=star; j++) 
//				
//				System.out.print(i%2+" ");
//			star++;
//			System.out.println();
//		}
//	
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Q-19
//	public static void printPattern(int n) {
//	
//		int star=1; 
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=star; j++) 	
//				System.out.print(j+" ");	
//			star++;
//			System.out.println();
//		}
//	
//	}
	
	
	
	
	
	
	
//	Q-20
//	public static void printPattern(int n) {
//		  
//		
//		int star=1; 
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=star; j++) 	
//				System.out.print(j%2+" ");	
//			star++;
//			System.out.println();
//		}
//	
//	}
	
	
	
	
	
	
	
	
	
//Q-21	
//public static void printPattern(int n) {
//		  
//		
//		int star=1, num=n; 
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=star; j++) 	
//				System.out.print(num +" ");	
//			star++; num--;
//			System.out.println();
//		}
//	
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Q-22
public static void printPattern(int n) {
		  
		
		int star=1, num=1; 
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=star; j++) 	
				System.out.print(num-- +" ");	
			star++; num+=2;
			System.out.println();
		}
	
	}
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		        
		        
		      		      
		
			
			
		
		
		
		
		
		
		
		




