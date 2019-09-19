package examples;

import java.util.Scanner;

public class AgeInsultGenerator {

    public static void main(String[] args) {

        int age;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age, buddy>>>>");
        age = input.nextInt();

        if(age < 12){
            System.out.print("Go play with your Leapfrog, dork.");
        }
        else if(age >= 12 && age < 19){
            System.out.print("You're never too old to play with a Leapfrog, dork." );
        }
        else if(age >= 19 && age < 25){
            System.out.print("Get a job to afford a Leapfrog, dork.");
        }
        else if(age >= 25 && age < 35){
            System.out.print("Shut. Up. Millennial.");
        }
        else if(age >= 35 && age < 45){
            System.out.print("uhhhhh uh idk bro you got me good.");
        }
        else if(age >= 45 && age < 55){
            System.out.print("You're basically a boomer. Boomer.");
        }
        else if (age >= 55){
            System.out.print("Boomer.");
        }
    }
}
