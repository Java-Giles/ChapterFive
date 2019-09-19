package examples;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args){

        int choice;

        Scanner input = new Scanner(System.in);
        System.out.println("What are you solving for?" + "\n 1 for Right triangle \n 2 for Equilateral \n 3 for Isosceles \nChoice >>>> ");
        choice = input.nextInt();

        if(choice == 1){
            rightTriangle();
        }
        else if(choice == 2){
            equilateralTriangle();
        }
        else if(choice == 3){
            isoscelesTriangle();
        }
    }
    public static void rightTriangle(){

        Scanner input = new Scanner(System.in);
        String choice = null;
        double side1;
        double side2;
        System.out.print("Which side do you want to solve for?\n A- Side \n B- Side \n C- Side \n Choice>>>> ");
        choice = input.next();
        if(choice.equalsIgnoreCase("A")){
            System.out.print("Please enter for side B>>>> ");
            side1 = input.nextDouble();
            System.out.print("Please enter a side for side C>>>> ");
            side2 =input.nextDouble();
            rightTriangleMathAB(side1, side2,choice);

        }
        else if(choice.equalsIgnoreCase("B")) {
            System.out.print("Please enter for side A>>>> ");
            side1 = input.nextDouble();
            System.out.print("Please enter a side for side C>>>> ");
            side2 = input.nextDouble();
            rightTriangleMathAB(side1, side2, choice);
        }
        else if(choice.equalsIgnoreCase("C")) {
            System.out.print("Please enter for side A>>>> ");
            side1 = input.nextDouble();
            System.out.print("Please enter a side for side B>>>> ");
            side2 = input.nextDouble();
            rightTriangleMathC(side1, side2, choice);
        }
    }
    public static void rightTriangleMathAB(double side1, double side2, String choice){
        double notC;
        notC = Math.sqrt((side2*side2) - (side1*side1));
        System.out.println("The side " + choice + " is " + notC);
        solvePerimeter(side1, side2, notC);
    }
    public static void rightTriangleMathC(double side1, double side2, String choice){
        double c;
        c = Math.sqrt((side1*side1) + (side2*side2));
        System.out.println("The side " + choice + " is " + c);
        solvePerimeter(side1, side2, c);

    }
    public static void equilateralTriangle(){

        Scanner input = new Scanner(System.in);

        double side1;

        System.out.print("Enter the length of a side of your triangle>>>>" );
        side1 = input.nextDouble();
        solvePerimeter(side1, side1, side1);
    }
    public static void isoscelesTriangle(){

        Scanner input = new Scanner(System.in);
        double side1;
        double side2;

        System.out.print("Enter the side length of your first side>>>> ");
        side1 = input.nextDouble();
        System.out.print("Enter the length of your non-equal side>>>> ");
        side2 = input.nextDouble();
        solvePerimeter(side1, side1, side2);
    }
    public static void solvePerimeter(double side1, double side2, double side3){
        double perimeter;
        perimeter = side1 + side2 + side3;

        System.out.println("The perimeter of your triangle is " + perimeter);
    }
}
