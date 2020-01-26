package u2act1a1;

/**
 *
 *  @author Kunwar Nir
 * 22-07-2019
 * Title: Area of a Rectangle
 * Purpose: To calculate the area of a 5.7 by 4.8 rectangle
 */

public class AreaOfARectangle {
    
    public static void main(String[] args) {
        
        //Declaring the variable for the length of the rectangle
        double dblLength;
        //Declaring the variable for the width of the rectangle
        double dblWidth;
        
        //Assigning the value for the length
        dblLength = 5.7;
        //Assigning the value for the width
        dblWidth = 4.8;
        
        //Calculating the area of the rectangle
        double dblArea = dblLength * dblWidth;
        
        //Displaying the answer
        System.out.println("Length = " + dblLength + "\nWidth = " + dblWidth +
                "\nArea = " + dblArea);   
    }
    
}
