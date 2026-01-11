package Operator.ArithmeticOperator;
/*
Q9
Reverse a 3-Digit Number Using Pure Arithmetic operator.
Int n=123;
Output:
321
 */
public class Q9 {
    public static void main(String[] args) {
        int n = 123;
        int a = n%10;
        int b = (n/10)%10;
        int c = (n/100)%10;

        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
    }
}
