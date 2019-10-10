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
 * Title: Equation of a Line
 * Purpose: To explain equation of a line and how to get  the equation of line for any line
 */
public class G_EquationOfALine extends JFrame implements ActionListener{
    
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
    ImageIcon equation = new ImageIcon("EquationOfALine.jpg");
    ImageIcon calculation = new ImageIcon("calculation.jpg");

    
    public G_EquationOfALine(){
        
        //Setting the text for the title bar
        super("Equation of a Line");
        //Setting background colour
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null); // set frame layout
        
        //Adding and editing the title label
        lblTitle = new JLabel();
        lblTitle.setText("Equation of a Line");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 36));

        lblTitle.setForeground(Color.WHITE);

        lblTitle.setSize(310, 50);
        lblTitle.setLocation(295, 10);

        add(lblTitle);
        
        //Editing and adding label that will be the main explanation
        txtText1 = new JTextArea();
        txtText1.setText("As stated, the most common equation y = mx + b, where "
                + "m is the slope and b is the y-intercept. To put a line into "
                + "this form, you just need to input the slope (which we learned"
                + " how to do) and the y-intercept. To find the y-intercept on a"
                + " graph, you just need to see where the line crosses the y-axis.");
        txtText1.setFont(new Font("Arial", Font.PLAIN, 20));
        txtText1.setForeground(Color.WHITE);
        txtText1.setSize(375, 400);
        txtText1.setLocation(50, 150);
        txtText1.setLineWrap(true);
        txtText1.setWrapStyleWord(true);
        txtText1.setOpaque(false);

        add(txtText1);
        
        //Editing and adding label that will show the second method
        txtText2 = new JTextArea();
        txtText2.setText("But what if you have the slope of the line and one set"
                + " of coordinates but not the graph, well there is a way to "
                + "find the y-intercept for that too. If the slope is 2, and "
                + "you have the coordinates (3, 4), you rearrange the equation "
                + "of the line to solve for b.");
        txtText2.setFont(new Font("Arial", Font.PLAIN, 20));
        txtText2.setForeground(Color.WHITE);
        txtText2.setSize(375, 400);
        txtText2.setLocation(500, 150);
        txtText2.setLineWrap(true);
        txtText2.setWrapStyleWord(true);
        txtText2.setOpaque(false);

        add(txtText2);
        
        //Editing and adding label that will be a secondary message that tells an exception
        txtText3 = new JTextArea();
        txtText3.setText("If the line is a direct variation, then the y-intercept"
                + " (b) will be 0, so opposed to writing “+0”, we just write y = mx. ");
        txtText3.setFont(new Font("Arial", Font.PLAIN, 20));
        txtText3.setForeground(Color.WHITE);
        txtText3.setSize(400, 400);
        txtText3.setLocation(50, 400);
        txtText3.setLineWrap(true);
        txtText3.setWrapStyleWord(true);
        txtText3.setOpaque(false);

        add(txtText3);
        
        //Editing and adding label that will be the final message
        txtText4 = new JTextArea();
        txtText4.setText("To find the equation of a line, find the slope and "
                + "y-intercept and substitute the values.");
        txtText4.setFont(new Font("Arial", Font.PLAIN, 20));
        txtText4.setForeground(Color.WHITE);
        txtText4.setSize(375, 400);
        txtText4.setLocation(50, 700);
        txtText4.setLineWrap(true);
        txtText4.setWrapStyleWord(true);
        txtText4.setOpaque(false);

        add(txtText4);
        
        //Adding and editing the first image
        lblImage1 = new JLabel();
        lblImage1.setText("");
        lblImage1.setFont(new Font("Arial", Font.BOLD, 36));
        lblImage1.setIcon(equation);
        lblImage1.setForeground(Color.WHITE);
        lblImage1.setOpaque(true);
        lblImage1.setSize(247, 74);
        lblImage1.setLocation(50, 550);

        add(lblImage1);
        
        //Adding and editing the second image that is the process of the calculation
        lblImage2 = new JLabel();
        lblImage2.setText("");
        lblImage2.setFont(new Font("Arial", Font.BOLD, 36));
        lblImage2.setIcon(calculation);
        lblImage2.setForeground(Color.WHITE);
        lblImage2.setOpaque(true);
        lblImage2.setSize(307, 456);
        lblImage2.setLocation(525, 330);

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
            F_HowToCalculateSlope myFrame = new F_HowToCalculateSlope();
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
            PracticeQuestions myFrame = new PracticeQuestions();
            myFrame.setSize( 900, 900 );
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame.setVisible(true);
            
            //Closing this frame
            this.dispose();
            
        }
        
        if (e.getActionCommand().equals("EndSession")) {
            
            //Closing this frame
            System.exit(0);
        }
        
    }
    
}
