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
 * Title: How to calculate slope
 * Purpose: tell the user how to calculate slope
 */
public class F_HowToCalculateSlope extends JFrame implements ActionListener{
    
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
    JLabel lblImage3;
    ImageIcon slope1 = new ImageIcon("slope1.jpg");
    ImageIcon slope3 = new ImageIcon("slope3.jpg");
    ImageIcon formula = new ImageIcon("formula.jpg");
    
    public F_HowToCalculateSlope(){
        
        //Setting the text for the title bar
        super("How to Calculate Slope");
        //Setting background colour
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null); // set frame layout
        
        //Adding and editing the title label
        lblTitle = new JLabel();
        lblTitle.setText("How to Calculate Slope");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 36));

        lblTitle.setForeground(Color.WHITE);

        lblTitle.setSize(397, 50);
        lblTitle.setLocation(252, 10);

        add(lblTitle);
        
        //Editing and adding label that will be the first explanation
        txtText1 = new JTextArea();
        txtText1.setText("The first way to calculate slope is through the Rise "
                + "and Run method. The method is RISE/RUN. The rise is the change"
                + " vertically for the line. The run is the change horizontally."
                + " The run needs to be measured left to right.");
        txtText1.setFont(new Font("Arial", Font.PLAIN, 20));
        txtText1.setForeground(Color.WHITE);
        txtText1.setSize(800, 400);
        txtText1.setLocation(50, 200);
        txtText1.setLineWrap(true);
        txtText1.setWrapStyleWord(true);
        txtText1.setOpaque(false);

        add(txtText1);
        
        //Editing and adding label that will be a caption
        txtText2 = new JTextArea();
        txtText2.setText("For the this graph the slope would be  RISE/RUN = 4/6 = 1/3.\n");
        txtText2.setFont(new Font("Arial", Font.PLAIN, 20));
        txtText2.setForeground(Color.WHITE);
        txtText2.setSize(314, 400);
        txtText2.setLocation(50, 575);
        txtText2.setLineWrap(true);
        txtText2.setWrapStyleWord(true);
        txtText2.setOpaque(false);

        add(txtText2);
        
        //Editing and adding label that will be the second explanation
        txtText3 = new JTextArea();
        txtText3.setText("The other formula for finding slope is \u0394y/\u0394x."
                + " \u0394 means “change in”. So it is Change in y/Change in x. You "
                + "can get this by looking at the graph, or by 2 given sets of "
                + "coordinates. This formula comes in handy when you are only "
                + "given coordinates, because you don’t need to plot the points "
                + "or look at a graph.");
        txtText3.setFont(new Font("Arial", Font.PLAIN, 20));
        txtText3.setForeground(Color.WHITE);
        txtText3.setSize(450, 400);
        txtText3.setLocation(400, 300);
        txtText3.setLineWrap(true);
        txtText3.setWrapStyleWord(true);
        txtText3.setOpaque(false);

        add(txtText3);
        
        //Editing and adding label that will be the third explanation
        txtText4 = new JTextArea();
        txtText4.setText("When you have a set of coordinates, you input both y "
                + "values at the top and both x values at the bottom. So for the"
                + " coordinates (8,6) and (2,3) it would be 6 - 3/8 - 2, that "
                + "simplifies to 3/6 = 1/2, so the slope is ½. As you can see,"
                + " this method is very useful.");
        txtText4.setFont(new Font("Arial", Font.PLAIN, 20));
        txtText4.setForeground(Color.WHITE);
        txtText4.setSize(450, 400);
        txtText4.setLocation(400, 650);
        txtText4.setLineWrap(true);
        txtText4.setWrapStyleWord(true);
        txtText4.setOpaque(false);

        add(txtText4);
        
        //Adding and editing the first image
        lblImage1 = new JLabel();
        lblImage1.setText("");
        lblImage1.setFont(new Font("Arial", Font.BOLD, 36));
        lblImage1.setIcon(slope1);
        lblImage1.setForeground(Color.WHITE);
        lblImage1.setOpaque(false);
        lblImage1.setSize(314, 248);
        lblImage1.setLocation(50, 300);

        add(lblImage1);
        
        //Adding and editing the second image
        lblImage2 = new JLabel();
        lblImage2.setText("");
        lblImage2.setFont(new Font("Arial", Font.BOLD, 36));
        lblImage2.setIcon(formula);
        lblImage2.setForeground(Color.WHITE);
        lblImage2.setOpaque(false);
        lblImage2.setSize(453, 89);
        lblImage2.setLocation(400, 500);

        add(lblImage2);
        
        //Adding and editing the third image
        lblImage3 = new JLabel();
        lblImage3.setText("");
        lblImage3.setFont(new Font("Arial", Font.BOLD, 36));
        lblImage3.setIcon(slope3);
        lblImage3.setForeground(Color.WHITE);
        lblImage3.setOpaque(true);
        lblImage3.setSize(270, 175);
        lblImage3.setLocation(50, 650);

        add(lblImage3);
        
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
            
            //Opening the previous frame
            E_WhatIsSlope myFrame = new E_WhatIsSlope();
            myFrame.setSize( 900, 900 );
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame.setVisible(true);
            
            //Closing this frame
            this.dispose();
            
        }
        
        if (e.getActionCommand().equals("MainMenu")) {
            
            //Opening the main menu
            A_Menu myFrame = new A_Menu();
            myFrame.setSize( 900, 900 );
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame.setVisible(true);
            
            //Closing this frame
            this.dispose();
            
        }
        
        if (e.getActionCommand().equals("Next")) {
            
            //Opening the next frame
            G_EquationOfALine myFrame = new G_EquationOfALine();
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
