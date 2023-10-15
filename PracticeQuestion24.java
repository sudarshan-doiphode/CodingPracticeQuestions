import java.util.Scanner;

public class PracticeQuestion24 {
    /*Problem Description
    Given a number n. Add all the numbers from 1 to n.
    Hint: Use loops to iterate from 1 to n.*/

    public static int addNumbersFrom1ToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = scanner.nextInt();
        int result = addNumbersFrom1ToN(num);
        System.out.println("Sum of numbers from 1 to N: " + result);
    }
}
