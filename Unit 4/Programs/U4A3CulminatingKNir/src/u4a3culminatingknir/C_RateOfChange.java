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
 * Title: Rate of Change
 * Purpose: To tell the user what rate of change is and how to get it
 */
public class C_RateOfChange extends JFrame implements ActionListener{
    
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
    JTextArea txtText5;
    JLabel lblImage1;
    JLabel lblImage2;
    ImageIcon positiveLine = new ImageIcon("PositiveLine.jpg");
    ImageIcon negativeLine = new ImageIcon("NegativeLine.jpg");

    
    public C_RateOfChange(){
        
        //Setting the text for the title bar
        super("Rate of Change");
        //Setting background colour
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null); // set frame layout
        
        //Adding and editing the title label
        lblTitle = new JLabel();
        lblTitle.setText("Rate of Change");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 36));

        lblTitle.setForeground(Color.WHITE);

        lblTitle.setSize(265, 50);
        lblTitle.setLocation(318, 10);

        add(lblTitle);
        
        //Editing and adding label that will display the main message
        txtText1 = new JTextArea();
        txtText1.setText("Rate of change, in mathematics describes the average "
                + "change over a measured unit. It is how one quantity changes "
                + "in relation to another quantity. One common everyday thing "
                + "that you see that uses rate of change are speed signs. A "
                + "speed might say “60km/h” that means, on that road, you can "
                + "go (or change) 60 kilometers every hour. ");
        txtText1.setFont(new Font("Arial", Font.PLAIN, 20));
        txtText1.setForeground(Color.WHITE);
        txtText1.setSize(700, 400);
        txtText1.setLocation(50, 200);
        txtText1.setLineWrap(true);
        txtText1.setWrapStyleWord(true);
        txtText1.setOpaque(false);

        add(txtText1);
        
        //Editing and adding label that will display a quick example
        txtText2 = new JTextArea();
        txtText2.setText("Think about a car, now let's say the car travelled 100km"
                + " in 2 hours This means the rate of change is 100/2, if we "
                + "simplify this fraction, we get 50/1, or just simply 50. ");
        txtText2.setFont(new Font("Arial", Font.PLAIN, 20));
        txtText2.setForeground(Color.WHITE);
        txtText2.setSize(700, 400);
        txtText2.setLocation(50, 350);
        txtText2.setLineWrap(true);
        txtText2.setWrapStyleWord(true);
        txtText2.setOpaque(false);

        add(txtText2);
        
        //Editing and adding label that will display a secondary message
        txtText3 = new JTextArea();
        txtText3.setText("Rate of change can also be classified as negative or "
                + "positive. From left to right, if the line is moving upwards,"
                + " it’s positive. From left to right, if the line is moving "
                + "downwards, it’s negative.");
        txtText3.setFont(new Font("Arial", Font.PLAIN, 20));
        txtText3.setForeground(Color.WHITE);
        txtText3.setSize(250, 400);
        txtText3.setLocation(300, 500);
        txtText3.setLineWrap(true);
        txtText3.setWrapStyleWord(true);
        txtText3.setOpaque(false);

        add(txtText3);
        
         //Editing and adding label that will be the first caption
        txtText4 = new JTextArea();
        txtText4.setText("This is Positive");
        txtText4.setFont(new Font("Arial", Font.PLAIN, 20));
        txtText4.setForeground(Color.WHITE);
        txtText4.setSize(200, 50);
        txtText4.setLocation(75, 725);
        txtText4.setLineWrap(true);
        txtText4.setWrapStyleWord(true);
        txtText4.setOpaque(false);

        add(txtText4);
        
        //Editing and adding label that will be the second caption
        txtText5 = new JTextArea();
        txtText5.setText("This is Negative");
        txtText5.setFont(new Font("Arial", Font.PLAIN, 20));
        txtText5.setForeground(Color.WHITE);
        txtText5.setSize(200, 50);
        txtText5.setLocation(625, 725);
        txtText5.setLineWrap(true);
        txtText5.setWrapStyleWord(true);
        txtText5.setOpaque(false);

        add(txtText5);
        
        //Adding and editing the first image
        lblImage1 = new JLabel();
        lblImage1.setText("");
        lblImage1.setFont(new Font("Arial", Font.BOLD, 36));
        lblImage1.setIcon(positiveLine);
        lblImage1.setForeground(Color.WHITE);
        lblImage1.setOpaque(true);
        lblImage1.setSize(200, 200);
        lblImage1.setLocation(50, 500);

        add(lblImage1);
        
        //Adding and editing the second image
        lblImage2 = new JLabel();
        lblImage2.setText("");
        lblImage2.setFont(new Font("Arial", Font.BOLD, 36));
        lblImage2.setIcon(negativeLine);
        lblImage2.setForeground(Color.WHITE);
        lblImage2.setOpaque(true);
        lblImage2.setSize(200, 200);
        lblImage2.setLocation(600, 500);

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
            B_IntroPage myFrame = new B_IntroPage();
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
            D_DirectAndPartialVariation myFrame = new D_DirectAndPartialVariation();
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
