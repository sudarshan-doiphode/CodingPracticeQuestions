import java.util.Scanner;

public class PracticeQuestion14 {
    /*Problem Description
    Abyss loves negative numbers, so he converts any number given to him to its negative form (unless it's already non-positive,
    in which case he leaves it unchanged).
    Right now, Abyss is doing his homework, but he wants to play with his numbers immediately after he completes it. So,
    he wants you to write a function that will convert numbers for him while he is busy.*/

    public static int convertPositiveNumberToNegative(int num) {
        return (num > 0) ? (-num) : num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        int result = convertPositiveNumberToNegative(num);
        System.out.println(result);
    }

}
