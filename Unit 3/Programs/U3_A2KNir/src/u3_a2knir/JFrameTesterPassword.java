
package u3_a2knir;

import javax.swing.JFrame;

/**
 *
 * @author Kunwar Nir
 * 01-08-2019
 * Title: JFrame tester Password
 * Purpose: To run the password applet
 */
public class JFrameTesterPassword {
    
    public static void main( String[] args ){
    
      U3A2_Password myFrame = new U3A2_Password(); // create LabelFrame
      myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      myFrame.setSize( 500, 500 ); // set frame size
      myFrame.setVisible( true ); // display frame
   } 
    
}
