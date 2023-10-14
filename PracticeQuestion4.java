import java.util.Scanner;

public class PracticeQuestion4 {
    /*Problem Description
    You are given four numbers as input.
    You have to add the first three numbers,
    then subtract the fourth number from the sum of the first three numbers and return the result.*/

    public static int addAndSubtract(int n1, int n2, int n3, int n4){
        return (n1+n2+n3)-n4;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();
        System.out.println("Enter the fourth number: ");
        int num4 = scanner.nextInt();
        final int result = addAndSubtract(num1, num2, num3, num4);
        System.out.println("The result is : "+result);
    }

}
