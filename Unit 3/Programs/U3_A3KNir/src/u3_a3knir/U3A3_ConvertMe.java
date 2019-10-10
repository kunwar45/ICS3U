package u3_a3knir;

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
import java.text.DecimalFormat;

/**
 *
 * @author Kunwar Nir 
 * 03-08-2019 
 * Title: Convert Me 
 * Purpose: To convert measurements from one system of measure to another
 */
public class U3A3_ConvertMe extends JFrame implements ActionListener {
    
    //Adding and declaring variables so that lables, textfields etc. are existent
    JLabel lblTitle;
    JLabel lblInchesToCentimetres;
    JLabel lblFeetToCentimetres;
    JLabel lblYardsToMetres;
    JLabel lblMilesToKilometres;
    JLabel lblCentimetresToInches;
    JLabel lblCentimetresToFeet;
    JLabel lblMetresToYards;
    JLabel lblKilometresToMiles;
    JLabel lblConversionChoice;
    JLabel lblConvertValue;
    JLabel lblDisplay;
    JTextField txtConversionChoice;
    JTextField txtConvertValue;
    JButton btnEnter;

    public U3A3_ConvertMe() {

        //Setting the text for the title bar
        super("Linear Conversion");
        //Setting background colour
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null); // set frame layout

        //Adding and editing the title label
        lblTitle = new JLabel();
        lblTitle.setText("Linear Conversion");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 36));

        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBackground(Color.yellow);

        lblTitle.setSize(323, 50);
        lblTitle.setLocation(89, 0);

        add(lblTitle);

        //Editing and adding label that will display the first option
        lblInchesToCentimetres = new JLabel();
        lblInchesToCentimetres.setText("1. Inches to Centimetres");
        lblInchesToCentimetres.setFont(new Font("Arial", Font.PLAIN, 18));

        lblInchesToCentimetres.setForeground(Color.WHITE);
        lblInchesToCentimetres.setBackground(Color.yellow);

        lblInchesToCentimetres.setSize(350, 50);
        lblInchesToCentimetres.setLocation(150, 50);

        add(lblInchesToCentimetres);

        //Editing and adding label that will display the second option
        lblFeetToCentimetres = new JLabel();
        lblFeetToCentimetres.setText("2. Feet to Centimetres");
        lblFeetToCentimetres.setFont(new Font("Arial", Font.PLAIN, 18));

        lblFeetToCentimetres.setForeground(Color.WHITE);
        lblFeetToCentimetres.setBackground(Color.yellow);

        lblFeetToCentimetres.setSize(350, 50);
        lblFeetToCentimetres.setLocation(150, 70);

        add(lblFeetToCentimetres);

        //Editing and adding label that will display the third option
        lblYardsToMetres = new JLabel();
        lblYardsToMetres.setText("3. Yards to Metres");
        lblYardsToMetres.setFont(new Font("Arial", Font.PLAIN, 18));

        lblYardsToMetres.setForeground(Color.WHITE);
        lblYardsToMetres.setBackground(Color.yellow);

        lblYardsToMetres.setSize(350, 50);
        lblYardsToMetres.setLocation(150, 90);

        add(lblYardsToMetres);

        //Editing and adding label that will display the fourth option
        lblMilesToKilometres = new JLabel();
        lblMilesToKilometres.setText("4. Miles to Kilometres");
        lblMilesToKilometres.setFont(new Font("Arial", Font.PLAIN, 18));

        lblMilesToKilometres.setForeground(Color.WHITE);
        lblMilesToKilometres.setBackground(Color.yellow);

        lblMilesToKilometres.setSize(350, 50);
        lblMilesToKilometres.setLocation(150, 110);

        add(lblMilesToKilometres);
        
        //Editing and adding label that will display the fifth option
        lblInchesToCentimetres = new JLabel();
        lblInchesToCentimetres.setText("5. Centimetres to Inches");
        lblInchesToCentimetres.setFont(new Font("Arial", Font.PLAIN, 18));

        lblInchesToCentimetres.setForeground(Color.WHITE);
        lblInchesToCentimetres.setBackground(Color.yellow);

        lblInchesToCentimetres.setSize(350, 50);
        lblInchesToCentimetres.setLocation(150, 130);

        add(lblInchesToCentimetres);

        //Editing and adding label that will display the sixth option
        lblFeetToCentimetres = new JLabel();
        lblFeetToCentimetres.setText("6. Centimetres to Feet");
        lblFeetToCentimetres.setFont(new Font("Arial", Font.PLAIN, 18));

        lblFeetToCentimetres.setForeground(Color.WHITE);
        lblFeetToCentimetres.setBackground(Color.yellow);

        lblFeetToCentimetres.setSize(350, 50);
        lblFeetToCentimetres.setLocation(150, 150);

        add(lblFeetToCentimetres);

        //Editing and adding label that will display the seventh option
        lblYardsToMetres = new JLabel();
        lblYardsToMetres.setText("7. Metres to Yards");
        lblYardsToMetres.setFont(new Font("Arial", Font.PLAIN, 18));

        lblYardsToMetres.setForeground(Color.WHITE);
        lblYardsToMetres.setBackground(Color.yellow);

        lblYardsToMetres.setSize(350, 50);
        lblYardsToMetres.setLocation(150, 170);

        add(lblYardsToMetres);

        //Editing and adding label that will display the eighth option
        lblMilesToKilometres = new JLabel();
        lblMilesToKilometres.setText("8. Kilometres to Miles");
        lblMilesToKilometres.setFont(new Font("Arial", Font.PLAIN, 18));

        lblMilesToKilometres.setForeground(Color.WHITE);
        lblMilesToKilometres.setBackground(Color.yellow);

        lblMilesToKilometres.setSize(350, 50);
        lblMilesToKilometres.setLocation(150, 190);

        add(lblMilesToKilometres);

        //Editing and adding label that will ask for your choice of conversion
        lblConversionChoice = new JLabel();
        lblConversionChoice.setText("Enter conversion choice (1-8):");
        lblConversionChoice.setFont(new Font("Arial", Font.BOLD, 20));

        lblConversionChoice.setForeground(Color.WHITE);
        lblConversionChoice.setBackground(Color.yellow);

        lblConversionChoice.setSize(350, 50);
        lblConversionChoice.setLocation(25, 220);

        add(lblConversionChoice);

        //Editing and adding label that will ask for your value to convert
        lblConvertValue = new JLabel();
        lblConvertValue.setText("Enter value to be converted:");
        lblConvertValue.setFont(new Font("Arial", Font.BOLD, 20));

        lblConvertValue.setForeground(Color.WHITE);
        lblConvertValue.setBackground(Color.yellow);

        lblConvertValue.setSize(350, 50);
        lblConvertValue.setLocation(25, 270);

        add(lblConvertValue);

        //Editing and adding the text field for your choice of conversion        
        txtConversionChoice = new JTextField();
        txtConversionChoice.setFont(new Font("Arial", Font.BOLD, 20));

        txtConversionChoice.setSize(120, 30);
        txtConversionChoice.setLocation(350, 230);

        add(txtConversionChoice);

        //Editing and adding the text field for your conversion value        
        txtConvertValue = new JTextField();
        txtConvertValue.setFont(new Font("Arial", Font.BOLD, 20));

        txtConvertValue.setSize(120, 30);
        txtConvertValue.setLocation(350, 280);

        add(txtConvertValue);

        //Editing and adding label that will be final display
        lblDisplay = new JLabel();
        lblDisplay.setText(" ");
        lblDisplay.setFont(new Font("Arial", Font.BOLD, 20));

        lblDisplay.setForeground(Color.WHITE);
        lblDisplay.setBackground(Color.yellow);

        lblDisplay.setSize(400, 150);
        lblDisplay.setLocation(25, 330);

        add(lblDisplay);

        //Adding and editing the button
        btnEnter = new JButton();
        btnEnter.setText("CONVERT");
        btnEnter.setSize(450, 30);
        btnEnter.setLocation(25, 325);
        btnEnter.setActionCommand("ENTER");
        btnEnter.addActionListener(this);

        add(btnEnter);

    }

    public void actionPerformed(ActionEvent e) {
        
        //Adding the decimal format
        DecimalFormat df = new DecimalFormat("#.##");

        if (e.getActionCommand().equals("ENTER")) {

            //Declaring variale for conversion choice and value to be converted, the converted value and the result 
            int intConversionChoice;
            Double dblConvertValue, dblResult;

            //Assigning value for the conversion choice
            intConversionChoice = Integer.parseInt(txtConversionChoice.getText());

            //Assigning value for the value to be converted
            dblConvertValue = Double.parseDouble(txtConvertValue.getText());

            //Switch case to check for which conversion type the user chose
            switch (intConversionChoice) {

                case 1:
                    //Capturing the return value into a variable
                    dblResult = inchesToCentimetres(dblConvertValue);
                    //Setting the final display
                    lblDisplay.setText(dblConvertValue + " inches = " + df.format(dblResult) + " centimetres");
                    break;
                case 2:
                    //Capturing the return value into a variable
                    dblResult = feetToCentimetres(dblConvertValue);
                    //Setting the final display
                    lblDisplay.setText(dblConvertValue + " feet = " + df.format(dblResult) + " centimetres");
                    break;
                case 3:
                    //Capturing the return value into a variable
                    dblResult = yardsToMetres(dblConvertValue);
                    //Setting the final display
                    lblDisplay.setText(dblConvertValue + " yards = " + df.format(dblResult) + " metres");
                    break;
                case 4:
                    //Capturing the return value into a variable
                    dblResult = milesToKilometres(dblConvertValue);
                    //Setting the final display
                    lblDisplay.setText(dblConvertValue + " miles = " + df.format(dblResult) + " kilometres");
                    break;
                case 5:
                    //Capturing the return value into a variable
                    dblResult = centimetresToInches(dblConvertValue);
                    //Setting the final display
                    lblDisplay.setText(dblConvertValue + " centimetres = " + df.format(dblResult) + " inches");
                    break;
                case 6:
                    //Capturing the return value into a variable
                    dblResult = centimetresToFeet(dblConvertValue);
                    //Setting the final display
                    lblDisplay.setText(dblConvertValue + " centimetres = " + df.format(dblResult) + " feet");
                    break;
                case 7:
                    //Capturing the return value into a variable
                    dblResult = metresToYards(dblConvertValue);
                    //Setting the final display
                    lblDisplay.setText(dblConvertValue + " metres = " + df.format(dblResult) + " yards");
                    break;
                case 8:
                    //Capturing the return value into a variable
                    dblResult = kilometresToMiles(dblConvertValue);
                    //Setting the final display
                    lblDisplay.setText(dblConvertValue + " kilometres = " + df.format(dblResult) + " miles");
                    break;
                default:
                    lblDisplay.setText("Please enter a vaild conversion choice!");
            }
        }
    }
    
    /*
    *
    * @param dblConvertValue is the value that the user wishes to convert
    * @param lblDisplay is the final display label
    * @return the converted value 
    */
    //Setting up method for inches to centimetres
    public static double inchesToCentimetres (double dblConvertValue) {

        //Declaring and assigning value for the converted value
        double dblConvertedValue = dblConvertValue * 2.54;
        
        //Returning final value
        return dblConvertedValue;
    }
    
    /*
    *
    * @param dblConvertValue is the value that the user wishes to convert
    * @param lblDisplay is the final display label
    * @return the converted value 
    */
    //Setting up method for feet to centimetres
    public static double feetToCentimetres (double dblConvertValue) {
        
        //Declaring and assigning value for the converted value
        double dblConvertedValue = dblConvertValue * 30;
        
        //Returning final value
        return dblConvertedValue;
    }
    
    /*
    *
    * @param dblConvertValue is the value that the user wishes to convert
    * @param lblDisplay is the final display label
    * @return the converted value 
    */
     //Setting up method for yards to metres
    public static double yardsToMetres (double dblConvertValue) {
        
        //Declaring and assigning value for the converted value
        double dblConvertedValue = dblConvertValue * 0.91;
        
        //Returning final value
        return dblConvertedValue;
    }
    
    /*
    *
    * @param dblConvertValue is the value that the user wishes to convert
    * @param lblDisplay is the final display label
    * @return the converted value 
    */
     //Setting up method for miles to kilometres
    public static double milesToKilometres (double dblConvertValue) {
       
        //Declaring and assigning value for the converted value
        double dblConvertedValue = dblConvertValue * 1.6;
        
        //Returning final value
        return dblConvertedValue;
    }
    
    /*
    *
    * @param dblConvertValue is the value that the user wishes to convert
    * @param lblDisplay is the final display label
    * @return the converted value 
    */
    //Setting up method for centimetres to inches
    public static double centimetresToInches (double dblConvertValue){
        
        //Declaring and assigning value for the converted value
        double dblConvertedValue = dblConvertValue / 2.54;
        
        //Returning final value
        return dblConvertedValue; 
    }
    
    /*
    *
    * @param dblConvertValue is the value that the user wishes to convert
    * @param lblDisplay is the final display label
    * @return the converted value 
    */
    //Setting up method for centimetres to feet
    public static double centimetresToFeet (double dblConvertValue){
        
        //Declaring and assigning value for the converted value
        double dblConvertedValue = dblConvertValue / 30.48;
        
        //Returning final value
        return dblConvertedValue;
    }
    
    /*
    *
    * @param dblConvertValue is the value that the user wishes to convert
    * @param lblDisplay is the final display label
    * @return the converted value 
    */
    //Setting up method for metres to yards
    public static double metresToYards (double dblConvertValue){
        
        //Declaring and assigning value for the converted value
        double dblConvertedValue = dblConvertValue * 1.094;
        
        //Returning final value
        return dblConvertedValue;   
    }
    
    /*
    *
    * @param dblConvertValue is the value that the user wishes to convert
    * @param lblDisplay is the final display label
    * @return the converted value 
    */
    //Setting up method for kilometres to miles
    public static double kilometresToMiles (double dblConvertValue){
        
        //Declaring and assigning value for the converted value
        double dblConvertedValue = dblConvertValue / 1.609 ;
        
        //Returning final value
        return dblConvertedValue;
    }
}
