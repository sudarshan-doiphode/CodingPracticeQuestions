public class PracticeQuestion28 {
    /*Problem Description
    Given an array, check if the given array is in non decreasing order or not.
    We define an array as non-decreasing if nums[i] <= nums[i + 1] holds for every i (0-based) such that (0 <= i <= n - 2).

    Hint: Use loops to iterate and write appropriate terminating condition to avoid array index out of bound exception.

    Hint: At any point while iterating over the array,
    if you find that the condition of a non-decreasing array is not satisfied, you can immediately return false.

    Sample Input 1
    1 2 3 2

    Sample Output 1
    false

    Explanation 1
    Non-decreasing means that the following number should never be smaller than the previous number.
    As 3 is followed by 2 which is smaller, the array is not non-decreasing. So the output is false.   */

    //Non decreasing means increasing
    public static boolean isNonDecreasing(int[] array) {
        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2};
        boolean result = isNonDecreasing(array);
        System.out.println(result);
    }

}
