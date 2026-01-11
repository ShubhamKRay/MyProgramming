package Operator.ArithmeticOperator;
/*

Q18
Evaluate the Expression:
int x = 1 + 2 * 3 / 4;
System.out.println(x);
 */
public class Q18 {
    public static void main(String[] args) {
        int x = 1 + 2 * 3 / 4;   // * aur / left to right evaluate hote hain.
        System.out.println(x);   //   6 / 4 = 1   // kyunki int division hai
    }
}

/*
Java me order hota hai:

        * (multiply)

        / (divide)

        + (add)

        👉 * aur / left to right evaluate hote hain.

        🔢 Step-by-step calculation

Expression:

        1 + 2 * 3 / 4

Step 1: *
        2 * 3 = 6


Ab expression:

        1 + 6 / 4

Step 2: /
        6 / 4 = 1   // kyunki int division hai


        (decimal .5 ignore ho jata hai)

Ab expression:

        1 + 1

Step 3: +
        = 2

        ✅ Final Output
2

 */