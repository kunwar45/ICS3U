package u2a4KunwarNir;

import java.awt.Color;
import java.awt.FlowLayout; // specifies how components are arranged
import java.awt.Font;
import javax.swing.JFrame; // provides basic window features
import javax.swing.JLabel; // displays text and images
import javax.swing.SwingConstants; // common constants used with Swing
import javax.swing.Icon; // interface used to manipulate images
import javax.swing.ImageIcon; // loads images
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

/**
 *
 * @author Kunwar Nir
 * 25-07-2019
 * Title: Pizza Calculator
 * Purpose: To calculate the price of a pizza given the diameter
 */
public class U2A4Pizza extends JFrame  implements ActionListener{
    
    //Adding and declaring variables so that lables, textfields etc. are existent
    JLabel lblTitle;
    JLabel lblDiameter;
    JLabel lblDisplay;
    JTextField txtDiameter;
    JButton btnCalculate;
    
    public U2A4Pizza () {
        
        //Setting the text for the title bar
        super ("Kunwars Pizza Calculator");
        //Setting background colour
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null); // set frame layout
        
        //Adding and editing the title label
        lblTitle = new JLabel();
        lblTitle.setText("Pizza Price Calculator");
        lblTitle.setFont(new Font ("Arial", Font.BOLD, 24));
              
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBackground(Color.yellow);
        
        lblTitle.setSize(249, 50);
        lblTitle.setLocation(126, 0);
                
        add(lblTitle);
        
        //Editing and adding label that will ask for your diameter
        lblDiameter = new JLabel();
        lblDiameter.setText("Enter the Diameter of your Pizza: ");
        lblDiameter.setFont(new Font ("Arial", Font.BOLD, 20));
              
        lblDiameter.setForeground(Color.WHITE);
        lblDiameter.setBackground(Color.yellow);
        
        lblDiameter.setSize(350, 50);
        lblDiameter.setLocation(25, 100);
                
        add(lblDiameter);
        
        //Editing and adding the final display label
        lblDisplay = new JLabel();
        lblDisplay.setText("Your Price will appear here ");
        lblDisplay.setFont(new Font ("Arial", Font.BOLD, 20));
              
        lblDisplay.setForeground(Color.WHITE);
        lblDisplay.setBackground(Color.yellow);
        
        lblDisplay.setSize(350, 50);
        lblDisplay.setLocation(25, 300);
                
        add(lblDisplay);
        
        //Editing and adding the text field for diameter        
        txtDiameter = new JTextField();
        txtDiameter.setFont(new Font ("Arial", Font.BOLD, 20));
        
        txtDiameter.setSize(100, 50);
        txtDiameter.setLocation(350, 100);
                
        add(txtDiameter);
        
        //Adding and editing the button
        btnCalculate = new JButton();
        btnCalculate.setText("ENTER");
        btnCalculate.setSize(90, 30);
        btnCalculate.setLocation(355, 200);
        btnCalculate.setActionCommand("ENTER");
        btnCalculate.addActionListener(this);
        
        add(btnCalculate);
    }
    public void actionPerformed (ActionEvent e){
        
        DecimalFormat df = new DecimalFormat("#.##");
        
        if(e.getActionCommand().equals("ENTER")){
                        
            //Declaring variable that will store the diameter
            int intDiameter;
            //Setiing value for diameter
            intDiameter = Integer.parseInt(txtDiameter.getText());
            System.out.println(" =====dblPurchases======" + intDiameter);
            //Setting variable for total price
            double dblTotalPrice;
            //Setting value for total value
            dblTotalPrice = 1.00 + 1.50 + (0.50 * intDiameter);
            
            //Displaying the final value
            lblDisplay.setText("The price of your pizza is $" + df.format(dblTotalPrice));
        }
        
    }
}
