package u2act1a1;

/**
 *
 * @author Kunwar Nir
 * 22-07-2019
 * Title: Bill of Sale
 * Purpose: To create a bill of sale for shirt purchased
 */
public class BillOfSale {
    
    public static void main(String[] args) {
        
        //Declaring the variable for the price of the shirt
        double dblShirtPrice;
        //Declaring the variable for the amount of money given to the cashier
        double dblAmountGiven;
        
        //Assigning the value for shirt price
        dblShirtPrice = 12.49;
        //Assigning value for the amount given
        dblAmountGiven = 20;
        
        //Declaring variable for the tax
        double dblTax;
        //Declaring variable for the total bill
        double dblTotalBill;
        
        //Assigning value for the tax
        dblTax = 0.13;
        //Assigning value for the total bill
        dblTotalBill = dblShirtPrice + (dblShirtPrice * dblTax);
        
        //Declaring variable for the change returned to the buyer
        double dblChange;
        
        //Assigning value for the change
        dblChange = dblAmountGiven - dblTotalBill;
        
        //Displaying the answer
        System.out.println("T-Shirt: $" + dblShirtPrice +  "\nHST: " + dblTax + "%" + "\nTotal: $" + dblTotalBill + "\nAmount Given: $" 
                + dblAmountGiven + "\nChange Due: $" + dblChange);  
    }
    
}
