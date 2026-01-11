package Operator.ArithmeticOperator;
/*
Q21
Evaluate the Expression:
System.out.println(0/0);
 */
public class Q21 {
    public static void main(String[] args) {
        System.out.println(0/0);
    }
}

/*
👉 Runtime Exception aayega

Exception in thread "main" java.lang.ArithmeticException: / by zero

🧠 Reason (simple words me)

Java me integer division (int / int)

Jab divisor 0 hota hai → illegal

Chahe numerator bhi 0 ho, phir bhi ❌

👉 0 ÷ 0 = undefined, isliye Java allow nahi karta

🔍 Important distinction (Exam very important)
❌ Integer division (ERROR)
System.out.println(0 / 0);   // ArithmeticException
System.out.println(5 / 0);   // ArithmeticException

✅ Floating-point division (NO error)
System.out.println(0.0 / 0.0);  // NaN
System.out.println(5.0 / 0.0);  // Infinity

📌 Outputs (floating-point case)
Expression	Output
0.0 / 0.0	NaN
5.0 / 0.0	Infinity
-5.0 / 0.0	-Infinity
✍️ Exam one-liner

Division by zero using integer operands results in ArithmeticException at runtime in Java.
 */