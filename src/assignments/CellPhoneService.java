package assignments;

import java.util.Scanner;

public class CellPhoneService {

    public static void main(String[] args){
        int minUsed;
        int txtUsed;
        int gbUsed;
        int price = 0;
        String result = null;

        Scanner input = new Scanner(System.in);

        System.out.println("How many minutes are you going to use? >>> ");
        minUsed = input.nextInt();

        System.out.println("How many text messages are you going to send? >>> ");
        txtUsed = input.nextInt();

        System.out.println("How many Gigabytes are you going to use? >>> ");
        gbUsed = input.nextInt();

        if(minUsed < 500 && txtUsed == 0 && gbUsed == 0){
            result = "Plan A";
            price = 49;
        }
        else if(minUsed < 500 && txtUsed >= 1 && txtUsed <= 99 && gbUsed == 0){
            result = "Plan B";
            price = 55;
        }
        else if(minUsed > 500 && txtUsed <= 100 && gbUsed == 0){
            result = "Plan C";
            price = 61;
        }
        else if(minUsed > 500 && txtUsed > 100 && gbUsed == 0){
            result = "Plan D";
            price = 70;
        }
        else if(minUsed > 500 && txtUsed > 100 && gbUsed >= 1){
            result = "Plan E";
            if(gbUsed <= 2)
                price = 79;
            else{
                price = 87;
            }
        }
        System.out.print("The plan you need is " + result + ", which will cost you &" + price);
    }
}
