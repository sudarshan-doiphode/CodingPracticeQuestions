import java.util.Scanner;

public class PracticeQuestion19 {
    /*
    Problem Description
    A school has the following rules for grading system:
    [0, 25) - F
    [25, 45) - E
    [45, 50) - D
    [50, 60) - C
    [60, 80) - B
    [80, 100] - A
    If the input is less than 0 or greater than 100 then it is considered invalid.
    You are given a real number score, print the corresponding grade or "Invalid" if the input is invalid*/

    public static String gradeOfScore(int score) {
        String grade = "";
        if (score >= 0 && score <= 25) {
            grade = "F";
        } else if (score >= 25 && score <= 45) {
            grade = "E";
        } else if (score >= 45 && score <= 50) {
            grade = "D";
        } else if (score >= 50 && score <= 60) {
            grade = "C";
        } else if (score >= 60 && score <= 80) {
            grade = "B";
        } else if (score >= 80 && score <= 100) {
            grade = "A";
        }
        else {
            grade = "Invalid";
        }
        return grade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the score: ");
        int score = scanner.nextInt();
        final String result = gradeOfScore(score);
        System.out.println("The grade is :" + result);
    }
}
