package u2a5kunwarnir;

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
 * 26-07-2019
 * Title: Super Store Sale!
 * Purpose: To apply a store discount
 */
public class U2A5Sale extends JFrame implements ActionListener {
    
    //Adding and declaring variables so that lables, textfields etc. are existent
    JLabel lblTitle;
    JLabel lblPurchases;
    JLabel lblDiscount;
    JLabel lblPrice;
    JTextField txtPurchases;
    JTextField txtDiscount;
    JTextField txtPrice;
    JButton btnCalculate;
    
     public U2A5Sale () {
        
        //Setting the text for the title bar
        super ("Discount Calculator");
        //Setting background colour
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null); // set frame layout
        
        //Adding and editing the title label
        lblTitle = new JLabel();
        lblTitle.setText("$uper $tore $ale");
        lblTitle.setFont(new Font ("Arial", Font.BOLD, 36));
              
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBackground(Color.yellow);
        
        lblTitle.setSize(275, 50);
        lblTitle.setLocation(113, 0);
                
        add(lblTitle);
        
        //Editing and adding label that will ask for your purchases
        lblPurchases = new JLabel();
        lblPurchases.setText("Amount of Purchases ($):");
        lblPurchases.setFont(new Font ("Arial", Font.BOLD, 20));
              
        lblPurchases.setForeground(Color.WHITE);
        lblPurchases.setBackground(Color.yellow);
        
        lblPurchases.setSize(350, 50);
        lblPurchases.setLocation(25, 100);
                
        add(lblPurchases);
                
        //Editing and adding the text field for purchases        
        txtPurchases = new JTextField();
        txtPurchases.setFont(new Font ("Arial", Font.BOLD, 20));
        
        txtPurchases.setSize(120, 30);
        txtPurchases.setLocation(350, 110);
                
        add(txtPurchases);
        
        //Adding and editing the button
        btnCalculate = new JButton();
        btnCalculate.setText("ENTER");
        btnCalculate.setSize(90, 30);
        btnCalculate.setLocation(355, 180);
        btnCalculate.setActionCommand("ENTER");
        btnCalculate.addActionListener(this);
        
        add(btnCalculate);
        
        //Editing and adding label that will display discount
        lblDiscount = new JLabel();
        lblDiscount.setText("Discount Amount:");
        lblDiscount.setFont(new Font ("Arial", Font.BOLD, 20));
              
        lblDiscount.setForeground(Color.WHITE);
        lblDiscount.setBackground(Color.yellow);
        
        lblDiscount.setSize(350, 50);
        lblDiscount.setLocation(25, 250);
                
        add(lblDiscount);
        
        //Editing and adding label that will dsiplay discounted price
        lblPrice = new JLabel();
        lblPrice.setText("Discounted Price:");
        lblPrice.setFont(new Font ("Arial", Font.BOLD, 20));
              
        lblPrice.setForeground(Color.WHITE);
        lblPrice.setBackground(Color.yellow);
        
        lblPrice.setSize(350, 50);
        lblPrice.setLocation(25, 300);
                        
        add(lblPrice);
       
        //Editing and adding the text field for purchases        
        txtDiscount = new JTextField();
        txtDiscount.setFont(new Font ("Arial", Font.BOLD, 20));
        
        txtDiscount.setSize(120, 30);
        txtDiscount.setLocation(350, 250);
                
        add(txtDiscount);
        
        //Editing and adding the text field for purchases        
        txtPrice = new JTextField();
        txtPrice.setFont(new Font ("Arial", Font.BOLD, 20));
        
        txtPrice.setSize(120, 30);
        txtPrice.setLocation(350, 300);
                
        add(txtPrice);
    }
    public void actionPerformed (ActionEvent e){
        
        DecimalFormat df = new DecimalFormat("#.##");
        
        if(e.getActionCommand().equals("ENTER")){
            
            //Declaring Variables
            double dblPurchases, dblDiscountAmount, dblDiscountedPrice;
            //Assigning value for variable
            dblPurchases = Double.parseDouble(txtPurchases.getText());
            
            //If statement to check if discount applies
            if (dblPurchases >= 10.00){
                
                dblDiscountAmount = dblPurchases * 0.10;
            }
            else {
                dblDiscountAmount = 0;
            }
            
            //Assigning value for variable
            dblDiscountedPrice = dblPurchases - dblDiscountAmount;
            
            //Displaying final value
            txtDiscount.setText("$" + df.format(dblDiscountAmount));
            txtPrice.setText("$" + df.format(dblDiscountedPrice));
               
        }
    }
}
