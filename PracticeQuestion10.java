import java.util.Scanner;

public class PracticeQuestion10 {
    /*Problem Description
    You are given three numbers as input.
    Return true only if the first number is greater than the second number AND the second number is greater than the third number.
    Else, return false.*/

    public static boolean comapreThreeNumbers(int n1, int n2, int n3) {
        return (n1 > n2 && n2 > n3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();
        final boolean result = comapreThreeNumbers(num1, num2, num3);
        if (result) {
            System.out.println("The Num1>Num2 and Num2>Num3");
        } else {
            System.out.println("The Num1 !> Num2 or Num2 !> Num3");
        }
    }
}
