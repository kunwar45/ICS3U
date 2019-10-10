package u2act1a1;

/**
 *
 * @author Kunwar Nir
 * 22-07-2019
 * Title: Net Pay
 * Purpose: To calculate the net pay for someone who works 40 hours at $5.00 
 * per hour with $2.00 deducted for insurance and pays 22% tax
 */
public class NetPay {
    
    public static void main(String [] arg){
    
    //Declaring the variable for number of hours worked
    int intHoursWorked;
    //Declaring the variable for wages
    double dblWages;
    //Declaring the variable for insurance
    double dblInsurance;
    //Declaring the variable for tax
    double dblTax;
    
    //Assigning the hours worked
    intHoursWorked = 40;
    //Assigning the the wages
    dblWages = 5.00;
    //Assigning the insurance
    dblInsurance = 2.00;
    //Assigning the taxes
    dblTax = 0.22;
    
    //Declaring the variable for the total net pay
    double dblNetPay;
    
    //Assigning the value for net pay using the formula n=(h*w-i)-t*(h*w-i)
    dblNetPay = (intHoursWorked * dblWages - dblInsurance) - dblTax * 
                (intHoursWorked * dblWages - dblInsurance);
    
    //Displaying the data
    System.out.println("The net pay for someone who works 40 hours at $5.00 "
            + "per hour "+ "with $2.00 deducted for insurance and pays 22% "
            + "tax will be: $" + dblNetPay);
    }
    
}
