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
 * Title: Practice Question Solutions
 * Purpose: To show the correct answers for the practice questions
 */
public class PracticeQuestions_Solutions extends JFrame implements ActionListener{
    
    //Adding and declaring variables so that lables, textfields etc. are existent
    JLabel lblTitle;
    JButton btnBack;
    JButton btnMainMenu;
    JButton btnNext;
    JButton btnEndSession;
    JLabel lblSubtitle1;
    JLabel lblSubtitle2;
    JLabel lblSubtitle3;
    JLabel lblSubtitle4;
    JLabel lblSubtitle5;
    JTextArea txtQuestion1;
    JTextArea txtQuestion2;
    JTextArea txtQuestion3;
    JTextArea txtQuestion4;
    JTextArea txtQuestion5;
    JTextArea txtQuestion6;
    JTextField txtAnswer1;
    JTextField txtAnswer2;
    JTextField txtAnswer3;
    JTextField txtAnswer4;
    JTextField txtAnswer5;
    JTextField txtAnswer6;
    
    public PracticeQuestions_Solutions(){
        
        //Setting the text for the title bar
        super("Solutions - Practice Questions");
        //Setting background colour
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null); // set frame layout
        
        //Adding and editing the title label
        lblTitle = new JLabel();
        lblTitle.setText("Practice Questions - Solutions");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 36));

        lblTitle.setForeground(Color.WHITE);

        lblTitle.setSize(512, 50);
        lblTitle.setLocation(194, 10);

        add(lblTitle);
        
        //Editing and adding label that will be subtitle
        lblSubtitle1 = new JLabel();
        lblSubtitle1.setText("Direct or Partial Variation?:");
        lblSubtitle1.setFont(new Font("Arial", Font.BOLD, 20));

        lblSubtitle1.setForeground(Color.WHITE);

        lblSubtitle1.setSize(350, 50);
        lblSubtitle1.setLocation(25, 150);

        add(lblSubtitle1);
        
        //Editing and adding label that will be subtitle
        lblSubtitle2 = new JLabel();
        lblSubtitle2.setText("Calculate Rate of Change: ");
        lblSubtitle2.setFont(new Font("Arial", Font.BOLD, 20));

        lblSubtitle2.setForeground(Color.WHITE);

        lblSubtitle2.setSize(350, 50);
        lblSubtitle2.setLocation(25, 250);

        add(lblSubtitle2);
        
        //Editing and adding label that will be subtitle
        lblSubtitle3 = new JLabel();
        lblSubtitle3.setText("Find the Y-Intercept: ");
        lblSubtitle3.setFont(new Font("Arial", Font.BOLD, 20));

        lblSubtitle3.setForeground(Color.WHITE);

        lblSubtitle3.setSize(350, 50);
        lblSubtitle3.setLocation(25, 375);

        add(lblSubtitle3);
        
        //Editing and adding label that will be subtitle
        lblSubtitle4 = new JLabel();
        lblSubtitle4.setText("Calculate the Slope:");
        lblSubtitle4.setFont(new Font("Arial", Font.BOLD, 20));

        lblSubtitle4.setForeground(Color.WHITE);

        lblSubtitle4.setSize(350, 50);
        lblSubtitle4.setLocation(25, 500);

        add(lblSubtitle4);
        
        //Editing and adding label that will be subtitle
        lblSubtitle5 = new JLabel();
        lblSubtitle5.setText("Write the Equation of this Line (y = mx + b):");
        lblSubtitle5.setFont(new Font("Arial", Font.BOLD, 20));

        lblSubtitle5.setForeground(Color.WHITE);

        lblSubtitle5.setSize(500, 50);
        lblSubtitle5.setLocation(25, 650);

        add(lblSubtitle5);
        
        
        //Editing and adding text area that will be a question
        txtQuestion1 = new JTextArea();
        txtQuestion1.setText("y = 4x + 3");
        txtQuestion1.setFont(new Font("Arial", Font.PLAIN, 20));

        txtQuestion1.setForeground(Color.WHITE);

        txtQuestion1.setSize(350, 50);
        txtQuestion1.setLocation(375, 150);
        txtQuestion1.setLineWrap(true);
        txtQuestion1.setWrapStyleWord(true);
        txtQuestion1.setOpaque(false);

        add(txtQuestion1);
        
        //Editing and adding text area that will be a question
        txtQuestion2 = new JTextArea();
        txtQuestion2.setText("y = 6x");
        txtQuestion2.setFont(new Font("Arial", Font.PLAIN, 20));

        txtQuestion2.setForeground(Color.WHITE);

        txtQuestion2.setSize(350, 50);
        txtQuestion2.setLocation(650, 150);
        txtQuestion2.setLineWrap(true);
        txtQuestion2.setWrapStyleWord(true);
        txtQuestion2.setOpaque(false);

        add(txtQuestion2);
        
        //Editing and adding text area that will be a question
        txtQuestion3 = new JTextArea();
        txtQuestion3.setText("A car left at 6:00pm, at 8:30pm it reached it's destination 225km" +"\n" + "away."
                + " What is the cars rate of change?");
        txtQuestion3.setFont(new Font("Arial", Font.PLAIN, 20));

        txtQuestion3.setForeground(Color.WHITE);

        txtQuestion3.setSize(600, 100);
        txtQuestion3.setLocation(50, 300);
        txtQuestion3.setLineWrap(true);
        txtQuestion3.setWrapStyleWord(true);
        txtQuestion3.setOpaque(false);

        add(txtQuestion3);
        
        //Editing and adding text area that will be a question
        txtQuestion4 = new JTextArea();
        txtQuestion4.setText("With a slope of 2, and a point of (7, 2)");
        txtQuestion4.setFont(new Font("Arial", Font.PLAIN, 20));

        txtQuestion4.setForeground(Color.WHITE);

        txtQuestion4.setSize(600, 100);
        txtQuestion4.setLocation(50, 425);
        txtQuestion4.setLineWrap(true);
        txtQuestion4.setWrapStyleWord(true);
        txtQuestion4.setOpaque(false);

        add(txtQuestion4);
        
        //Editing and adding text area that will be a question
        txtQuestion5 = new JTextArea();
        txtQuestion5.setText("Given these 2 points, calculate slope: (6, 8) and (12, 10)");
        txtQuestion5.setFont(new Font("Arial", Font.PLAIN, 20));

        txtQuestion5.setForeground(Color.WHITE);

        txtQuestion5.setSize(600, 100);
        txtQuestion5.setLocation(50, 550);
        txtQuestion5.setLineWrap(true);
        txtQuestion5.setWrapStyleWord(true);
        txtQuestion5.setOpaque(false);

        add(txtQuestion5);
        
        //Editing and adding text area that will be a question
        txtQuestion6 = new JTextArea();
        txtQuestion6.setText("The y-intercept is 4 and these are two points (2, 5) and (6, 7) what is the equation of the line? (Write with no spaces)");
        txtQuestion6.setFont(new Font("Arial", Font.PLAIN, 20));

        txtQuestion6.setForeground(Color.WHITE);

        txtQuestion6.setSize(600, 100);
        txtQuestion6.setLocation(50, 700);
        txtQuestion6.setLineWrap(true);
        txtQuestion6.setWrapStyleWord(true);
        txtQuestion6.setOpaque(false);

        add(txtQuestion6);
        
        //Editing and adding the text field to display answer       
        txtAnswer1 = new JTextField();
        txtAnswer1.setFont(new Font("Arial", Font.PLAIN, 20));
        txtAnswer1.setText("Partial");

        txtAnswer1.setSize(150, 30);
        txtAnswer1.setLocation(375, 200);

        add(txtAnswer1);
        
        //Editing and adding the text field to display answer      
        txtAnswer2 = new JTextField();
        txtAnswer2.setFont(new Font("Arial", Font.PLAIN, 20));
        txtAnswer2.setText("Direct");

        txtAnswer2.setSize(150, 30);
        txtAnswer2.setLocation(650, 200);

        add(txtAnswer2);
        
        //Editing and adding the text field to display answer    
        txtAnswer3 = new JTextField();
        txtAnswer3.setFont(new Font("Arial", Font.PLAIN, 20));
        txtAnswer3.setText("90");

        txtAnswer3.setSize(150, 30);
        txtAnswer3.setLocation(650, 325);

        add(txtAnswer3);
        
        //Editing and adding the text field to display answer   
        txtAnswer4 = new JTextField();
        txtAnswer4.setFont(new Font("Arial", Font.PLAIN, 20));
        txtAnswer4.setText("3");

        txtAnswer4.setSize(150, 30);
        txtAnswer4.setLocation(650, 450);

        add(txtAnswer4);
        
        //Editing and adding the text field to display answer    
        txtAnswer5 = new JTextField();
        txtAnswer5.setFont(new Font("Arial", Font.PLAIN, 20));
        txtAnswer5.setText("2");

        txtAnswer5.setSize(150, 30);
        txtAnswer5.setLocation(650, 575);

        add(txtAnswer5);
        
        //Editing and adding the text field to display answer 
        txtAnswer6 = new JTextField();
        txtAnswer6.setFont(new Font("Arial", Font.PLAIN, 20));
        txtAnswer6.setText("y=1/2x+4");

        txtAnswer6.setSize(150, 30);
        txtAnswer6.setLocation(650, 700);

        add(txtAnswer6);
        
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
            PracticeQuestions myFrame = new PracticeQuestions();
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
            Quiz myFrame = new Quiz();
            myFrame.setSize( 1500, 1000 );
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame.setVisible(true);
            
            //Closing this frame
            this.dispose();
            
        }
        
        if (e.getActionCommand().equals("EndSession")) {
            
            //Closing this program
            System.exit(0);
        }
        
    }
    
}
