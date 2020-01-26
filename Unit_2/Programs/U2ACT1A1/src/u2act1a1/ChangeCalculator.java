package u2act1a1;
import java.util.Scanner;

/**
 *
 * @author Kunwar Nir
 * 22-07-2019
 * Title: Change Calculator
 * Purpose: To calculate the minimum amount of change required for a given amount of cents
 */
public class ChangeCalculator {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Declaring the variable for the amount of change the user will enter
        int intChange;
        //Declaring variables for all the coins
        int intNumQuarters, intNumDimes, intNumNickels, intNumPennies;
        
        //Getting the user input
        System.out.print("Enter the amount of cents: ");
        //Assigning the user input as the number of cents
        intChange = input.nextInt(); 
        
        if (intChange > 300){
            System.out.println("Please enter an amount less than 300");
        }
        
        else {
        //Assigning the value for the number of quarters
        intNumQuarters = intChange / 25;
        //Assigning the value for the number of dimes
        intNumDimes = (intChange - (25 * intNumQuarters)) / 10;
        //Assigning the value for the number of nickels
        intNumNickels = (intChange - (25 * intNumQuarters)- (10 * intNumDimes)) 
                / 5;
        //Assigning the value for the number of pennies
        intNumPennies = (intChange - (25 * intNumQuarters)- (10 * intNumDimes) -
                (5 * intNumNickels));
        
        //Displaying the data
        System.out.println("\nThe minimum number of coins is: ");
        System.out.println("\t Quarters: " + intNumQuarters);
        System.out.println("\t Dimes: " + intNumDimes);
        System.out.println("\t Nickels: " + intNumNickels);
        System.out.println("\t Pennies: " + intNumPennies);
        }
    }
    
}
