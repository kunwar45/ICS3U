package u3_a4_knir;

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
 * 07-08-2019 
 * Title: CD Collection 
 * Purpose: To sort the users CDs
 */
public class U3A4_CDCollection extends JFrame implements ActionListener {

    //Adding and declaring variables so that lables, textfields etc. are existent
    JLabel lblTitle;
    JLabel lblTitleAndArtist;
    JTextField txtTitleAndArtist;
    JButton btnDisplay;
    JButton btnInitialize;
    JButton btnAdd;
    JButton btnRemove;
    JTextArea txtDisplay;
    //Creating the Array List that will store the cd title and artist
    ArrayList<String> strCDNames = new ArrayList<String>();

    public U3A4_CDCollection() {

        //Setting the text for the title bar
        super("CD Collection");
        //Setting background colour
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null); // set frame layout

        //Adding and editing the title label
        lblTitle = new JLabel();
        lblTitle.setText("CD Collection");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 36));

        lblTitle.setForeground(Color.WHITE);

        lblTitle.setSize(235, 50);
        lblTitle.setLocation(183, 0);

        add(lblTitle);

        //Editing and adding label that will prompt user for title and artist
        lblTitleAndArtist = new JLabel();
        lblTitleAndArtist.setText("Title - Artist");
        lblTitleAndArtist.setFont(new Font("Arial", Font.PLAIN, 20));

        lblTitleAndArtist.setForeground(Color.WHITE);

        lblTitleAndArtist.setSize(350, 50);
        lblTitleAndArtist.setLocation(15, 50);

        add(lblTitleAndArtist);

        //Editing and adding the text field for your cd        
        txtTitleAndArtist = new JTextField();
        txtTitleAndArtist.setFont(new Font("Arial", Font.PLAIN, 20));

        txtTitleAndArtist.setSize(400, 30);
        txtTitleAndArtist.setLocation(150, 60);

        add(txtTitleAndArtist);

        //Adding and editing the display button
        btnDisplay = new JButton();
        btnDisplay.setText("Display");
        btnDisplay.setSize(90, 30);
        btnDisplay.setLocation(15, 100);
        btnDisplay.setActionCommand("Display");
        btnDisplay.addActionListener(this);

        add(btnDisplay);

        //Adding and editing the initialize button
        btnInitialize = new JButton();
        btnInitialize.setText("Initialize");
        btnInitialize.setSize(90, 30);
        btnInitialize.setLocation(115, 100);
        btnInitialize.setActionCommand("Initialize");
        btnInitialize.addActionListener(this);

        add(btnInitialize);

        //Adding and editing the add button
        btnAdd = new JButton();
        btnAdd.setText("Add");
        btnAdd.setSize(90, 30);
        btnAdd.setLocation(360, 100);
        btnAdd.setActionCommand("Add");
        btnAdd.addActionListener(this);

        add(btnAdd);

        //Adding and editing the remove button
        btnRemove = new JButton();
        btnRemove.setText("Remove");
        btnRemove.setSize(90, 30);
        btnRemove.setLocation(460, 100);
        btnRemove.setActionCommand("Remove");
        btnRemove.addActionListener(this);

        add(btnRemove);

        //Editing and adding text area that will display everything
        txtDisplay = new JTextArea();
        txtDisplay.setText("");
        txtDisplay.setFont(new Font("Arial", Font.PLAIN, 20));

        txtDisplay.setForeground(Color.BLACK);
        txtDisplay.setBackground(Color.WHITE);

        txtDisplay.setSize(525, 500);
        txtDisplay.setLocation(25, 150);

        add(txtDisplay);
        
        //Disabling this buttons to begin with
        btnDisplay.setEnabled(false);
        btnAdd.setEnabled(false);
        btnRemove.setEnabled(false);

    }

    public void actionPerformed(ActionEvent e) {
        
        //Declaring the variable for display
        String strDisplay = "";

        //If the initialize button is clicked
        if (e.getActionCommand().equals("Initialize")) {

                //Adding all the predetermined CDs to the arrayList
            Collections.addAll(strCDNames, "The Roots - Undun", 
                    "John Coltrane - A Love Supreme", "Beatles - Abbey Road",
                    "Kanye West - Late Registration", "Madvillian - Madvilliany");
            
            //Disabling this button
            btnInitialize.setEnabled(false);
            
            //Enabling all the other buttons
            btnDisplay.setEnabled(true);
            btnAdd.setEnabled(true);
            btnRemove.setEnabled(true);

        }
        
        //If the display button is clicked
        if (e.getActionCommand().equals("Display")) {
            
            //For loop to display every index of array
            for (int i = 0; i < strCDNames.size(); i++) {
                
                //If statement to add words "Original Order"
                if (i == 0){
                    strDisplay = strDisplay + "Original Order\n" ;
                }

                strDisplay = strDisplay + "\n" + strCDNames.get(i);

            }
            //Setting the display text
            txtDisplay.setText(strDisplay);

            //Sorting the array list
            Collections.sort(strCDNames);
            
            //For loop to display the arrayList
            for (int i = 0; i < strCDNames.size(); i++) {
                
                //If statement to display the words "Sorted Order"
                if (i == 0){
                    strDisplay = strDisplay + "\n\nSorted Order\n";
                }

                strDisplay = strDisplay + "\n" + strCDNames.get(i);
            }
            
            //Setting the display text
            txtDisplay.setText(strDisplay);
        }
        
        //If the add button is clicked
        if (e.getActionCommand().equals("Add")) {
            
            //Adding the input text to the arrayList
            strCDNames.add(txtTitleAndArtist.getText());

        }
        
        //If the remove button is clicked
        if (e.getActionCommand().equals("Remove")) {
            
            //Declaring the variable for the CD the user wants to remove
            String strCDRemove = "";

            //Assigning the value as the input text
            strCDRemove = (txtTitleAndArtist.getText());
            
            //Finding the index for the removal
            int intRemovalIndex = Collections.binarySearch(strCDNames, strCDRemove);
            
            //If statement to see if it is present in the arrayList
            if (intRemovalIndex >= 0){
                
                //removing the CD
                strCDNames.remove(intRemovalIndex);
                
            }

            else {
                //Printing that the CD is not present
                txtDisplay.setText("This CD is not in your collection");

            }
        }
    }
}