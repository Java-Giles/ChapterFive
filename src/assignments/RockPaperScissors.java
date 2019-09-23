package assignments;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int opponentGuess= rand.nextInt(3) + 1;
        int yourGuess;
        String winResult = null;

        System.out.print("Choose between Rock, Paper, or Scissors \n pick 1 for rock \n pick 2 for paper \n pick 3 for scissors \n Choice >>>>");
        yourGuess = input.nextInt();

        if(yourGuess == 1){
            if(opponentGuess == 1)
                winResult = "You both tied.";
            else if(opponentGuess == 2)
                winResult = "Paper covers rock, you lose.";
            else if(opponentGuess == 3)
                winResult = "Rock breaks scissors, you win.";
        }
        else if(yourGuess == 2){
            if(opponentGuess == 1)
                winResult = "Paper covers rock, you win.";
            else if(opponentGuess == 2)
                winResult = "You both tied.";
            else if(opponentGuess == 3)
                winResult = "Rock breaks scissors, you win.";
        }
    }
}
