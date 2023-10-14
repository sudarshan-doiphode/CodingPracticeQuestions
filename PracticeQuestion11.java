import java.util.Scanner;

public class PracticeQuestion11 {
    /*Problem Description
    You need to create a static method named isLessThan(),
    which will take two integer values as input and return true if the first integer is less than the second.
    Else, it returns false.*/

    public static boolean isLessThan(int n1, int n2) {
        return n1 < n2 ? true : false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        final boolean result = isLessThan(num1, num2);
        System.out.println(result);
    }
}
