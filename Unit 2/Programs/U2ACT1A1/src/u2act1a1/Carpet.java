package u2act1a1;

/**
 *
 * @author Kunwar Nir
 * 22-07-2019
 * Title: Carpet
 * Purpose: To calculate the to carpet a 8.5 m by 6 m room at &19.95 per square meter
 */
public class Carpet {
      
    public static void main(String[] args) {
        
        //Declaring the variable for the length of the room
        double dblRoomLength;
        //Declaring the variable for the width of the room
        double dblRoomWidth;
        
        //Assigning the value for the length of the room
        dblRoomLength = 8.5;
        //Assigning the value for the width of the room
        dblRoomWidth = 6;
        
        //Declaring the variable for the total cost
        double dblCost;
        
        //Assigning the value for the cost
        dblCost = dblRoomLength * dblRoomWidth * 19.95;
        
        //Displaying the answer
        System.out.println("The cost to carpet a 8.5 m by 6 m room at &19.95 per square meter is: $" + dblCost);   
    }
    
}
