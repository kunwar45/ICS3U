package u2a6knir;

import javax.swing.JFrame;

/**
 *
 * @author Kunwar Nir
 * 29-07-2019
 * Title: Fun With Loops JFrame Tester
 * Purpose: To run the fun with loops GUI
 */
public class FunWithLoopsJFrameTester {
    
    public static void main( String[] args ){
    
      U2A6FunWithLoops myFrame = new U2A6FunWithLoops(); // create LabelFrame
      myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      myFrame.setSize( 500, 500 ); // set frame size
      myFrame.setVisible( true ); // display frame
   } 
    
}
