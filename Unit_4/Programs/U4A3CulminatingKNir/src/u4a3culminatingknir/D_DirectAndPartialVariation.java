package u4a3culminatingknir;

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
 * 13-08-2019
 * Title: Direct and Partial Variation
 * Purpose: To explain what direct and partial variation is how to get it
 */
public class D_DirectAndPartialVariation extends JFrame implements ActionListener{
    
    //Adding and declaring variables so that lables, textfields etc. are existent
    JLabel lblTitle;
    JButton btnBack;
    JButton btnMainMenu;
    JButton btnNext;
    JButton btnEndSession;
    JTextArea txtText1;
    JTextArea txtText2;
    JTextArea txtText3;
    JTextArea txtText4;
    JLabel lblImage1;
    JLabel lblImage2;
    ImageIcon directVariation = new ImageIcon("directVariation.jpg");
    ImageIcon partialVariation = new ImageIcon ("partialVariation.jpg");
    
    public D_DirectAndPartialVariation(){
        
        //Setting the text for the title bar
        super("Direct & Partial Variation");
        //Setting background colour
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null); // set frame layout
        
        //Adding and editing the title label
        lblTitle = new JLabel();
        lblTitle.setText("Direct & Partial Variation");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 36));

        lblTitle.setForeground(Color.WHITE);

        lblTitle.setSize(420, 50);
        lblTitle.setLocation(240, 10);

        add(lblTitle);
        
        //Editing and adding label that will be the primary explanation
        txtText1 = new JTextArea();
        txtText1.setText("All linear relations are either direct or partial "
                + "variation. Direct variation means that the line passes "
                + "through the origin. Partial variations means that the line "
                + "does not pass through the origin, it is either over or under."
                + " In other words, when x = 0, if y is also 0, it is direct. "
                + "If y is not 0, it is partial variation. The equation of a line"
                + " for a line with direct variation is y = mx, for partial it is "
                + "y = mx + b." );
        txtText1.setFont(new Font("Arial", Font.PLAIN, 20));
        txtText1.setForeground(Color.WHITE);
        txtText1.setSize(700, 400);
        txtText1.setLocation(50, 200);
        txtText1.setLineWrap(true);
        txtText1.setWrapStyleWord(true);
        txtText1.setOpaque(false);

        add(txtText1);
        
        //Editing and adding the first caption
        txtText2 = new JTextArea();
        txtText2.setText("As we see, x = 0 and y  = 0, so it is a direct variation.");
        txtText2.setFont(new Font("Arial", Font.PLAIN, 20));
        txtText2.setForeground(Color.WHITE);
        txtText2.setSize(242, 400);
        txtText2.setLocation(50, 650);
        txtText2.setLineWrap(true);
        txtText2.setWrapStyleWord(true);
        txtText2.setOpaque(false);

        add(txtText2);
        
        //Editing and adding the label that show a secondary message
        txtText2 = new JTextArea();
        txtText2.setText("y = mx + b" + "\nmeans Direct Variation.\n" + "\ny = mx" +
                "\nmeans Partial Variation.");
        txtText2.setFont(new Font("Arial", Font.PLAIN, 20));
        txtText2.setForeground(Color.WHITE);
        txtText2.setSize(220, 400);
        txtText2.setLocation(340, 400);
        txtText2.setLineWrap(true);
        txtText2.setWrapStyleWord(true);
        txtText2.setOpaque(false);

        add(txtText2);
        
        //Editing and adding the seccond caption
        txtText3 = new JTextArea();
        txtText3.setText("Here when x = 0, y = 5 so it is partial variation.");
        txtText3.setFont(new Font("Arial", Font.PLAIN, 20));
        txtText3.setForeground(Color.WHITE);
        txtText3.setSize(223, 400);
        txtText3.setLocation(605, 650);
        txtText3.setLineWrap(true);
        txtText3.setWrapStyleWord(true);
        txtText3.setOpaque(false);

        add(txtText3);
        
        //Adding and editing the first image
        lblImage1 = new JLabel();
        lblImage1.setText("");
        lblImage1.setFont(new Font("Arial", Font.BOLD, 36));
        lblImage1.setIcon(directVariation);
        lblImage1.setForeground(Color.WHITE);
        lblImage1.setOpaque(false);
        lblImage1.setSize(242, 275);
        lblImage1.setLocation(50, 350);

        add(lblImage1);
        
        //Adding and editing the second image
        lblImage2 = new JLabel();
        lblImage2.setText("");
        lblImage2.setFont(new Font("Arial", Font.BOLD, 36));
        lblImage2.setIcon(partialVariation);
        lblImage2.setForeground(Color.WHITE);
        lblImage2.setOpaque(false);
        lblImage2.setSize(223, 259);
        lblImage2.setLocation(600, 350);

        add(lblImage2);
        
        //Adding and editing the back button
        btnBack = new JButton();
        btnBack.setText("Back");
        btnBack.setSize(150, 40);
        btnBack.setLocation(50, 100);
        btnBack.setBackground(Color.RED);
        btnBack.setActionCommand("Back");
        btnBack.addActionListener(this);

        add(btnBack);
        
        //Adding and editing the main menu button
        btnMainMenu = new JButton();
        btnMainMenu.setText("Main Menu");
        btnMainMenu.setSize(150, 40);
        btnMainMenu.setLocation(375, 100);
        btnMainMenu.setBackground(Color.RED);
        btnMainMenu.setActionCommand("MainMenu");
        btnMainMenu.addActionListener(this);

        add(btnMainMenu);
        
        //Adding and editing the next button
        btnNext = new JButton();
        btnNext.setText("Next");
        btnNext.setSize(150, 40);
        btnNext.setLocation(700, 100);
        btnNext.setBackground(Color.RED);
        btnNext.setActionCommand("Next");
        btnNext.addActionListener(this);

        add(btnNext);
        
        //Adding and editing the End Session button
        btnEndSession = new JButton();
        btnEndSession.setText("End Session");
        btnEndSession.setSize(150, 40);
        btnEndSession.setLocation(700, 800);
        btnEndSession.setBackground(Color.RED);
        btnEndSession.setActionCommand("EndSession");
        btnEndSession.addActionListener(this);

        add(btnEndSession);
        
        
    }
    
    public void actionPerformed(ActionEvent e) {
        
        if (e.getActionCommand().equals("Back")) {
           
            //Opening previous frame
            C_RateOfChange myFrame = new C_RateOfChange();
            myFrame.setSize( 900, 900 );
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame.setVisible(true);
            
            //Closing this frame
            this.dispose();
                       
        }
        
        if (e.getActionCommand().equals("MainMenu")) {
            
            //Opeining main menu
            A_Menu myFrame = new A_Menu();
            myFrame.setSize( 900, 900 );
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame.setVisible(true);
            
            //Closing this frame
            this.dispose();
            
        }
        
        if (e.getActionCommand().equals("Next")) {
            
            //Opening next frame
            E_WhatIsSlope myFrame = new E_WhatIsSlope();
            myFrame.setSize( 900, 900 );
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame.setVisible(true);
            
            //Closing this frame
            this.dispose();
            
        }
        
        if (e.getActionCommand().equals("EndSession")) {
            
            //Closing the program
            System.exit(0);
        }
        
    }
    
}
