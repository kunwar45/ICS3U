package u2_act3;
import java.text.DecimalFormat;

/**
 *
 * @author Kunwar Nir
 * 24-07-2019
 * Title: Bill of Meal
 * Purpose: To calculate your bill for a purchased meal
 */
public class U2_ACT3_Bill {
    
    public static void main(String[] args) {
        
        //Declaring variable for price of meal
        double dblMealPrice;
        //Declaring variable for tax
        double dblTax;
        
        //Assigning value for meal price
        dblMealPrice = 14.95;
        //Assigning value for tax
        dblTax = 0.13;
        
        //Declaring variable for HST
        double dblHST;
        
        //Assigning value for HST
        dblHST = dblMealPrice * dblTax;
        
        //Declaring variable for total cost
        double dblTotalCost;
        
        //Assigning value for total cost
        dblTotalCost = dblMealPrice + dblHST;
        
        //Defing the round function to later round the variables
        DecimalFormat df = new DecimalFormat(".##");
        
        //Displaying the data
        System.out.println("Restaurant Bill" + "\n***************\n");
        System.out.println("Meal:\t$" + df.format(dblMealPrice));
        System.out.println("HST:\t$" + df.format(dblHST));
        System.out.println("Total:\t$" + df.format(dblTotalCost));
    }
    
}
