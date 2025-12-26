package pattern;
import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Rows : ");
		int n = sc.nextInt();
		
		printPattern(n);
		
	}
	
	
//	public static void printPattern(int n) {
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n; j++) {
//				System.out.print("("+i+","+j+")"+"\t");
//			}
//	
//			System.out.println();
//		}
		
//}
	
	
	
	
	
	
	
	
	
	
	
	
//	Q-7
//	public static void printPattern(int n) {
//	for(int i=1; i<=n; i++) {
//		for(int j=1; j<=n; j++) {
//			if(i==j || i+j==n+1)
//			System.out.print("* ");
//			else
//				System.out.print(" ");
//		}
//
//		System.out.println();
//	}
//	
//}
	
	
	
	
	
	
	
////	Q-8
//	public static void printPattern(int n) {
//		int mid=n/2+1;
//	for(int i=1; i<=n; i++) {
//		for(int j=1; j<=n; j++) {
//			if(i==mid || j==mid)
//			System.out.print("* ");
//			else
//				System.out.print("  ");
//		}
//
//		System.out.println();
//	}
//	
//}
	
	
	
	
	
	
	
	
	
//	Q-9
//	public static void printPattern(int n) {
//		int mid=n/2+1;
//	for(int i=1; i<=n; i++) {
//		for(int j=1; j<=n; j++) {
//			if(i==1 || i==n || j==1 || j==n || i==j || i+j==n+1 || i==mid || j==mid )
//			System.out.print("* ");
//			else
//				System.out.print("  ");
//		}
//
//		System.out.println();
//	}
//	
//}
	
	
	

	
	
	
	
	
//	Q-10
	
	public static void printPattern(int n) {
	int mid=n/2+1;
    for(int i=1; i<=n; i++) {
	for(int j=1; j<=n; j++) {
		if(i==1 || i==n || j==1 || j==n || i==j || i+j==n+1 || i==mid || j==mid )
		System.out.print("* ");
		else
			System.out.print("  ");
	}

	System.out.println();
}

}
	
}
