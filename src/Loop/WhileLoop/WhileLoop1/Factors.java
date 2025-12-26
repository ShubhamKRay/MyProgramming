package Loop.WhileLoop.WhileLoop1;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		
		
		
		
		
//		Factors Programming 
/*		
		int n = 28;
		int i = 1;
		
/*		
		1st Way 
		very slow logic
		
		while(i<=n) {
			if(n%i==0)
				System.out.println(i);
			i++;
			}
*/		
		

		
		
		
		
//   Kisi bhi Number ka Factors us Number ke aadhe se jyada wali Number se nhi nikalta hai
		
/*	    while(i<=n/2) {
		if(n%i==0)
			System.out.println(i);
		i++;
	}
	*/
		
		
		
//		Kisi bhi Number ka Factors uske sqrt se jyada wali number se nhi aati hai
/*		
		while(i*i<=n) {
			if(n%i==0) {
				int fact1 = i;
				int fact2 = n/i;
				System.out.println(fact1);
				System.out.println(fact2);
			}
			i++;
		}
			
		
*/	
	
		
		
		
//	Agar main kisi number jiska Perfect square ho uska factor nikalta hu to us number ka square Number double bar print ho jaega 
//		Esliye ye condition fail kar jaega
/*	
		int n = 36;
		int i = 1;
		while(i*i<=n) {
			if(n%i==0) {
				int fact1 = i;
				int fact2 = n/i;
				System.out.println(fact1);
				System.out.println(fact2);
			}
			i++;
		}
		
//	yaha par 6 double bar print ho raha hai esliye ye condition fail kar jaega Perfect square wale Number ke liye	ye condn kam nhi karega
		
*/		
		
		
		
//		Very fast logic
//		This program print All factors
/*		
		int n = 16;
		int i = 1;
		while(i*i<=n) {
			if(n%i==0) {
				int fact1 = i;
				int fact2 = n/i;
				if(fact1==fact2)
					System.out.println(fact1);
				else {
					System.out.println(fact1);
					System.out.println(fact2);
				}
			}
				i++;
		}
		
	*/	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	Print All Factors (Excluding Number itself)
		
		
// 1 ko bahar hi print karwa diya kyunki ye kisi bhi number ko divide kar deta hai aur yah sabhi ka factor bhi hota hai 	
		
/*		int n = 16;
		System.out.println("1");
		int i = 2;
		while(i*i<=16) {
			if(n%i==0) {
				int fact1 = i;
			    int fact2 = n/i;
				if(fact1==fact2)                  //    yaha par if(fact1!=fact2) kar du to 
					System.out.println(fact1);    //    syso(fact1); and syso(fact2); yahi par print karwa denge
					                               //   else me kisi 1 fact ko print karwa denge to as it same hi output milega
			
				else {
					System.out.println(fact1);
					System.out.println(fact2);
				}
		}
			i++;
		}
		
*/		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Print All Factors (Including Number itself)

		
/*
		printFactor(19);
		
	}
		
		public static void printFactor(int n) {
		System.out.print("1 "+n+" ");   // agar yaha par kahe ki (Number itself not included) ka print karwana ho to
		                                // simple hum n ko yaha se remove kar denge to ho jaega 
		int i = 2;
		while(i*i<=n) {
			if(n%i==0) {
				int fact1 = i;
			    int fact2 = n/i;
				if(fact1==fact2) 
					System.out.print(fact1+" ");
			
				else {
					System.out.print(fact1+" "+fact2+" ");
					
				}
		}
			i++;
		}
		
		}	
		
	*/	
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("\nTotal count is : "+countFactor(28));
		
		
//	}
		
//		Count and Print All Factors (Number itself included)
		
/*		public static int countFactor(int n) {
			System.out.print("1 "+n+" ");
			int count = 2;
			int i = 2;
			while(i*i<=n) {
				if(n%i==0) {
					int fact1 = i;
					int fact2 = n/i;
					if(fact1==fact2) {
						System.out.print(fact1+" ");
						count+=1;
					}
					else {
						System.out.print(fact1+" "+fact2+" ");
						count+=2;
					}
					
				}
				i++;
				
			}
			return count;
		
		}

	
	*/
	
	
	
	
	
	
	
	
	
	
	
//	Count All factors (Number itself included)     
	
/*	
  public static int countFactor(int n) {
		
		int count = 2;    //	 count=1; jab Number included na ho tab { Count All factors (No.itself not included) }   
		int i = 2;
		while(i*i<=n) {
			if(n%i==0) {
				int fact1 = i;
				int fact2 = n/i;
				if(fact1==fact2) {
					
					count+=1;
				}
				else {
					
					count+=2;
				}
				
			}
			i++;
			
		}
		return count;
	
	}
	
*/	
	
	
	

	
	
	
	
	
	
/*	Q8
	WAJP to print all the factors of a number.(number itself excluded)
	i/p: 28
	o/p: 1 2 4 7 14
*/
	
/*
	printFactor(16);
}


	public static void printFactor(int n) {
		System.out.print("1 ");
		int i = 2;
		while(i*i<n) {
			if(n%i==0) {
				int fact1 = i;
				int fact2 = n/i;
				if(fact1!=fact2) 
				System.out.print(fact1+" "+fact2+" ");
				else
					System.out.print(fact1+" ");
			}
			i++;
		}
	}
	
	*/
	
	
	
	
	
/*	Q-9
	WAJP to count the factors of a number.(number itself excluded)
	i/p: 28
	o/p: Total Factors are: 5
*/	

		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}
}