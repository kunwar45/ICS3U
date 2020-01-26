package u3a6_marks_knir;

import javax.swing.JFrame;

/**
 *
 * @author Kunwar Nir
 * 09-08-2019
 * Title: Marks JFrame Tester
 * Purpose: To run the marks GUI
 */
public class MarksJFrameTester {
    
    public static void main( String[] args ){
    
      U3A6_Marks_KNir myFrame = new U3A6_Marks_KNir(); // create LabelFrame
      myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      myFrame.setSize( 600, 700 ); // set frame size
      myFrame.setVisible( true ); // display frame
    }
    
}
