package u2a5kunwarnir;

import javax.swing.JFrame;

/**
 *
 * @author Kunwar Nir
 * 26-07-2019
 * Title: JFrame Tester; Sale
 * Purpose: To run the application
 */
public class SaleJFrameTester {
    
    public static void main( String[] args ){
    
      U2A5Sale myFrame = new U2A5Sale(); // create LabelFrame
      myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      myFrame.setSize( 500, 500 ); // set frame size
      myFrame.setVisible( true ); // display frame
   } 
    
}
