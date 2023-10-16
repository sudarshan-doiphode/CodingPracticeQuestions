import java.util.Scanner;

public class PracticeQuestion33 {
    /*Problem Description
    Doraemon is planning to use the Time Machine to go to the future and spend some time with his sister Dorami.
    As you know, Doraemon loves eating Dora Cakes. Doraemon eats exactly 0.5 Dora Cake everyday (i.e. half).
    Given the number of days of his trip as input, return the number of Dora Cakes you should pack for his trip (round this off to the previous integer value if you see a decimal).
    (Note : The number of days need not be a whole number).


    Hint: Understand the logic required.
    Number of cakes is half the number of days.

    Hint: Given that the result might be a decimal value, see if you can use type casting to get the previous smaller integer and return that.*/

    public static int doraCakes(int days) {
        double cakeForTrip = days / 2;
        int cakesDoremonAte = (int) cakeForTrip;
        return cakesDoremonAte;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter days for trip: ");
        int days = scanner.nextInt();
        int result = doraCakes(days);
        System.out.println("Doremon ate : " + result + " Dora cakes in trip");
    }
}
