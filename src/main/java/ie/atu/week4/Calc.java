package ie.atu.week4;
import java.util.Scanner;

public class Calc {
    public static void main( String[] args ) {
        subtract();

    }

    public static void subtract()
    {
        System.out.println("Enter your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber - secondNumber;
        System.out.println("Total: " + total);

    }
}
