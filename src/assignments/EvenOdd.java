package assignments;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args){

        int number;
        String result;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number>>>> ");
        number = input.nextInt();

        if(number % 2 == 0)
            result = "Even";
        else
            result = "Odd";

        System.out.println(result);
    }
}
