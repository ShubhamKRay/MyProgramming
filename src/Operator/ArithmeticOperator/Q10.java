package Operator.ArithmeticOperator;
/*
Q10
Find Sum of three Digit number Without using Loops
Int n=123;
Output:
6
 */
public class Q10 {
    public static void main(String[] args) {
        int n = 123;
        int a = n%10;
        int b = (n/10)%10;
        int c = (n/100)%10;

        System.out.print(a+b+c);

    }
}
