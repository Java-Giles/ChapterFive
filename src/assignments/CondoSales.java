package assignments;

import java.util.Scanner;

public class CondoSales {

    public static void main(String[] args) {

        int choice;
        double price = 0;
        String viewChosen = null;

        Scanner inp = new Scanner(System.in);
        System.out.print("What kind of view do you want? \n pick 1 for park view \n pick 2 for golf course view \n pick 3 for lake view \n Choice>>>> ");
        choice = inp.nextInt();

        if (choice == 1) {
            price = 150000;
            viewChosen = "the park view";
            garageSelection(price, viewChosen);
        }
        else if(choice == 2) {
            price = 170000;
            viewChosen = "the golf course view";
            garageSelection(price, viewChosen);
        }
        else if(choice == 3) {
            price = 210000;
            viewChosen = "the lake view";
            garageSelection(price, viewChosen);
        }
        else{
            price = 0;
            viewChosen = "nothing, you messed up";
            System.out.println("You messed up a simple task, idiot. \nLuckily we won't charge you anything, dork.");
        }
    }
    public static void garageSelection(double price, String viewChosen){

        Scanner inp = new Scanner(System.in);
        String garageChoice = null;
        int choice;
        double totalPrice = 0;

        System.out.println("Now, do you want a garage or a parking space? \n select 1 for a garage \n select 2 for a parking space \n select 3 for none \n choice>>>> ");
        choice = inp.nextInt();

        if(choice == 1){
            garageChoice = "a garage";
            totalPrice = price + 5000;
        }
        else if(choice == 2){
            garageChoice = "a parking space";
            totalPrice = price;
        }
        else if(choice == 3){
            garageChoice = "no garage";
            totalPrice = price;
        }
        System.out.print("You've chosen " + viewChosen + " with " + garageChoice + ", which will cost you $" + totalPrice);
    }
}
