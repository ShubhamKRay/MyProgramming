package Operator.ArithmeticOperator;
/*
Q8
Find the Last Digit of a Number Without using % operator.
Int n=12345;
Output:
5
 */
public class Q8 {
    public static void main(String[] args) {
        int n = 12345;
        int o = n-(n/10)*10;
        System.out.println(o);
    }

}
