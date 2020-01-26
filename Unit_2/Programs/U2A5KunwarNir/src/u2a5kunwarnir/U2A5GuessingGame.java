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

/**
 *
 * @author Kunwar Nir
 * 27-07-2019
 * Title: Guessing Game
 * Purpose: TO get a random number and have the user guess it
 */

public class U2A5GuessingGame extends JFrame implements ActionListener {
    
    //Declaring variable for random number and assigning the value
    int intRandNum = (int)Math.ceil(Math.random()*100);
    
    JLabel lblTitle;
    JLabel lblNumber;
    JLabel lblDisplay;
    JLabel lblTemperature;
    JTextField txtNumber;
    JButton btnEnter;
    
    public U2A5GuessingGame () {
        
        //Setting the text for the title bar
        super ("Guessing Game");
        //Setting background colour
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null); // set frame layout
        
        //Adding and editing the title label
        lblTitle = new JLabel();
        lblTitle.setText("Guessing Game");
        lblTitle.setFont(new Font ("Arial", Font.BOLD, 36));
              
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBackground(Color.yellow);
        
        lblTitle.setSize(275, 50);
        lblTitle.setLocation(113, 0);
                
        add(lblTitle);
        
        //Editing and adding label that will ask for your guess
        lblNumber = new JLabel();
        lblNumber.setText("Enter Your Guess (1-100):");
        lblNumber.setFont(new Font ("Arial", Font.BOLD, 20));
              
        lblNumber.setForeground(Color.WHITE);
        lblNumber.setBackground(Color.yellow);
        
        lblNumber.setSize(350, 50);
        lblNumber.setLocation(25, 100);
                
        add(lblNumber);
                
        //Editing and adding the text field for your guess        
        txtNumber = new JTextField();
        txtNumber.setFont(new Font ("Arial", Font.BOLD, 20));
        
        txtNumber.setSize(120, 30);
        txtNumber.setLocation(350, 110);
                
        add(txtNumber);
        
        //Adding and editing the button
        btnEnter = new JButton();
        btnEnter.setText("ENTER");
        btnEnter.setSize(90, 30);
        btnEnter.setLocation(355, 180);
        btnEnter.setActionCommand("ENTER");
        btnEnter.addActionListener(this);
        
        add(btnEnter);
        
        //Editing and adding label that will display if you were too high or too low
        lblDisplay = new JLabel();
        lblDisplay.setText(" ");
        lblDisplay.setFont(new Font ("Arial", Font.BOLD, 20));
              
        lblDisplay.setForeground(Color.WHITE);
        lblDisplay.setBackground(Color.yellow);
        
        lblDisplay.setSize(450, 50);
        lblDisplay.setLocation(25, 250);
                
        add(lblDisplay);
        
        //Editing and adding label that will dsiplay how hot or cold you are
        lblTemperature = new JLabel();
        lblTemperature.setText(" ");
        lblTemperature.setFont(new Font ("Arial", Font.BOLD, 20));
              
        lblTemperature.setForeground(Color.WHITE);
        lblTemperature.setBackground(Color.yellow);
        
        lblTemperature.setSize(450, 50);
        lblTemperature.setLocation(25, 300);
                        
        add(lblTemperature);
        
    }
    
    public void actionPerformed (ActionEvent e){
        
        if(e.getActionCommand().equals("ENTER")){
            
            //Declaring Variables
            int intUserNumber, intTemperature;
            //Assigning value for variables
            intUserNumber = Integer.parseInt(txtNumber.getText());
            intTemperature = intRandNum - intUserNumber;
            
            //If statement to compare numbers
            if (intUserNumber == intRandNum){
                
                lblDisplay.setText("You Got It!");
                
            }
            
            else if (intUserNumber > intRandNum) {
                
                lblDisplay.setText("Too High!");
                
            }
            
            else if (intUserNumber < intRandNum) {
                
                lblDisplay.setText("Too Low!");
                  
            }
            
            //If statement to check how away your guess is
            if (Math.abs(intTemperature) > 50){
                    
                lblTemperature.setText("Your Freezing!");
                    
            }
                
            else if (Math.abs(intTemperature) > 25 && Math.abs(intTemperature) < 50){
                    
                lblTemperature.setText("Your Cold!");
                    
            }
                
            else if (Math.abs(intTemperature) > 15 && Math.abs(intTemperature) < 25){
                    
                lblTemperature.setText("Your Cool!");
                    
            }
                
            else if (Math.abs(intTemperature) > 10 && Math.abs(intTemperature) < 15){
                    
                lblTemperature.setText("Your Warm!");
                    
            }
                
            else if (Math.abs(intTemperature) > 5 && Math.abs(intTemperature) < 10){
                    
                lblTemperature.setText("Your Hot!");
                    
            }
                
            else if (Math.abs(intTemperature) > 1 && Math.abs(intTemperature) < 4){
                    
                lblTemperature.setText("Your Boiling!");
                
            }
                
            else if (Math.abs(intTemperature) == 0){
                
                lblTemperature.setText(" ");
                    
            }
            
        }
        
    }
    
}