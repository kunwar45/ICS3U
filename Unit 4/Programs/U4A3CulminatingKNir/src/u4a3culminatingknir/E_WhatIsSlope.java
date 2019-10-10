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
 * Title: What is Slope?
 * Purpose: To tell the user what slope is 
 */
public class E_WhatIsSlope extends JFrame implements ActionListener{
    
    //Adding and declaring variables so that lables, textfields etc. are existent
    JLabel lblTitle;
    JButton btnBack;
    JButton btnMainMenu;
    JButton btnNext;
    JButton btnEndSession;
    JTextArea txtText1;
    JTextArea txtText2;
    JLabel lblImage1;
    JLabel lblImage2;
    ImageIcon riseRun1 = new ImageIcon("riseRun.jpg");
    ImageIcon riseRun2 = new ImageIcon("riseRun2.jpg");

    
    public E_WhatIsSlope(){
        
        //Setting the text for the title bar
        super("What is Slope");
        //Setting background colour
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null); // set frame layout
        
        //Adding and editing the title label
        lblTitle = new JLabel();
        lblTitle.setText("What is Slope?");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 36));

        lblTitle.setForeground(Color.WHITE);

        lblTitle.setSize(256, 50);
        lblTitle.setLocation(322, 10);

        add(lblTitle);
        
        //Editing and adding label that will be a main explanation
        txtText1 = new JTextArea();
        txtText1.setText("In math, slope is the relation between two points on "
                + "a line. ");
        txtText1.setFont(new Font("Arial", Font.BOLD, 20));
        txtText1.setForeground(Color.WHITE);
        txtText1.setSize(700, 400);
        txtText1.setLocation(50, 200);
        txtText1.setLineWrap(true);
        txtText1.setWrapStyleWord(true);
        txtText1.setOpaque(false);

        add(txtText1);
        
        //Editing and adding label that will be the second explanation
        txtText2 = new JTextArea();
        txtText2.setText("Slope is very similar to the rate of change. If the "
                + "line has a rate of change of 5/2, the slope is also 5/2. There"
                + " are 2 common ways to calculate slope, I will go over both, "
                + "you may use whichever you are most comfortable with.");
        txtText2.setFont(new Font("Arial", Font.PLAIN, 20));
        txtText2.setForeground(Color.WHITE);
        txtText2.setSize(800, 400);
        txtText2.setLocation(50, 725);
        txtText2.setLineWrap(true);
        txtText2.setWrapStyleWord(true);
        txtText2.setOpaque(false);

        add(txtText2);
        
        //Adding and editing the first image
        lblImage1 = new JLabel();
        lblImage1.setText("");
        lblImage1.setFont(new Font("Arial", Font.BOLD, 36));
        lblImage1.setIcon(riseRun1);
        lblImage1.setForeground(Color.WHITE);
        lblImage1.setOpaque(false);
        lblImage1.setSize(366, 320);
        lblImage1.setLocation(50, 300);

        add(lblImage1);
        
        //Adding and editing the second image
        lblImage2 = new JLabel();
        lblImage2.setText("");
        lblImage2.setFont(new Font("Arial", Font.BOLD, 36));
        lblImage2.setIcon(riseRun2);
        lblImage2.setForeground(Color.WHITE);
        lblImage2.setOpaque(false);
        lblImage2.setSize(453, 357);
        lblImage2.setLocation(425, 300);

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
            D_DirectAndPartialVariation myFrame = new D_DirectAndPartialVariation();
            myFrame.setSize( 900, 900 );
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame.setVisible(true);
            
            //Closing this frame
            this.dispose();
            
        }
        
        if (e.getActionCommand().equals("MainMenu")) {
            
            //Opening main menu
            A_Menu myFrame = new A_Menu();
            myFrame.setSize( 900, 900 );
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame.setVisible(true);
            
            //Closing this frame
            this.dispose();
            
        }
        
        if (e.getActionCommand().equals("Next")) {
            
            //Opening next slide
            F_HowToCalculateSlope myFrame = new F_HowToCalculateSlope();
            myFrame.setSize( 900, 900 );
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame.setVisible(true);
            
            //Closing this frame
            this.dispose();
            
        }
        
        if (e.getActionCommand().equals("EndSession")) {
            
            //Closing program
            System.exit(0);
        }
        
    }
    
}
