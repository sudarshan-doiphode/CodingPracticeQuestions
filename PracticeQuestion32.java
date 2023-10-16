import java.util.Objects;

public class PracticeQuestion32 {
    /*Problem Description
    An array of strings, representing the names of people in a village is given to you.
    A "Zombie" has sneaked into the village and is also part of the array.
    The zombie eats the person who is to the right of it.
    Tell the person who is going to be eaten to run away.
    It is guaranteed that there will always be at least one person to the right of the zombie.

    Hint: Iterate through the array using a loop and use string comparison to find the Zombie.

    HInt: Once you find the zombie, keep track that you have found it and find the person next to it.


    Sample Input 1
    ["Anil","Zombie","Pulkit","Chinmay"]

    Sample Output 1
    Run away Pulkit!

    Explanation 1
    Pulkit is to the right of the Zombie. So the output is "Run away Pulkit!"*/

    public static String runAwayFromZombie(String[] village) {
        String message = "";
        for (int i = 0; i < village.length - 1; i++) {
            if (Objects.equals(village[i], "Zombie") && Objects.nonNull(village[i + 1])) {
                message = "Run away " + village[i + 1];
                break;
            } else {
                message = "No Zombie Found";
            }
        }
        return message;
    }

    public static void main(String[] args) {
        String[] array = {"Anil", "Zombie", "Sachin", "Madhav"};
        String result = runAwayFromZombie(array);
        System.out.println(result);
    }

}
