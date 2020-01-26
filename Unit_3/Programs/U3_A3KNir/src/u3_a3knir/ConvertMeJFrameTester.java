package u3_a3knir;

import javax.swing.JFrame;

/**
 *
 * @author Kunwar Nir
 * 03-08-2019
 * Title: Convert Me JFrame Tester
 * Purpose: To run the convert me applet
 */
public class ConvertMeJFrameTester {
    
    public static void main( String[] args ){
    
      U3A3_ConvertMe myFrame = new U3A3_ConvertMe(); // create LabelFrame
      myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      myFrame.setSize( 500, 500 ); // set frame size
      myFrame.setVisible( true ); // display frame
    } 
    
}
