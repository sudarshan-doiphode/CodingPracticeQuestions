import java.util.Scanner;

public class PracticeQuestion1 {

/*    Problem Description
    You are given two numbers as input.
    You have to return the sum of the two numbers as output.*/

    public static int sumOfTwoNumbers(int n1, int n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        final int sum = sumOfTwoNumbers(num1, num2);
        System.out.println("The sum of two Numbers are: " + sum);
    }
}
