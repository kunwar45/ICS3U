package u3a6_marks_knir;

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
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Kunwar Nir
 * 09-08-2019
 * Title: Marks
 * Purpose: To take mark inputs from the user and display information with the given marks
 */
public class U3A6_Marks_KNir extends JFrame implements ActionListener{
    
    //Adding and declaring variables so that lables, textfields etc. are existent
    JLabel lblTitle;
    JLabel lblStudentMark;
    JTextField txtStudentMark;
    JTextArea txtMarkDisplay;
    JTextArea txtCalculationDisplay;
    JButton btnAdd;
    JButton btnSort;
    JButton btnAnalyze;
    //Creating the arrayList that will store the marks
    ArrayList<Integer> intMarks = new ArrayList<Integer>();
    
    public U3A6_Marks_KNir() {

        //Setting the text for the title bar
        super("Marks");
        //Setting background colour
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null); // set frame layout
        
        //Adding and editing the title label
        lblTitle = new JLabel();
        lblTitle.setText("Marks Program");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 36));

        lblTitle.setForeground(Color.WHITE);

        lblTitle.setSize(263, 50);
        lblTitle.setLocation(169, 0);

        add(lblTitle);

        //Editing and adding label that will prompt user for the students mark
        lblStudentMark = new JLabel();
        lblStudentMark.setText("Student Mark:");
        lblStudentMark.setFont(new Font("Arial", Font.PLAIN, 20));

        lblStudentMark.setForeground(Color.WHITE);

        lblStudentMark.setSize(350, 50);
        lblStudentMark.setLocation(25, 50);

        add(lblStudentMark);

        //Editing and adding the text field for the mark       
        txtStudentMark = new JTextField();
        txtStudentMark.setFont(new Font("Arial", Font.PLAIN, 20));

        txtStudentMark.setSize(263, 30);
        txtStudentMark.setLocation(169, 60);

        add(txtStudentMark);

        //Adding and editing the add button
        btnAdd = new JButton();
        btnAdd.setText("Add");
        btnAdd.setSize(90, 30);
        btnAdd.setLocation(450, 60);
        btnAdd.setActionCommand("Add");
        btnAdd.addActionListener(this);

        add(btnAdd);

        //Adding and editing the sort button
        btnSort = new JButton();
        btnSort.setText("Sort");
        btnSort.setSize(90, 30);
        btnSort.setLocation(67, 575);
        btnSort.setActionCommand("Sort");
        btnSort.addActionListener(this);

        add(btnSort);

        //Adding and editing the analyze button
        btnAnalyze = new JButton();
        btnAnalyze.setText("Analyze");
        btnAnalyze.setSize(90, 30);
        btnAnalyze.setLocation(355, 575);
        btnAnalyze.setActionCommand("Analyze");
        btnAnalyze.addActionListener(this);

        add(btnAnalyze);

        //Editing and adding text area that will display the marks
        txtMarkDisplay = new JTextArea();
        txtMarkDisplay.setText("");
        txtMarkDisplay.setFont(new Font("Arial", Font.PLAIN, 20));

        txtMarkDisplay.setForeground(Color.BLACK);
        txtMarkDisplay.setBackground(Color.WHITE);

        txtMarkDisplay.setSize(175, 400);
        txtMarkDisplay.setLocation(25, 150);

        add(txtMarkDisplay);
        
        //Editing and adding text area that will display the final display
        txtCalculationDisplay = new JTextArea();
        txtCalculationDisplay.setText("");
        txtCalculationDisplay.setFont(new Font("Arial", Font.PLAIN, 20));

        txtCalculationDisplay.setForeground(Color.BLACK);
        txtCalculationDisplay.setBackground(Color.WHITE);

        txtCalculationDisplay.setSize(300, 400);
        txtCalculationDisplay.setLocation(250, 150);

        add(txtCalculationDisplay);
    }
    
    public void actionPerformed(ActionEvent e) {
        
        //Declaring variables for displays
        String strDisplay = "";
        String strFinalDisplay = "";
        
        //If add button is clicked
        if (e.getActionCommand().equals("Add")) {
            
            //If statement to check if mark is within 0-100
            if(Integer.parseInt(txtStudentMark.getText()) >= 0 && Integer.parseInt(txtStudentMark.getText()) <= 100){
                //Adding the input text to the arrayList
                intMarks.add(Integer.parseInt(txtStudentMark.getText()));
            
                //For loop to display the arrayList
                for (int i = 0; i < intMarks.size(); i++) {
                
                    //Storing this in the display variable
                    strDisplay = strDisplay + "\n" + intMarks.get(i);
            
                }
            
                //Setting the display text
                txtMarkDisplay.setText(strDisplay);
            }
        }
        
        //If sort button is clicked
        if (e.getActionCommand().equals("Sort")) {
            
            //Sorting the arrayList
            Collections.sort(intMarks);
            
            //For loop to display the arrayList
            for (int i = 0; i < intMarks.size(); i++) {
                
                //Storing this in the display variable
                strDisplay = strDisplay + "\n" + intMarks.get(i);
            
            }
            
            //Setting the display text
            txtMarkDisplay.setText(strDisplay);
            
        }
        
        //If analyze button is clicked
        if (e.getActionCommand().equals("Analyze")) {
            
            //Declaring variables taht will store mean, max value, min, range and the levels
            double dblAverage;
            int intMax;
            int intMin;
            int intRange;
            String strLevels = "";
            
            //Calling and capturing the mean method
            dblAverage = classAverage(intMarks);
            
            //Calling and capturing the max method
            intMax = maxMark(intMarks);
            
            //Calling and capturing the min method
            intMin = minMark(intMarks);
            
            //Assigning value for range
            intRange = intMax - intMin;
            
            //Calling and capturing the levels method
            strLevels = studentLevels(intMarks);
            
            ///Assigning value for final display
            strFinalDisplay = "Class average: " + dblAverage + "%\n" +
                    "Maximun mark: " + intMax + "\n" + "Minimum mark: " + intMin +
                    "\n" + "Range of marks: " + intRange + "\n" + strLevels;
            
            //Setting the display text
            txtCalculationDisplay.setText(strFinalDisplay);
            
        }
        
    }
    
    /*
    *
    * @param intMarks is the arrayList of marks
    * @return the mean 
    */
    //Setting up method for mean
    public static double classAverage(ArrayList<Integer> intMarks) {
        
        //Declaring variable for sum of marks
        double dblTotal = 0;
        
        //For loop to add all the values to the sum
        for (int i = 0; i < intMarks.size(); i++) {
            
            dblTotal = dblTotal + intMarks.get(i);
            
        }
        
        //D+Getting the mean by dividing the sum by number of elements and storing it in a variable
        double dblClassAverage = dblTotal / intMarks.size();
        
        //Returning the average
        return dblClassAverage;
        
    }
    
    /*
    *
    * @param intMarks is the arrayList of marks
    * @return the max mark 
    */
    //Setting up method for max mark
    public static int maxMark (ArrayList<Integer> intMarks) {
        
        //Declaring variable for max mark
        int intMaxMark = 0;
        
        //Sorting the arrayList
        Collections.sort(intMarks);
        
        //Getting the max and storing teh value
        intMaxMark = intMarks.get(intMarks.size() - 1);
        
        //Returning the max mark
        return intMaxMark;
        
    }
    
    /*
    *
    * @param intMarks is the arrayList of marks
    * @return the min 
    */
    //Setting up method for min mark
    public static int minMark(ArrayList<Integer> intMarks) {
        
        //Declaring variable for min mark
        int intMinMark = 0;
        
        //Sorting the arrayList
        Collections.sort(intMarks);
        
        //Getting the min and storing the value
        intMinMark = intMarks.get(0);
        
        //Returning the min mark
        return intMinMark;
        
    }
    
    /*
    *
    * @param intMarks is the arrayList of marks
    * @return the levels
    */
    //Setting up method for the student levels
    public static String studentLevels (ArrayList<Integer> intMarks) {
        
        //Declaring the variables for all the levels
        int intLevelR = 0;
        int intLevel1 = 0;
        int intLevel2 = 0;
        int intLevel3 = 0;
        int intLevel4 = 0;
        
        //For loop to check every value in the arrayList
        for (int i = 0; i <intMarks.size(); i++) {
            
            //If statement to check if it meets parameters for level R
            if (intMarks.get(i) < 50) { 
                //Adding 1 to the level R variable
                intLevelR++;  
            }
            
            //If statement to check if it meets parameters for level 1
            if (intMarks.get(i) >= 50 && intMarks.get(i) < 60){
                //Adding 1 to the level 1 variable
                intLevel1++;
            }
            
            //If statement to check if it meets parameters for level 2
            if (intMarks.get(i) >= 60 && intMarks.get(i) < 70){
                //Adding 1 to the level 2 variable
                intLevel2++;
            }
            
            //If statement to check if it meets parameters for level 3
            if (intMarks.get(i) >= 70 && intMarks.get(i) < 80){
                //Adding 1 to the level 3 variable
                intLevel3++;
            }
            
            //If statement to check if it meets parameters for level 4
            if (intMarks.get(i) >= 80){  
                //Adding 1 to the level 4 variable
                intLevel4++;
            }
               
        }
        
        //Declarig and assigning the value for the final dispay
        String strFinal = "Number at level 4: " + intLevel4 + "\n" +
                "Number at level 3: " + intLevel3 + "\n" +
                "Number at level 2: " + intLevel2 + "\n" +
                "Number at level 1: " + intLevel1 + "\n" +
                "Number at level R: " + intLevelR + "\n";
        
        //Returning the final value
        return strFinal;
    } 
    
}