package u3a1ast2;

import java.util.Scanner;

/**
 *
 * @author Kunwar Nir 
 * 31-07-2019 
 * Title: Secret Message Encoder
 * Purpose: To take a secret message and convert it to ASCii and then to Binary
 */
public class U3A1AST2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        //Declaring variable for secret message
        String strSecretMessage = "";
        String strASCIIValue = "";
        String strBinaryDisplay = "";
        
        //Asking for user input
         System.out.print("Please enter your secret message (around 15 characters): ");

        //Assigning value for the secret message
         strSecretMessage = input.nextLine();
        
        //This for loop will print the ascii value for every character in your secret message
        for (int i = 0; i < strSecretMessage.length(); i++) {

            //Assigning value for the ASCii value
            strASCIIValue = strASCIIValue + (int)(strSecretMessage.charAt(i)) + " ";

        }
        
        //Printing an extra line for formatting sake
        System.out.println(" ");
        
        //Assigning the variable for the counter of the loop
        int intCounter = strASCIIValue.length() - 1;
        
        //Assigning the variable for index
        int intIndex = 0;
        
        //Declaring variable "strBinary"
        String strBinary = "";
        
        //While loop to get individual numbers
        while (intCounter >= 0) {
            
            //If statement so that it skips spaces
            if (strASCIIValue.charAt(intIndex) == ' ') {
                
                int intNumValue = Integer.parseInt(strBinaryDisplay);
                
                //While loop to convert to binary
                while (intNumValue > 0) {
                    strBinary = (intNumValue % 2) + "" + strBinary;
                    intNumValue = intNumValue / 2;
                    
                }
                
                //Refreshing all values
                intIndex = intIndex + 1;
                intCounter = intCounter - 1;
                System.out.print(strBinary + " ");
                strBinary = "";
                strBinaryDisplay = "";
                
            } 
            
            else {
                
                //Getting substring
                strBinaryDisplay = strBinaryDisplay + strASCIIValue.charAt(intIndex);
                intIndex = intIndex + 1;
                intCounter = intCounter - 1;
            
            }
            
        }
        
        //Printing final value
        System.out.println(strBinaryDisplay);
    
    }
    

}
