package u2act1a1;

/**
 *
 * @author Kunwar Nir
 * 22-07-2019
 * Title: Area of a Circle
 * Purpose: To calculate the area of a circle with a radius of 15 cm
 */

public class AreaOfACircle {

    public static void main(String[] args) {
        
        //Declaring the variable for the radius of the circle
        int intRadius;
        //Declaring the variable for the area of the circle
        double dblArea;
       
        //Assigning the value for the radius of the circle
        intRadius = 15;
        //Assigning the value for the area of the circle
        dblArea = Math.PI * intRadius * intRadius;
        
        //Displaying the answer
        System.out.println("The area of a circle with a radius of 15 cm is: " 
                + dblArea +  " cm squared");   
    }
}
