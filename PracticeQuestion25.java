import java.util.Scanner;

public class PracticeQuestion25 {
    /*Problem Description
    You are given two arrays.
    Return the sum of all elements in both arrays.

    Hint: Use a new variable sum, which can be used to store and return the sum.
    Hint: Explore loops to iterate the arrays one by one and add their values to sum.

    Sample Input 1
    [1,2,3] [4,5,6]

    Sample Output 1
    21*/

    public static int sumOfTwoArrays(int[] array1, int[] array2) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            sum2 += array2[i];
        }
        return sum1 + sum2;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int result = sumOfTwoArrays(array1, array2);
        System.out.println("The sum of two arrays are: " + result);
    }
}
