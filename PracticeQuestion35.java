public class PracticeQuestion35 {
    /*Problem Description
    In a school, the number of students per class are represented as an n*m matrix.
    Each row represents one grade with each column representing a separate section of that grade.
    Given one such matrix, return the total number of students in the school.

    Hint: To iterate through 2D arrays, use nested loops.
    Hint: Iterate through the array and compute the sum of all elements.

    Sample Input 1
    {{23,48},{12,18}}

    Sample Output 1
    101

    Explanation 1
    Adding all the students, we get 23 + 48 + 12 + 18 = 101*/

    public static int addAllStudentsFrom2DMatrix(int[][] school) {
        int sum = 0;
        int row = school.length;
        for (int i = 0; i < row; i++) {
            int column = school[i].length;
            for (int j = 0; j < column; j++) {
                sum += school[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] school = {{23, 48}, {12, 18}};
        int result = addAllStudentsFrom2DMatrix(school);
        System.out.println("The total number of Student in school are: " + result);
    }

}
