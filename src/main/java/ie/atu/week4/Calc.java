package ie.atu.week4;

import java.util.Scanner;

public class Calc {
    public static void main( String[] args ) {

}
public static void add(){

        System.out.printf("adding method");
        System.out.println("enter your first number");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("enter your second number");
        int secondNumber = input.nextInt();
        int total = firstNumber + secondNumber;
        System.out.println("The total is " + total);

    }
}
