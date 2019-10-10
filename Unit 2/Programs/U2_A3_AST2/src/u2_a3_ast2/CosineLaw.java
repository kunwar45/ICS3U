package u2_a3_ast2;
import java.util.Scanner;
import java.lang.Math;


/**
 *
 * @author Kunwar Nir
 * 24-07-2019
 * Title: Cosine Law
 * Purpose: To get the third side of a triangle using the cosine law given two sides of a triangle and the contained angle
 */
public class CosineLaw {
        
        public static void main(String[] args){
            
            Scanner input = new Scanner(System.in);
            
            //Declaring variables for triangle
            int intSide1, intSide2, intAngle;
            
            //Getting user input
            System.out.print("Enter the length of the first side: ");
            //Setting the value of the side to the input
            intSide1 = input.nextInt();
        
            //Getting user input
            System.out.print("Enter the length of the second side: ");
            //Setting the value of the side to the input
            intSide2 = input.nextInt();
        
            //Getting user input
            System.out.print("Enter the measure of angle: ");
            //Setting the value of the side to the input
            intAngle = input.nextInt();
            
            //Declaring variable for the angle in radians and assigning it's value
            double dblAngleRadian = Math.toRadians(intAngle);
            
            //Declaring variable for third side and assigning value
            double dblSide3 = Math.pow(((Math.pow(intSide1, 2) + Math.pow(intSide2, 2) 
                    - 2 * intSide1 * intSide2 * Math.cos(dblAngleRadian))), 0.5);
            
            System.out.println("\nThe third side of this triangle is: " + dblSide3);
            
        }
}
