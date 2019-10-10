package u2a4KunwarNir;

import javax.swing.JFrame;

/**
 *
 * @author Kunwar Nir
 * 26-07-2019
 * Title: Pizza JFrame Tester
 * Purpose: To run the Pizza Application
 */
public class JFrameTesterPizza {
    public static void main( String[] args )
   { 
      U2A4Pizza myFrame = new U2A4Pizza(); // create LabelFrame
       myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
       myFrame.setSize( 500, 500 ); // set frame size
       myFrame.setVisible( true ); // display frame
   } // end main
}
