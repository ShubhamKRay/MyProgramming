package Operator.ArithmeticOperator;
/*
Q19
Evaluate the Expression:
int x = 1 + 2 / 3 * 4;
System.out.println(x);
 */
public class Q19 {
    public static void main(String[] args) {
        int x = 1 + 2 / 3 * 4;
        System.out.println(x);
    }
}

/*
/ aur * → same priority

Same priority wale operators left to right evaluate hote hain

+ sabse baad

🔢 Step-by-step evaluation

Expression:

1 + 2 / 3 * 4

Step 1: / (left to right)
2 / 3 = 0   // integer division


Ab expression ban gaya:

1 + 0 * 4

Step 2: *
0 * 4 = 0


Ab expression:

1 + 0

Step 3: +
= 1

✅ Final Output
1

⚠️ Important Concept (Exam favourite)

2 / 3 = 0 (kyunki dono int hain)

Uske baad multiply karne ka koi fayda nahi
 */