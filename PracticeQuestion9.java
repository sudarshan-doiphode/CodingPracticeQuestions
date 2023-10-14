import java.util.Scanner;

public class PracticeQuestion9 {
    /*Problem Description
    You are given three numbers as input.
    If EITHER the first number is equal to the second OR the second number is equal to the third, return true.
    Else, return false.*/

    public static boolean compareGivenNumbers(int n1, int n2, int n3) {
        return (n1 == n2 || n2 == n3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();
        final boolean compared = compareGivenNumbers(num1, num2, num3);
        if (compared) {
            System.out.println("The number1==number2 or Number2==Number3");
        } else {
            System.out.println("Numbers are not equal to each other");
        }
    }
}
