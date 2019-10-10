package u2act1a1;
import java.util.Scanner;

/**
 *
 * @author Kunwar Nir
 * 22-07-2019
 * Title: Divide and Mode
 * Purpose: To divide and mode two given numbers
 */
public class DivideAndMode {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Declaring the variables for the users input numbers
        int intFirstNumber, intSecondNumber;
        
        //Asking the user for the first input number
        System.out.print("Please enter an integer: ");
        //Assigning that value for the first number
        intFirstNumber = input.nextInt();
        //Asking the user for a second number
        System.out.print("Please enter a second integer: ");
        //Assigning that value for the second number
        intSecondNumber = input.nextInt();
        
        //Performing all the operations and displaying the data
        System.out.println("\n" + intFirstNumber + " / " + intSecondNumber + " = " 
                + intFirstNumber / intSecondNumber);
        System.out.println(intFirstNumber + " % " + intSecondNumber + " = " 
                + intFirstNumber % intSecondNumber);
        System.out.println("\n" + intSecondNumber + " / " + intFirstNumber + " = " 
                + intSecondNumber / intFirstNumber);
        System.out.println(intSecondNumber + " % " + intFirstNumber + " = " 
                + intSecondNumber % intFirstNumber);
    }
    
}
