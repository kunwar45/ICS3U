package u2a4KunwarNir;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author Kunwar Nir
 * 25-07-2019
 * Title: Fast Food
 * Purpose: To create an order application for a fast food employee
 */
public class U2A4FastFood {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        //Defing the round function to later round the variables
        DecimalFormat df = new DecimalFormat(".##");
        
        //Declaring variables
        int intNumBurgers, intNumFries, intNumDrinks;
        
        //Getting user input for burgers
        System.out.print("Enter the number of burgers: ");
        //Assiging this value to variable
        intNumBurgers = input.nextInt();
        
        //Getting user input for fries
        System.out.print("Enter the number of fries: ");
        //Assiging this value to variable
        intNumFries = input.nextInt();
        
        //Getting user input for soft drinks
        System.out.print("Enter the number of soft drinks: ");
        //Assiging this value to variable
        intNumDrinks = input.nextInt();
        
        //Declaring variables for prices
        double dblBurgerPrice, dblFriesPrice, dblDrinkPrice;
        
        //Assgning the value for this variable
        dblBurgerPrice = 2.49 * intNumBurgers;
        
        //Assgning the value for this variable
        dblFriesPrice = 1.89 * intNumFries;
        
        //Assgning the value for this variable
        dblDrinkPrice = 0.99 * intNumDrinks;
        
        //Declaring variable for total before taxes
        double dblMealPrice;
        //Assgning the value for this variable
        dblMealPrice = dblBurgerPrice + dblFriesPrice + dblDrinkPrice;
        
        //Declaring variable for tax
        double dblTax;
        //Assgning the value for this variable
        dblTax = dblMealPrice * 0.13;
        
        //Declaring variable for final total
        double dblFinalTotal;
        //Assgning the value for this variable
        dblFinalTotal = dblMealPrice + dblTax;
        
        //Displaying this information
        System.out.println("\nTotal before taxes: $" + df.format(dblMealPrice));
        System.out.println("Tax: $" + df.format(dblTax));
        System.out.println("Final Total: $" + df.format(dblFinalTotal));
        
        //Declaring variables
        double dblAmountTendered, dblChange;
        
        //Asking user for amount tendered
        System.out.print("\nEnter the amount tendered:\t$");
        //Assgning the value for this variable
        dblAmountTendered = input.nextDouble();
        
        //Assgning the value for this variable
        dblChange = dblAmountTendered - dblFinalTotal;
        
        System.out.println("Change:\t\t\t\t$" + df.format(dblChange));
        
    }
    
}
