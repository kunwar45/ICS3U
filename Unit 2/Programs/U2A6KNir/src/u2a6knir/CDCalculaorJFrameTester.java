package u2a6knir;

import javax.swing.JFrame;

/**
 *
 * @author Kunwar Nir
 * 29-07-2019
 * Title: CD Calculator J Frame Tester
 * Purpose: To run the CD calculator GUI
 */
public class CDCalculaorJFrameTester {
    
    public static void main( String[] args ){
    
      U2A6CDCalculator myFrame = new U2A6CDCalculator(); // create LabelFrame
      myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      myFrame.setSize( 500, 500 ); // set frame size
      myFrame.setVisible( true ); // display frame
   } 
    
}
