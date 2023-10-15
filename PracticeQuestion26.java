import java.util.Objects;

public class PracticeQuestion26 {
    /*Problem Description
    Write a function that can return the smallest value of an array or the index of that value (0-based).
    The function's 2nd parameter will tell whether it should return the value or the index.

    Assume the first parameter will always be an array filled with at least 1 number and no duplicates.
    Assume the second parameter will be a string holding one of two values: either 'value' or 'index'.

    (Source: Codewars)*/

    public static int returnSmallestValueInAnArray(int[] array, String toReturn) {
        int minmumNumber = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minmumNumber) {
                minmumNumber = array[i];
                index = i;
            }
        }
        if (Objects.equals(toReturn, "Index")) {
            return index;
        } else {
            return minmumNumber;
        }
    }

    public static void main(String[] args) {
        int array[] = {12, 4, 2, 6, 9, -6, 0, 6};
        int result = returnSmallestValueInAnArray(array, "Index");
        System.out.println(result);
    }

}
