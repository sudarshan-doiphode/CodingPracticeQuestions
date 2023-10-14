import java.util.Scanner;

public class PracticeQuestion13 {
    /*Problem Description
    You are a kindergarten teacher.
    You want to teach your students that being truthful is a good thing and that falsehood is a bad thing.
    Complete the function to return "Good" when the input is true and "Bad" when the input is false.*/

    public static String checkInput(boolean input){
        return (input)?"Good":"Bad";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean value = scanner.nextBoolean();
        final String result = checkInput(value);
        System.out.println(result);
    }
}
