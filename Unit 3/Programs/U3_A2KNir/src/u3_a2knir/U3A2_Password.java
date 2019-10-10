package u3_a2knir;

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
 * 01-08-2019
 * Title: Password
 * Purpose: To create valid password and check if it is valid
 */
public class U3A2_Password extends JFrame implements ActionListener {
    
    //Adding and declaring variables so that lables, textfields etc. are existent
    JLabel lblTitle;
    JLabel lblUsername;
    JLabel lblPassword;
    JLabel lblPasswordParameter;
    JLabel lblDisplay;
    JTextField txtUsername;
    JTextField txtPassword;
    JButton btnEnter;
    
    public U3A2_Password() {

        //Setting the text for the title bar
        super("Password Program");
        //Setting background colour
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null); // set frame layout

        //Adding and editing the title label
        lblTitle = new JLabel();
        lblTitle.setText("Password Program");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 36));

        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBackground(Color.yellow);

        lblTitle.setSize(330, 50);
        lblTitle.setLocation(85, 0);

        add(lblTitle);

        //Editing and adding label that will ask for your username
        lblUsername = new JLabel();
        lblUsername.setText("Enter a username:");
        lblUsername.setFont(new Font("Arial", Font.BOLD, 20));

        lblUsername.setForeground(Color.WHITE);
        lblUsername.setBackground(Color.yellow);

        lblUsername.setSize(350, 50);
        lblUsername.setLocation(25, 100);

        add(lblUsername);

        //Editing and adding label that will ask for your password
        lblPassword = new JLabel();
        lblPassword.setText("Enter a password");
        lblPassword.setFont(new Font("Arial", Font.BOLD, 20));

        lblPassword.setForeground(Color.WHITE);
        lblPassword.setBackground(Color.yellow);

        lblPassword.setSize(350, 50);
        lblPassword.setLocation(25, 150);

        add(lblPassword);
        
        //Editing and adding label that will display the parameters of the password
        lblPasswordParameter = new JLabel();
        lblPasswordParameter.setText("(Must be 8 characters)");
        lblPasswordParameter.setFont(new Font("Arial", Font.PLAIN, 14));

        lblPasswordParameter.setForeground(Color.WHITE);
        lblPasswordParameter.setBackground(Color.yellow);

        lblPasswordParameter.setSize(350, 50);
        lblPasswordParameter.setLocation(40, 170);

        add(lblPasswordParameter);

        //Editing and adding the text field for your username        
        txtUsername = new JTextField();
        txtUsername.setFont(new Font("Arial", Font.BOLD, 20));

        txtUsername.setSize(120, 30);
        txtUsername.setLocation(350, 110);

        add(txtUsername);

        //Editing and adding the text field for your password        
        txtPassword = new JTextField();
        txtPassword.setFont(new Font("Arial", Font.BOLD, 20));

        txtPassword.setSize(120, 30);
        txtPassword.setLocation(350, 160);

        add(txtPassword);

        //Editing and adding label that will be final display
        lblDisplay = new JLabel();
        lblDisplay.setText(" ");
        lblDisplay.setFont(new Font("Arial", Font.BOLD, 20));

        lblDisplay.setForeground(Color.RED);
        lblDisplay.setBackground(Color.yellow);

        lblDisplay.setSize(475, 150);
        lblDisplay.setLocation(25, 340);

        add(lblDisplay);

        //Adding and editing the button
        btnEnter = new JButton();
        btnEnter.setText("Generate Password");
        btnEnter.setSize(400, 30);
        btnEnter.setLocation(50, 275);
        btnEnter.setActionCommand("ENTER");
        btnEnter.addActionListener(this);

        add(btnEnter);

    }
    
    public void actionPerformed(ActionEvent e) {
        
        if (e.getActionCommand().equals("ENTER")) {
            
            //Declaring and assigning value for variables for username and password
            String strUsername = txtUsername.getText();
            String strPassword = txtPassword.getText();
            
            //If statement to check password length
            if (strPassword.length() >= 8 ){
                
                //Declaring variable for random number and assigning the value
                int intRandNum = (int)Math.ceil(Math.random()*100);
                
                //Adding the number to the password
                strPassword = strPassword + intRandNum;
                
                //making the username lower case
                strUsername = strUsername.toLowerCase();
                
                //Creating Variable for lowercase password
                String strFinalPass = strPassword.toLowerCase();
                
                //Printing final value
                lblDisplay.setText("Username: " + strUsername + " Password: " + strFinalPass);
                
            }
            
            //If password is not long enough
            else if (strPassword.length() < 8){
                
                //Printing final statement
                lblDisplay.setText("Password must be at least 8 characters long");
                
            }
            
        }
        
    }
    
}
