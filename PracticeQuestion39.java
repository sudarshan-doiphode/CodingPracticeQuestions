import java.util.Objects;

public class PracticeQuestion39 {
    /*Problem Description
    Arjun Singh is currently an International Master at chess.
    He now wants to become a chess GrandMaster.

    The hierarchy of titles is Master < International Master < Grand Master.
    He has just finished his final chess tournament of the year.
    Arjun needs to win at least 5 games to become a chess GrandMaster.
    However, if he does not win any game, he gets demoted to a Master at chess.
    Given an array of strings containing 'Win' and 'Loss' indicating the results of his games at the tournament,
    return the title Arjun will be holding after the tournament.

    Hint: Understand the logic clearly and implement them using conditionals.
    Not winning a single game demotes him to Master. Winning at least games makes him GrandMaster.
    Else, he stays an International Master.

    Sample Input 1
    {"Loss", "Loss", "Win", "Loss", “Loss”}

    Sample Output 1
    International Master

    Explanation 1
    Arjun neither won 5 games nor lost all games.
    so he retains the International Master title.*/

    public static String titleAfterTournament(String[] array) {
        String title = "";
        int counter = 0;
        String value = "Win";
        for (int i = 0; i < array.length; i++) {
            if (value.equals(array[i])) {
                counter++;
            }
        }
        if (counter >= 5) {
            title = "Grand Master";
        } else if (counter == 0) {
            title = "Master";
        } else {
            title = "International Master";
        }
        return title;
    }

    public static void main(String[] args) {
        String[] array = {"Loss", "Loss", "Win", "Loss", "Loss"};
        String result = titleAfterTournament(array);
        System.out.println(result);
    }
}
