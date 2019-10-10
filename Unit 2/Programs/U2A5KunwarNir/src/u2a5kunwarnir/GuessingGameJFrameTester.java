package u2a5kunwarnir;

import javax.swing.JFrame;

/**
 *
 * @author Kunwar Nir
 * 25-07-2019
 * Title: Hurricane J Frame Tester
 * Purpose: To run the Guessing Game Applet 
 */
public class GuessingGameJFrameTester {    
    
    public static void main( String[] args ){
    
      U2A5GuessingGame myFrame = new U2A5GuessingGame(); // create LabelFrame
      myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      myFrame.setSize( 500, 500 ); // set frame size
      myFrame.setVisible( true ); // display frame
   } 
    
}
