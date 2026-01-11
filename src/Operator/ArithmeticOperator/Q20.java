package Operator.ArithmeticOperator;
/*
Q20
Evaluate the Expression:
int x = 100 / 10 * 2 % 3;
System.out.println(x);
 */
public class Q20 {
    public static void main(String[] args) {

        int x = 100 / 10 * 2 % 3;
        System.out.println(x);
    }
}

/*
🧠 Operator Precedence (yaad rakho)

/, *, % same priority ke operators hote hain
Aur ye left to right evaluate hote hain.

🔢 Step-by-step calculation

Expression:

100 / 10 * 2 % 3

Step 1: /
100 / 10 = 10

Step 2: *
10 * 2 = 20

Step 3: %
20 % 3 = 2

✅ Final Output
2

✍️ Exam one-liner

Division, multiplication, and modulus have the same precedence and are evaluated from left to right.

🔴 Common Mistake

❌ % ko alag priority samajhna
✅ Actually / * % equal priority hote hain
 */