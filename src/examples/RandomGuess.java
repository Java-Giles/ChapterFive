package examples;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess {

    public static void main(String[] args) {

        int choice;

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int randPick= rand.nextInt(10) + 1;

        System.out.print("Pick a number between 1 and 10>>>> ");
        choice = input.nextInt();

        if(choice == randPick) {
            System.out.print("Congrats! You're a good guesser");
        }
        else if(choice > randPick){
            System.out.print("Nope, the number was lower.");
        }
        else if(choice < randPick){
            System.out.print("Nope, the number was higher.");
        }
    }
}
