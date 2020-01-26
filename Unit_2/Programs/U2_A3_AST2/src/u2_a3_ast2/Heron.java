package u2_a3_ast2;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Kunwar Nir
 * 24-07-2019
 * Title: Heron
 * Purpose: To calculate the area of a triangle given the three sides using 
 * Herons formula, Area = (s(s-a) (s-b) (s-c))0.5
 */
public class Heron {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Declaring variables for the sides of the triangle
        int intSide1, intSide2, intSide3;
        
        //Getting user input
        System.out.print("Enter the length of the first side: ");
        //Setting the value of the side to the input
        intSide1 = input.nextInt();
        
        //Getting user input
        System.out.print("Enter the length of the second side: ");
        //Setting the value of the side to the input
        intSide2 = input.nextInt();
        
        //Getting user input
        System.out.print("Enter the length of the third side: ");
        //Setting the value of the side to the input
        intSide3 = input.nextInt();
        
        //Declaring variable for half the perimeter
        double dblHalfPerimeter;
        
        //Assigning value for variable
        dblHalfPerimeter = ((intSide1 + intSide2 + intSide3)) / 2;
        
        //Declaring variable for area
        double dblArea;
        
        //Assigning value for area
        dblArea = Math.pow((dblHalfPerimeter * (dblHalfPerimeter - intSide1) * 
                (dblHalfPerimeter - intSide2) * (dblHalfPerimeter - intSide3)), 0.5) ;
        
        //Displaying the answer
        System.out.println("\nCalculated using Herons formula, the area of a "
                + "triangle with the sides " + intSide1 + ", " + intSide2 + 
                " and " + intSide3 + " is " + dblArea);
    }
    
    
}
