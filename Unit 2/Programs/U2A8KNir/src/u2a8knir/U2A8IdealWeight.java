package u2a8knir;

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
 * 30-07-2019 
 * Title: Ideal Weight Calculator 
 * Purpose: To calculate the ideal weight of a person given their height
 */
public class U2A8IdealWeight extends JFrame implements ActionListener {
    
    //Adding and declaring variables so that lables, textfields etc. are existent
    JLabel lblTitle;
    JLabel lblName;
    JLabel lblSystemOfMeasure;
    JLabel lblSystemChoice;
    JLabel lblHeight;
    JLabel lblMetricAndImperial;
    JLabel lblDisplay;
    JTextField txtName;
    JTextField txtSystemOfMeasure;
    JTextField txtHeight;
    JButton btnEnter;
    
    public U2A8IdealWeight() {

        //Setting the text for the title bar
        super("Ideal Weight Calculator");
        //Setting background colour
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null); // set frame layout

        //Adding and editing the title label
        lblTitle = new JLabel();
        lblTitle.setText("Ideal Weight Calculator");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 36));

        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBackground(Color.yellow);

        lblTitle.setSize(395, 50);
        lblTitle.setLocation(53, 0);

        add(lblTitle);

        //Editing and adding label that will ask for your Name
        lblName = new JLabel();
        lblName.setText("Enter your name:");
        lblName.setFont(new Font("Arial", Font.BOLD, 20));

        lblName.setForeground(Color.WHITE);
        lblName.setBackground(Color.yellow);

        lblName.setSize(350, 50);
        lblName.setLocation(25, 100);

        add(lblName);

        //Editing and adding label that will ask for your System of measure
        lblSystemOfMeasure = new JLabel();
        lblSystemOfMeasure.setText("System of measure:");
        lblSystemOfMeasure.setFont(new Font("Arial", Font.BOLD, 20));

        lblSystemOfMeasure.setForeground(Color.WHITE);
        lblSystemOfMeasure.setBackground(Color.yellow);

        lblSystemOfMeasure.setSize(350, 50);
        lblSystemOfMeasure.setLocation(25, 150);

        add(lblSystemOfMeasure);
        
        //Editing and adding label that will display how to enter your answer
        lblSystemChoice = new JLabel();
        lblSystemChoice.setText("(M)etric or (I)mperial");
        lblSystemChoice.setFont(new Font("Arial", Font.BOLD, 14));

        lblSystemChoice.setForeground(Color.WHITE);
        lblSystemChoice.setBackground(Color.yellow);

        lblSystemChoice.setSize(350, 50);
        lblSystemChoice.setLocation(40, 170);

        add(lblSystemChoice);

        //Editing and adding label that will ask for your height
        lblHeight = new JLabel();
        lblHeight.setText("Enter your height:");
        lblHeight.setFont(new Font("Arial", Font.BOLD, 20));

        lblHeight.setForeground(Color.WHITE);
        lblHeight.setBackground(Color.yellow);

        lblHeight.setSize(350, 50);
        lblHeight.setLocation(25, 230);

        add(lblHeight);
        
        //Editing and adding label that will display "Metres or inches"
        lblMetricAndImperial = new JLabel();
        lblMetricAndImperial.setText("Metres or Inches");
        lblMetricAndImperial.setFont(new Font("Arial", Font.BOLD, 14));

        lblMetricAndImperial.setForeground(Color.WHITE);
        lblMetricAndImperial.setBackground(Color.yellow);

        lblMetricAndImperial.setSize(350, 50);
        lblMetricAndImperial.setLocation(40, 250);

        add(lblMetricAndImperial);

        //Editing and adding the text field for your name        
        txtName = new JTextField();
        txtName.setFont(new Font("Arial", Font.BOLD, 20));

        txtName.setSize(120, 30);
        txtName.setLocation(350, 110);

        add(txtName);

        //Editing and adding the text field for your system of measure        
        txtSystemOfMeasure = new JTextField();
        txtSystemOfMeasure.setFont(new Font("Arial", Font.BOLD, 20));

        txtSystemOfMeasure.setSize(120, 30);
        txtSystemOfMeasure.setLocation(350, 160);

        add(txtSystemOfMeasure);

        //Editing and adding the text field for your height        
        txtHeight = new JTextField();
        txtHeight.setFont(new Font("Arial", Font.BOLD, 20));

        txtHeight.setSize(120, 30);
        txtHeight.setLocation(350, 240);

        add(txtHeight);

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
        btnEnter.setText("ENTER");
        btnEnter.setSize(90, 30);
        btnEnter.setLocation(360, 320);
        btnEnter.setActionCommand("ENTER");
        btnEnter.addActionListener(this);

        add(btnEnter);

    }
    
    public void actionPerformed(ActionEvent e) {
        
        
        //Declaring the format for the decimal function
        DecimalFormat df = new DecimalFormat("#.##");
        
        if (e.getActionCommand().equals("ENTER")) {
            
            //Declaring Variables
            String strName, strSystemOfMeasure;
            double dblHeight, dblIdealWeight;
            
            //Assigning value for name
            strName = txtName.getText();
            
            //Assigning value for System of measure
            strSystemOfMeasure = txtSystemOfMeasure.getText();
            
            //Assiging value for height
            dblHeight = Double.parseDouble(txtHeight.getText());
            
            //If statement for system of measure
            if (strSystemOfMeasure.equals("M") || strSystemOfMeasure.equals("m")) {
                
                //This will display in metric system
                
                //Assigning value for ideal weight in kg
                dblIdealWeight = dblHeight * dblHeight * 25;
                
                //Setting final display
                lblDisplay.setText(strName + "'s ideal weight is " + df.format(dblIdealWeight) + " kgs");
                
            }
            
            else if (strSystemOfMeasure.equals("I") || strSystemOfMeasure.equals("i")) {
                
                //This will display in imperial system
                
                //Assigning value for ideal weight in lbs
                dblIdealWeight = dblHeight * dblHeight * 25 / 703;
                
                //Setting final display
                lblDisplay.setText(strName + "'s ideal weight is " + df.format(dblIdealWeight) + " lbs");
                
            }
            
        }
        
    }
  
}
