package Operator.ConditionalOperator;
import java.util.Scanner;

public class NimGame {

    // LeetCode wali logic
    public static boolean canWinNim(int n) {
        return n % 4 != 0;   // agar multiple of 4 hai to haar, otherwise jeet
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stones: ");
        int n = sc.nextInt();

        if (canWinNim(n)) {
            System.out.println("You can win the game!");
        } else {
            System.out.println("You will lose the game!");
        }

        sc.close();
    }
}
