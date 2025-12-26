package pattern;

import java.util.Scanner;

public class InvertedPyramid {


				public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
			    System.out.println("Enter the Rows : ");
		        int n = sc.nextInt();
				printPattern(n);

				}
										
//					Q 107		
//					public static void printPattern(int n) {
//					int space = 0; int star = 2*n-1;       
//								
//					for(int i=1; i<=n; i++) {
//									
//					for(int j=1; j<=space; j++) 
//					System.out.print("  ");
//					
//					for(int j=1; j<=star; j++)
//						System.out.print("* ");
//									
//					star-=2;   space++;
//					System.out.println();
//					
//					}
//					  
//						
//				}
//			}
							



				
				
				
				
				
				
//				Q94
//				public static void printPattern(int n) {
//					int space = 0; int star = n;       
//								
//					for(int i=1; i<=n; i++) {
//									
//					for(int j=1; j<=space; j++) 
//					System.out.print("  ");
//					
//					for(int j=1; j<=star; j++)
//						System.out.print("*   ");
//									
//					star--;   space++;
//					System.out.println();
//					
//					}
//					  
//						
//				}
//			}



				
				
				
				
//				Q-96
				public static void printPattern(int n) {
					int space = 0; int star = n;       
								
					for(int i=1; i<=n; i++) {
									
					for(int j=1; j<=space; j++) 
					System.out.print("  ");
					
					for(int j=1; j<=star; j++)
						System.out.print(i);
									
					star--;   space++;
					System.out.println();
					
					}
					  
						
				}
			}




