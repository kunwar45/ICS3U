package u2a6knir;

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

/**
 *
 * @author Kunwar Nir
 * 29-07-2019
 * Title: Fun With Loops
 * Purpose: 
 */
public class U2A6FunWithLoops extends JFrame implements ActionListener {
    
    //Adding and declaring variables so that lables, textfields etc. are existent
    JLabel lblTitle;
    JLabel lblStartNumber;
    JLabel lblEndNumber;
    JLabel lblDisplay;
    JTextField txtStartNumber;
    JTextField txtEndNumber;
    JButton btnEnter;
    
     public U2A6FunWithLoops () {
        
        //Setting the text for the title bar
        super ("Fun With Loops");
        //Setting background colour
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null); // set frame layout
        
        //Adding and editing the title label
        lblTitle = new JLabel();
        lblTitle.setText("Fun With Loops!");
        lblTitle.setFont(new Font ("Arial", Font.BOLD, 36));
              
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBackground(Color.yellow);
        
        lblTitle.setSize(279, 50);
        lblTitle.setLocation(111, 0);
                
        add(lblTitle);
        
        //Editing and adding label that will ask for your starting number
        lblStartNumber = new JLabel();
        lblStartNumber.setText("Enter a starting number:");
        lblStartNumber.setFont(new Font ("Arial", Font.BOLD, 20));
              
        lblStartNumber.setForeground(Color.WHITE);
        lblStartNumber.setBackground(Color.yellow);
        
        lblStartNumber.setSize(350, 50);
        lblStartNumber.setLocation(25, 100);
                
        add(lblStartNumber);
        
         //Editing and adding label that will ask for your ending number
        lblEndNumber = new JLabel();
        lblEndNumber.setText("Enter an ending number:");
        lblEndNumber.setFont(new Font ("Arial", Font.BOLD, 20));
              
        lblEndNumber.setForeground(Color.WHITE);
        lblEndNumber.setBackground(Color.yellow);
        
        lblEndNumber.setSize(350, 50);
        lblEndNumber.setLocation(25, 150);
                
        add(lblEndNumber);
        
        //Editing and adding the text field for starting number        
        txtStartNumber = new JTextField();
        txtStartNumber.setFont(new Font ("Arial", Font.BOLD, 20));
        
        txtStartNumber.setSize(120, 30);
        txtStartNumber.setLocation(350, 110);
                
        add(txtStartNumber);
        
         //Editing and adding the text field for ending number        
        txtEndNumber = new JTextField();
        txtEndNumber.setFont(new Font ("Arial", Font.BOLD, 20));
        
        txtEndNumber.setSize(120, 30);
        txtEndNumber.setLocation(350, 160);
                
        add(txtEndNumber);
        
        //Editing and adding label that will be final display
        lblDisplay = new JLabel();
        lblDisplay.setText(" ");
        lblDisplay.setFont(new Font ("Arial", Font.BOLD, 20));
              
        lblDisplay.setForeground(Color.RED);
        lblDisplay.setBackground(Color.yellow);
        
        lblDisplay.setSize(450, 50);
        lblDisplay.setLocation(25, 300);
                        
        add(lblDisplay);
        
        //Adding and editing the button
        btnEnter = new JButton();
        btnEnter.setText("ENTER");
        btnEnter.setSize(90, 30);
        btnEnter.setLocation(355, 200);
        btnEnter.setActionCommand("ENTER");
        btnEnter.addActionListener(this);
        
        add(btnEnter);
        
    }
     
    public void actionPerformed (ActionEvent e){
        
        if(e.getActionCommand().equals("ENTER")){
            
            //Declaring variables
            int intStartNumber, intEndNumber;
            
            //Assigning value for starting number
            intStartNumber = Integer.parseInt(txtStartNumber.getText());
            
            //Assigning value for ending number
            intEndNumber = Integer.parseInt(txtEndNumber.getText());
            
            //For loop to print the numbers
            for (int i = intStartNumber; i <= intEndNumber; i++){
                
                //This will append all the numbers to show them in a sequence
                this.lblDisplay.setText(lblDisplay.getText() + " " + i);
                
            }
            
        }
        
    }
    
}
