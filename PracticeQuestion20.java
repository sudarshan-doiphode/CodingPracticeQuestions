import java.util.Scanner;

public class PracticeQuestion20 {
    /*Problem Description
    Given the age and weight of a person,
    determine if he is eligible for blood donation.
    if the age is less than 18, return "UnderAge",
    if the age is more than 18, but weight is less than or equal to 50, return "NotEligible",
    if the age is more than 18, but weight more than 50, return 'Eligible'.*/

    public static String isEligibleForBloodDonation(int age, int weight) {
        String eligibility = "";
        if (age < 18) {
            eligibility = "UnderAge";
        } else if (age >= 18) {
            if (weight <= 50) {
                eligibility = "NotEligible";
            } else {
                eligibility = "Eligible";
            }
        }
        return eligibility;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        System.out.println("Enter weight: ");
        int weight = scanner.nextInt();
        String result = isEligibleForBloodDonation(age, weight);
        System.out.println(result);
    }
}
