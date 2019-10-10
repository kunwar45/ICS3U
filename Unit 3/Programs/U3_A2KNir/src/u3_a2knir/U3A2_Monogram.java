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
import java.util.Locale;

/**
 *
 * @author Kunwar Nir
 * 01-08-2019
 * Title: Monogram
 * Purpose: To create a monogram with your first, middle and last name
 */
public class U3A2_Monogram extends JFrame implements ActionListener {
    
    //Adding and declaring variables so that lables, textfields etc. are existent
    JLabel lblTitle;
    JLabel lblFirstName;
    JLabel lblMiddleName;
    JLabel lblLastName;
    JLabel lblDisplay;
    JTextField txtFirstName;
    JTextField txtMiddleName;
    JTextField txtLastName;
    JButton btnEnter;

    public U3A2_Monogram() {

        //Setting the text for the title bar
        super("Monogram Creator");
        //Setting background colour
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null); // set frame layout

        //Adding and editing the title label
        lblTitle = new JLabel();
        lblTitle.setText("Monogram Creator");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 36));

        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBackground(Color.yellow);

        lblTitle.setSize(323, 50);
        lblTitle.setLocation(89, 0);

        add(lblTitle);

        //Editing and adding label that will ask for your first name
        lblFirstName = new JLabel();
        lblFirstName.setText("Enter your first name:");
        lblFirstName.setFont(new Font("Arial", Font.BOLD, 20));

        lblFirstName.setForeground(Color.WHITE);
        lblFirstName.setBackground(Color.yellow);

        lblFirstName.setSize(350, 50);
        lblFirstName.setLocation(25, 100);

        add(lblFirstName);

        //Editing and adding label that will ask for your middle name
        lblMiddleName = new JLabel();
        lblMiddleName.setText("Enter your middle name:");
        lblMiddleName.setFont(new Font("Arial", Font.BOLD, 20));

        lblMiddleName.setForeground(Color.WHITE);
        lblMiddleName.setBackground(Color.yellow);

        lblMiddleName.setSize(350, 50);
        lblMiddleName.setLocation(25, 150);

        add(lblMiddleName);

        //Editing and adding label that will ask for your last name
        lblLastName = new JLabel();
        lblLastName.setText("Enter last name:");
        lblLastName.setFont(new Font("Arial", Font.BOLD, 20));

        lblLastName.setForeground(Color.WHITE);
        lblLastName.setBackground(Color.yellow);

        lblLastName.setSize(350, 50);
        lblLastName.setLocation(25, 200);

        add(lblLastName);

        //Editing and adding the text field for your first name        
        txtFirstName = new JTextField();
        txtFirstName.setFont(new Font("Arial", Font.BOLD, 20));

        txtFirstName.setSize(120, 30);
        txtFirstName.setLocation(350, 110);

        add(txtFirstName);

        //Editing and adding the text field for your middle name        
        txtMiddleName = new JTextField();
        txtMiddleName.setFont(new Font("Arial", Font.BOLD, 20));

        txtMiddleName.setSize(120, 30);
        txtMiddleName.setLocation(350, 160);

        add(txtMiddleName);

        //Editing and adding the text field for your last name        
        txtLastName = new JTextField();
        txtLastName.setFont(new Font("Arial", Font.BOLD, 20));

        txtLastName.setSize(120, 30);
        txtLastName.setLocation(350, 210);

        add(txtLastName);

        //Editing and adding label that will be final display
        lblDisplay = new JLabel();
        lblDisplay.setText(" ");
        lblDisplay.setFont(new Font("Arial", Font.BOLD, 20));

        lblDisplay.setForeground(Color.RED);
        lblDisplay.setBackground(Color.yellow);

        lblDisplay.setSize(300, 150);
        lblDisplay.setLocation(125, 300);

        add(lblDisplay);

        //Adding and editing the button
        btnEnter = new JButton();
        btnEnter.setText("CREATE MONOGRAM");
        btnEnter.setSize(450, 30);
        btnEnter.setLocation(25, 275);
        btnEnter.setActionCommand("ENTER");
        btnEnter.addActionListener(this);

        add(btnEnter);

    }
    
    public void actionPerformed(ActionEvent e) {
        
        if (e.getActionCommand().equals("ENTER")) {
            
            //Declaring variables for first, middle and last
            String strFirstName = "";
            String strMiddleName = "";
            String strLastName = "";
            
            //Assigning value for first, middle and last name
            strFirstName = txtFirstName.getText();
            strMiddleName = txtMiddleName.getText();
            strLastName = txtLastName.getText();
                        
            //Declaring variables and assigning value for first, middle and last initial
            String strFirstInitial = strFirstName.substring(0,1);
            String strMiddleInitial = strMiddleName.substring(0,1);
            String strLastInitial = strLastName.substring(0,1);
            
            //Formatting and displaying the final value
            lblDisplay.setText("Your monogram is: " + strFirstInitial.toLowerCase() + strLastInitial.toUpperCase() + strMiddleInitial.toLowerCase());
        }
        
    }    
        
}
