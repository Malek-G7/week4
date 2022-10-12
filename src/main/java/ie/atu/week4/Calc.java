package ie.atu.week4;
import java.util.Scanner;

public class Calc {
    public static void main( String[] args ) {
      divide();
    }

    public static void divide()
    {
        System.out.println("Please enter yur first number :");
        Scanner inputs = new Scanner(System.in);
        float firstNumber = inputs.nextInt();

        System.out.println("Please enter yur second number :");
        float secondNumber = inputs.nextInt();

        float total = firstNumber/secondNumber;
        System.out.println("The total is " + total);
    }

}
