import java.util.Scanner;

public class PracticeQuestion16 {
    /*Problem Description
    You are given three numbers as input.
    You have to return the smallest of the three numbers as output.

    Hint: This can be solved using if else.
    It can also be solved using Math.min() library function*/

    public static int minOfThreeNumbers(int n1, int n2, int n3) {
        int min1 = Math.min(n1, n2);
        int min2 = Math.min(n2, n3);
        return Math.min(min1, min2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();
        int result = minOfThreeNumbers(num1, num2, num3);
        System.out.println("Minimum number is: " + result);
    }
}
