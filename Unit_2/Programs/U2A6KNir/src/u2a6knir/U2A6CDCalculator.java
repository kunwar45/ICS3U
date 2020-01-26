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
 * Title: CD Calculator 
 * Purpose: To calculate the
 * price of a CD with interest
 */
public class U2A6CDCalculator extends JFrame implements ActionListener {

    //Adding and declaring variables so that lables, textfields etc. are existent
    JLabel lblTitle;
    JLabel lblCDValue;
    JLabel lblAnnualInterest;
    JLabel lblEndingValue;
    JLabel lblDisplay;
    JTextField txtCDValue;
    JTextField txtAnnualInterest;
    JTextField txtEndingValue;
    JButton btnEnter;

    public U2A6CDCalculator() {

        //Setting the text for the title bar
        super("CD Calculator");
        //Setting background colour
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null); // set frame layout

        //Adding and editing the title label
        lblTitle = new JLabel();
        lblTitle.setText("CD Calculator");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 36));

        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBackground(Color.yellow);

        lblTitle.setSize(237, 50);
        lblTitle.setLocation(132, 0);

        add(lblTitle);

        //Editing and adding label that will ask for your CD investment
        lblCDValue = new JLabel();
        lblCDValue.setText("Enter CD investment ($):");
        lblCDValue.setFont(new Font("Arial", Font.BOLD, 20));

        lblCDValue.setForeground(Color.WHITE);
        lblCDValue.setBackground(Color.yellow);

        lblCDValue.setSize(350, 50);
        lblCDValue.setLocation(25, 100);

        add(lblCDValue);

        //Editing and adding label that will ask for your interest rate
        lblAnnualInterest = new JLabel();
        lblAnnualInterest.setText("Enter annual interest rate (%):");
        lblAnnualInterest.setFont(new Font("Arial", Font.BOLD, 20));

        lblAnnualInterest.setForeground(Color.WHITE);
        lblAnnualInterest.setBackground(Color.yellow);

        lblAnnualInterest.setSize(350, 50);
        lblAnnualInterest.setLocation(25, 150);

        add(lblAnnualInterest);

        //Editing and adding label that will ask for your ending value
        lblEndingValue = new JLabel();
        lblEndingValue.setText("Enter ending value ($):");
        lblEndingValue.setFont(new Font("Arial", Font.BOLD, 20));

        lblEndingValue.setForeground(Color.WHITE);
        lblEndingValue.setBackground(Color.yellow);

        lblEndingValue.setSize(350, 50);
        lblEndingValue.setLocation(25, 200);

        add(lblEndingValue);

        //Editing and adding the text field for CD value        
        txtCDValue = new JTextField();
        txtCDValue.setFont(new Font("Arial", Font.BOLD, 20));

        txtCDValue.setSize(120, 30);
        txtCDValue.setLocation(350, 110);

        add(txtCDValue);

        //Editing and adding the text field for your annual interest        
        txtAnnualInterest = new JTextField();
        txtAnnualInterest.setFont(new Font("Arial", Font.BOLD, 20));

        txtAnnualInterest.setSize(120, 30);
        txtAnnualInterest.setLocation(350, 160);

        add(txtAnnualInterest);

        //Editing and adding the text field for your ending value        
        txtEndingValue = new JTextField();
        txtEndingValue.setFont(new Font("Arial", Font.BOLD, 20));

        txtEndingValue.setSize(120, 30);
        txtEndingValue.setLocation(350, 210);

        add(txtEndingValue);

        //Editing and adding label that will be final display
        lblDisplay = new JLabel();
        lblDisplay.setText(" ");
        lblDisplay.setFont(new Font("Arial", Font.BOLD, 20));

        lblDisplay.setForeground(Color.RED);
        lblDisplay.setBackground(Color.yellow);

        lblDisplay.setSize(475, 150);
        lblDisplay.setLocation(25, 350);

        add(lblDisplay);

        //Adding and editing the button
        btnEnter = new JButton();
        btnEnter.setText("ENTER");
        btnEnter.setSize(90, 30);
        btnEnter.setLocation(360, 250);
        btnEnter.setActionCommand("ENTER");
        btnEnter.addActionListener(this);

        add(btnEnter);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("ENTER")) {

            //Declaring Variables
            double dblAnnualInterest, dblEndingValue;
            double dblCDValue;
            int intYears = 0;
            
            //Assigning value for variables
            dblCDValue = Double.parseDouble(txtCDValue.getText());
            dblAnnualInterest = Double.parseDouble(txtAnnualInterest.getText());
            dblEndingValue = Double.parseDouble(txtEndingValue.getText());
            
            //While loop which runs as long as the CD Value is less than the ending value
            while (dblCDValue <= dblEndingValue) {
                
                //Stating the new cd value after year
                dblCDValue = dblCDValue + (dblCDValue * dblAnnualInterest * 0.01);
                
                //Adding one year as long as the end value is not met
                intYears++;

            }
            
            //Printing the final information
            lblDisplay.setText("The amount of years required is " + intYears);

        }

    }

}
