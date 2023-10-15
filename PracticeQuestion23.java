import java.util.Scanner;

public class PracticeQuestion23 {
    /*Problem Description
    Tom and Jerry have decided to play the classic Stone-Paper-Scissor game to decide who gets to have the cake kept in the fridge.
    You are given their choices as input. In case the first player wins, return "Tom", else if the second player wins,
    return "Jerry", else return "Share it!".
    At each turn, either player chooses Stone, Paper or Scissor.
    Based on the rules given below in the format of A beats B, the person who choses A wins the game.
    If both choose the same option then the result is "Share it!".
    Stone beats Scissor
    Scissor beats Paper
    Paper beats Stone

    Sample Input 1
    "Stone" "Paper"

    Sample Output 1
    Jerry

    Explanation 1
    As Paper beats Stone, Jerry wins.*/

    public static String rockPaperScissor(String player1Choice, String player2Choice) {
        String result = "";
        if (player1Choice == player2Choice) result = "Share it";
        else if ((player1Choice.equals("Stone") && player2Choice.equals("Scissor"))
                || (player1Choice.equals("Scissor") && player2Choice.equals("Paper"))
                || (player1Choice.equals("Paper") && player2Choice.equals("Stone"))
        ) {
            result = "Tom";
        } else if ((player2Choice.equals("Stone") && player1Choice.equals("Scissor"))
                || (player2Choice.equals("Scissor") && player1Choice.equals("Paper"))
                || (player2Choice.equals("Paper") && player1Choice.equals("Stone"))
        ) {
            result = "Jerry";
        } else {
            result = "Share it";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter player 1 choice: ");
        String choice1 = scanner.nextLine();
        System.out.println("Enter player2 choice: ");
        String choice2 = scanner.nextLine();
        String result = rockPaperScissor(choice1, choice2);
        System.out.println(result);

    }

}
