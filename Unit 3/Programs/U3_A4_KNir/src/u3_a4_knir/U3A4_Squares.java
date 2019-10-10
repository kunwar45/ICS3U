package u3_a4_knir;

/**
 *
 * @author Kunwar Nir
 * 07-08-2019
 * Title: Working With Arrays: Squares
 * Purpose: To display the square of the index of a array 
 */
public class U3A4_Squares {
    
    
    public static void main(String[] args) {
        
        //Declaring the arrays
        int[] intArrayNumbers = {0,1,2,3,4,5,6,7,8,9};
        int[] intArraySquares = new int [10];
        
        //Printing out the title text
        System.out.println("Squares ArrayList");
        System.out.println("*****************");
        
        //Empty line for formatting sake
        System.out.println(" ");

        //For loop to fill second array
        for (int i = 0; i < intArrayNumbers.length; i++){
            
            //Squaring every value in the first array and putting it in the array
            intArraySquares[i] = (int)Math.pow(intArrayNumbers[i], 2);

        }
        
        //For loop to print the final values
        for (int x = 0; x < intArrayNumbers.length; x++) {
            System.out.print("Number: " + intArrayNumbers[x]);
            System.out.println("\tSquare: " + intArraySquares[x]);
            
        }
    }
}
