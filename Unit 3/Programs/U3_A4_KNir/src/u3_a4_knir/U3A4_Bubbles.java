package u3_a4_knir;
import java.util.Scanner;

/**
 *
 * @author Kunwar Nir
 * 07-08-2019
 * Title: Bubbles
 * Purpose: To use bubble sort to values in an Array
 */
public class U3A4_Bubbles {
    
    /*
    *
    * @param intArrayNumbers is the array of numbers the user entered
    */
    //Setting up method for bubble sorting
    public static void bubbleSort(int [] intArrayNumbers){
        
        //For loop to bubble sort
        for(int i = 0; i < intArrayNumbers.length; i++){
            
            for(int j = 0; j < intArrayNumbers.length - 1; j++){
                
                if(intArrayNumbers[j] > intArrayNumbers[j+1]){
                    int intTemporary = intArrayNumbers[j];
                    intArrayNumbers[j] = intArrayNumbers[j+1];
                    intArrayNumbers[j+1] = intTemporary;
                    
                }
            }
        }
    }
    
    /*
    *
    * @param intArrayNumbers is the array of numbers the user entered
    * @param intNumberOfValues is the number of values the user entered for their array
    * @return dblMedian is the median of the array of numbers
    */
    //Setting up method for the median
    public static double medianValue(int [] intArrayNumbers, int intNumberOfValues){
        
        //Declaring variables for the middle index and median
        int intMiddleIndex;
        double dblMedian = 0;
        
        //If statement to check if it is even
        if(intNumberOfValues % 2 == 0){
            
            //Getting the middle index
            intMiddleIndex = intNumberOfValues / 2;
            
            //Getting mean of the two middle numbers for median
            dblMedian = (intArrayNumbers[intMiddleIndex] + intArrayNumbers[intMiddleIndex - 1]) / 2;
            
        }
        
        else {
            
            //Getting the middle index
            intMiddleIndex = intNumberOfValues / 2;
            
            //Getting the median value
            dblMedian = intArrayNumbers[intMiddleIndex];
        
        }
        
        //Returning the median
        return dblMedian;

    }
    
    /*
    *
    * @param intArrayNumbers is the array of numbers the user entered
    * @return dblMean is the mean of the array of numbers
    */
    //Setting up method for the mean
    public static double meanValue(int [] intArrayNumbers){
        
        //Declaring the variables for the mean and sum of the numbers
        double dblMean = 0;
        double dblSum = 0;
        
        //For loop to add all values of the array
        for(int i = 0; i < intArrayNumbers.length; i++){
            dblSum = dblSum + intArrayNumbers[i];
        }
        
        //Setting the value for the mean
        dblMean = dblSum / intArrayNumbers.length;
        
        //Returning the mean
        return dblMean;
    }
    
    public static void main(String [] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Declaring value for the length of the array the user wants
        int intNumberOfValues;
        
        //Prompting the user
        System.out.print("Please enter the number of values you would like to enter: ");
        
        //Formatting
        System.out.print("");
        System.out.print("");
        
        //Assigning the value for the length
        intNumberOfValues = input.nextInt();
        
        //Declaring the array
        int [] intArrayNumbers = new int [intNumberOfValues];
        
        //Asking user for values and storing them in the array
        for (int i = 0; i < intNumberOfValues; i++){
            System.out.print("Please enter the value of index " + i + ": ");
            intArrayNumbers[i] = input.nextInt();
            
        }
        
        System.out.println("");
        //Printing the message
        System.out.println("Here is the Unsorted List:");
        
        //For loop to print the array unsorted
        for (int i = 0; i < intArrayNumbers.length; i++) {
            System.out.print(intArrayNumbers[i] + "\t");
            
        }
        
        System.out.println("");
        //Printing the message
        System.out.println("\nHere is the Sorted List: ");
        
        //Calling the bubble sort method
        bubbleSort(intArrayNumbers);
        
        //For loop to print the sorted values
        for (int i = 0; i < intArrayNumbers.length; i++) {
            System.out.print(intArrayNumbers[i] + "\t");
        }
        
        System.out.println("");
        System.out.println("");
        
        //Delcaring variable and assigning value for greatest number
        int intGreatestNumber = intArrayNumbers[intArrayNumbers.length - 1];
        
        //Delcaring variable and assigning value for smallest number
        int intSmallestNumber = intArrayNumbers[0];
        
        //Printing the greatest number
        System.out.println("Greatest Number: " + intGreatestNumber);
        System.out.println("");
        //Printing the smallest number
        System.out.println("Smallest Number: " + intSmallestNumber);
        
        System.out.println("");
        
        //Calling the method for median and capturing the value
        double dblMedianResult = medianValue(intArrayNumbers, intNumberOfValues);
        //Printing the median
        System.out.println("Median Number: " + dblMedianResult);
        
        System.out.println("");
        
        //Calling the method for mean and capturing the value
        double dblMean = meanValue(intArrayNumbers);
        //Printing the mean
        System.out.println("Average: " + dblMean);
        
        //Printing the goodbye message
        System.out.println("");
        System.out.println("Thanks for visiting!");
        System.out.println("Goodbye!");

    }
}
