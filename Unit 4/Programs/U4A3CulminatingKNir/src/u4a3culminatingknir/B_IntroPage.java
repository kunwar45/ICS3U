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
 * Title: Intro Page
 * Purpose: This will be the introduction page
 */
public class B_IntroPage extends JFrame implements ActionListener{
    
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
    ImageIcon line1 = new ImageIcon("Intro_Line1.jpg");
    ImageIcon line2 = new ImageIcon("Intro_Line2.jpg");
    
    
    public B_IntroPage(){
        
        //Setting the text for the title bar
        super("Introduction");
        //Setting background colour
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null); // set frame layout
        
        //Adding and editing the title label
        lblTitle = new JLabel();
        lblTitle.setText("Intro to Linear Equations");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 36));

        lblTitle.setForeground(Color.WHITE);

        lblTitle.setSize(420, 50);
        lblTitle.setLocation(240, 10);

        add(lblTitle);
        
        //Editing and adding label that will display the main explanation
        txtText1 = new JTextArea();
        txtText1.setText("Linear Equations are not as daunting as they may seem."
                + " They are simply equations formed by two numbers that create "
                + "a straight line when plotted on a graph. For example, the "
                + "linear equation: y = 2x + 1, means that the y value for any "
                + "x value will be x times 2 plus 1. y = 2x + 1, 5x = 6 + 3y and"
                + " y/2 = 3 - x are all linear equations. Variables in linear "
                + "equations cannot have roots or exponents. For example, "
                + "y2 − 2 = 0 and 3√x − y = 6 are not linear equations. This is"
                + " because, when plotted these will not render straight (linear)"
                + " lines. The most common form for linear equations to be "
                + "written in is the slope-intercept form, y = mx + b. “m” is "
                + "equal to the slope (or gradient) which we will get further "
                + "into and “b” is the y-intercept");
        txtText1.setFont(new Font("Arial", Font.PLAIN, 20));
        txtText1.setForeground(Color.WHITE);
        txtText1.setSize(700, 400);
        txtText1.setLocation(50, 200);
        txtText1.setLineWrap(true);
        txtText1.setWrapStyleWord(true);
        txtText1.setOpaque(false);

        add(txtText1);
        
        //Editing and adding label that will display a secondary message
        txtText2 = new JTextArea();
        txtText2.setText("We will get further into slope and y-intercept later "
                + "in this lesson. You don't need to worry about those right now.");
        txtText2.setFont(new Font("Arial", Font.PLAIN, 20));
        txtText2.setForeground(Color.WHITE);
        txtText2.setSize(250, 200);
        txtText2.setLocation(300, 600);
        txtText2.setLineWrap(true);
        txtText2.setWrapStyleWord(true);
        txtText2.setOpaque(false);

        add(txtText2);
        
        //Adding and editing the first image
        lblImage1 = new JLabel();
        lblImage1.setText("");
        lblImage1.setFont(new Font("Arial", Font.BOLD, 36));
        lblImage1.setIcon(line1);
        lblImage1.setForeground(Color.WHITE);
        lblImage1.setOpaque(true);
        lblImage1.setSize(183, 241);
        lblImage1.setLocation(600, 500);

        add(lblImage1);
        
        //Adding and editing the second image
        lblImage2 = new JLabel();
        lblImage2.setText("");
        lblImage2.setFont(new Font("Arial", Font.BOLD, 36));
        lblImage2.setIcon(line2);
        lblImage2.setForeground(Color.WHITE);
        lblImage2.setOpaque(true);
        lblImage2.setSize(216, 247);
        lblImage2.setLocation(50, 500);

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
            A_Menu myFrame = new A_Menu();
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
            
            //Opening next frame
            C_RateOfChange myFrame = new C_RateOfChange();
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
