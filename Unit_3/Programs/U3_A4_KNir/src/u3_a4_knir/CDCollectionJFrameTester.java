package u3_a4_knir;

import javax.swing.JFrame;

/**
 *
 * @author Kunwar Nir
 * 07-08-2019
 * Title: CD Collection JFrame Tester
 * Purpose: To run the cd collection GUI
 */
public class CDCollectionJFrameTester {
    
    public static void main( String[] args ){
    
      U3A4_CDCollection myFrame = new U3A4_CDCollection(); // create LabelFrame
      myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      myFrame.setSize( 600, 700 ); // set frame size
      myFrame.setVisible( true ); // display frame
    }
    
}
