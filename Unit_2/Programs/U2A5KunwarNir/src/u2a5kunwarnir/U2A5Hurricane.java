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
 * 26-07-2019
 * Title: Hurricane Scale
 * Purpose: To tell you the types of Hurricane categories
 */

public class U2A5Hurricane extends JFrame implements ActionListener {
    
    //Adding and declaring variables so that lables, textfields etc. are existent
    JLabel lblTitle;
    JLabel lblHurricane;
    JLabel lblHurricaneCategory;
    JLabel lblWindSpeed;
    JTextField txtCategory;
    JButton btnCalculate;
    
     public U2A5Hurricane () {
        
        //Setting the text for the title bar
        super ("Hurricane Scale");
        //Setting background colour
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null); // set frame layout
        
        //Adding and editing the title label
        lblTitle = new JLabel();
        lblTitle.setText("Hurricane Scale");
        lblTitle.setFont(new Font ("Arial", Font.BOLD, 36));
              
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBackground(Color.yellow);
        
        lblTitle.setSize(275, 50);
        lblTitle.setLocation(113, 0);
                
        add(lblTitle);
        
        //Editing and adding label that will ask for your purchases
        lblHurricane = new JLabel();
        lblHurricane.setText("Enter a Hurricane Category (1-5):");
        lblHurricane.setFont(new Font ("Arial", Font.BOLD, 20));
              
        lblHurricane.setForeground(Color.WHITE);
        lblHurricane.setBackground(Color.yellow);
        
        lblHurricane.setSize(350, 50);
        lblHurricane.setLocation(25, 100);
                
        add(lblHurricane);
                
        //Editing and adding the text field for purchases        
        txtCategory = new JTextField();
        txtCategory.setFont(new Font ("Arial", Font.BOLD, 20));
        
        txtCategory.setSize(120, 30);
        txtCategory.setLocation(350, 110);
                
        add(txtCategory);
        
        //Adding and editing the button
        btnCalculate = new JButton();
        btnCalculate.setText("ENTER");
        btnCalculate.setSize(90, 30);
        btnCalculate.setLocation(355, 180);
        btnCalculate.setActionCommand("ENTER");
        btnCalculate.addActionListener(this);
        
        add(btnCalculate);
        
        //Editing and adding label that will display discount
        lblHurricaneCategory = new JLabel();
        lblHurricaneCategory.setText(" ");
        lblHurricaneCategory.setFont(new Font ("Arial", Font.BOLD, 20));
              
        lblHurricaneCategory.setForeground(Color.WHITE);
        lblHurricaneCategory.setBackground(Color.yellow);
        
        lblHurricaneCategory.setSize(450, 50);
        lblHurricaneCategory.setLocation(25, 250);
                
        add(lblHurricaneCategory);
        
        //Editing and adding label that will dsiplay discounted price
        lblWindSpeed = new JLabel();
        lblWindSpeed.setText(" ");
        lblWindSpeed.setFont(new Font ("Arial", Font.BOLD, 20));
              
        lblWindSpeed.setForeground(Color.WHITE);
        lblWindSpeed.setBackground(Color.yellow);
        
        lblWindSpeed.setSize(450, 50);
        lblWindSpeed.setLocation(25, 300);
                        
        add(lblWindSpeed);
    
    }
    public void actionPerformed (ActionEvent e){
        
        if(e.getActionCommand().equals("ENTER")){
            
            //Declaring Variables
            int intCategory;
            //Assigning value for variable
            intCategory = Integer.parseInt(txtCategory.getText());
            
            //Switch Case for hurricane categories
            switch (intCategory) {
                case 1:
                    lblHurricaneCategory.setText("Windspeeds for Category 1 are:");
                    lblWindSpeed.setText("74-95 mph or 64-82 kt or 119-153 km/hr");
                    break;
                case 2:
                    lblHurricaneCategory.setText("Windspeeds for Category 2 are:");
                    lblWindSpeed.setText("96-110 mph or 83-95 kt or 154-177 km/hr");
                    break;
                case 3:
                    lblHurricaneCategory.setText("Windspeeds for Category 3 are:");
                    lblWindSpeed.setText("111-130 mph or 96-113 kt or 178-209 km/hr");
                    break;
                case 4:
                    lblHurricaneCategory.setText("Windspeeds for Category 4 are:");
                    lblWindSpeed.setText("131-155 mph or 114-135 kt or 210-249 km/hr");
                    break;
                case 5:
                    lblHurricaneCategory.setText("Windspeeds for Category 5 are:");
                    lblWindSpeed.setText("greater than 155 mph or 135 kt or 249 km/hr");
                    break;
                default:
                    lblHurricaneCategory.setText("Please enter a valid Hurricane Category");
                    lblWindSpeed.setText(" ");
                    break;                    
            }
            
        }
        
    }
    
}
