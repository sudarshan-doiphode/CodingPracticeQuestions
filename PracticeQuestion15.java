import java.util.Scanner;

public class PracticeQuestion15 {
    /*Problem Description
    You are given two numbers as input.
    You have to return the largest of the two numbers as output.

    Hint: This can be solved using if else.
    It can also be solved using Math.max() library function*/

    public static int maxOfTwoNumber(int n1, int n2) {
        return Math.max(n1, n2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        int result = maxOfTwoNumber(num1, num2);
        System.out.println("Maximum number is :" + result);
    }
}
