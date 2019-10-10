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
import java.util.*;
import java.util.Locale;

/**
 *
 * @author Kunwar Nir
 * 13-08-2019
 * Title: Quiz
 * Purpose: To be the quiz
 */
public class Quiz extends JFrame implements ActionListener{
    
    //Adding and declaring variables so that lables, textfields etc. are existent
    JLabel lblTitle;
    JButton btnBack;
    JButton btnMainMenu;
    JButton btnNext;
    JButton btnEndSession;
    JButton btnSubmit;
    JLabel lblSubtitle1;
    JLabel lblSubtitle2;
    JLabel lblSubtitle3;
    JTextArea txtQuestion1;
    JTextArea txtQuestion2;
    JTextArea txtQuestion3;
    JTextArea txtQuestion4;
    JTextArea txtQuestion5;
    JTextArea txtQuestion6;
    JTextArea txtQuestion7;
    JTextArea txtQuestion8;
    JTextArea txtQuestion9;
    JTextArea txtQuestion10;
    JTextArea txtQuestion11;
    JTextArea txtQuestion12;
    JTextArea txtQuestion13;
    JTextArea txtQuestion14;
    JTextArea txtQuestion15;
    JTextField txtAnswer1;
    JTextField txtAnswer2;
    JTextField txtAnswer3;
    JTextField txtAnswer4;
    JTextField txtAnswer5;
    JTextField txtAnswer6;
    JTextField txtAnswer7;
    JTextField txtAnswer8;
    JTextField txtAnswer9;
    JTextField txtAnswer10;
    JTextField txtAnswer11;
    JTextField txtAnswer12;
    JTextField txtAnswer13;
    JTextField txtAnswer14;
    JTextField txtAnswer15;
    JLabel lblDisplay;
    ArrayList<String> strAnswers = new ArrayList<String>();
    ArrayList<String> strUserAnswers = new ArrayList<String>();
    ArrayList<JTextField> txtFields = new ArrayList<JTextField>();

    
    public Quiz(){
        
        //Setting the text for the title bar
        super("Quiz");
        //Setting background colour
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null); // set frame layout
        
        //Adding and editing the title label
        lblTitle = new JLabel();
        lblTitle.setText("Quiz");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 36));

        lblTitle.setForeground(Color.WHITE);

        lblTitle.setSize(76, 50);
        lblTitle.setLocation(712, 10);

        add(lblTitle);
        
        //Editing and adding the display label
        lblDisplay = new JLabel();
        lblDisplay.setText("");
        lblDisplay.setFont(new Font("Arial", Font.BOLD, 36));

        lblDisplay.setForeground(Color.WHITE);

        lblDisplay.setSize(350, 50);
        lblDisplay.setLocation(25, 850);

        add(lblDisplay);
        
        //Editing and adding label that will be a subtitle
        lblSubtitle1 = new JLabel();
        lblSubtitle1.setText("True/False ('True', 'False')");
        lblSubtitle1.setFont(new Font("Arial", Font.BOLD, 20));

        lblSubtitle1.setForeground(Color.WHITE);

        lblSubtitle1.setSize(350, 50);
        lblSubtitle1.setLocation(25, 150);

        add(lblSubtitle1);
        
        //Editing and adding text are that will be a question
        txtQuestion1 = new JTextArea();
        txtQuestion1.setText("Direct variation passes through origin");
        txtQuestion1.setFont(new Font("Arial", Font.PLAIN, 20));

        txtQuestion1.setForeground(Color.WHITE);

        txtQuestion1.setSize(150, 100);
        txtQuestion1.setLocation(50, 200);
        txtQuestion1.setLineWrap(true);
        txtQuestion1.setWrapStyleWord(true);
        txtQuestion1.setOpaque(false);

        add(txtQuestion1);
        
        //Editing and adding text are that will be a question
        txtQuestion2 = new JTextArea();
        txtQuestion2.setText("m represents y-int");
        txtQuestion2.setFont(new Font("Arial", Font.PLAIN, 20));

        txtQuestion2.setForeground(Color.WHITE);

        txtQuestion2.setSize(150, 100);
        txtQuestion2.setLocation(330, 200);
        txtQuestion2.setLineWrap(true);
        txtQuestion2.setWrapStyleWord(true);
        txtQuestion2.setOpaque(false);

        add(txtQuestion2);
        
        //Editing and adding text are that will be a question
        txtQuestion3 = new JTextArea();
        txtQuestion3.setText("60/30 = 1/3");
        txtQuestion3.setFont(new Font("Arial", Font.PLAIN, 20));

        txtQuestion3.setForeground(Color.WHITE);

        txtQuestion3.setSize(150, 100);
        txtQuestion3.setLocation(610, 200);
        txtQuestion3.setLineWrap(true);
        txtQuestion3.setWrapStyleWord(true);
        txtQuestion3.setOpaque(false);

        add(txtQuestion3);
        
        //Editing and adding text are that will be a question
        txtQuestion4 = new JTextArea();
        txtQuestion4.setText("Equation of a line is y=mx+b");
        txtQuestion4.setFont(new Font("Arial", Font.PLAIN, 20));

        txtQuestion4.setForeground(Color.WHITE);

        txtQuestion4.setSize(150, 100);
        txtQuestion4.setLocation(890, 200);
        txtQuestion4.setLineWrap(true);
        txtQuestion4.setWrapStyleWord(true);
        txtQuestion4.setOpaque(false);

        add(txtQuestion4);
        
        //Editing and adding text are that will be a question
        txtQuestion5 = new JTextArea();
        txtQuestion5.setText("RISE/RUN is one way to get slope");
        txtQuestion5.setFont(new Font("Arial", Font.PLAIN, 20));

        txtQuestion5.setForeground(Color.WHITE);

        txtQuestion5.setSize(150, 100);
        txtQuestion5.setLocation(1170, 200);
        txtQuestion5.setLineWrap(true);
        txtQuestion5.setWrapStyleWord(true);
        txtQuestion5.setOpaque(false);

        add(txtQuestion5);

        //Editing and adding the text field for your answer       
        txtAnswer1 = new JTextField();
        txtAnswer1.setFont(new Font("Arial", Font.PLAIN, 20));

        txtAnswer1.setSize(150, 30);
        txtAnswer1.setLocation(50, 300);
        //Adding to Array List
        txtFields.add(txtAnswer1);

        add(txtAnswer1);
        
        //Editing and adding the text field for your answer       
        txtAnswer2 = new JTextField();
        txtAnswer2.setFont(new Font("Arial", Font.PLAIN, 20));

        txtAnswer2.setSize(150, 30);
        txtAnswer2.setLocation(330, 300);
        //Adding to Array List
        txtFields.add(txtAnswer2);
        add(txtAnswer2);
        
        //Editing and adding the text field for your answer       
        txtAnswer3 = new JTextField();
        txtAnswer3.setFont(new Font("Arial", Font.PLAIN, 20));

        txtAnswer3.setSize(150, 30);
        txtAnswer3.setLocation(610, 300);
        txtFields.add(txtAnswer3);
        //Adding to Array List
        add(txtAnswer3);
        
        //Editing and adding the text field for your answer       
        txtAnswer4 = new JTextField();
        txtAnswer4.setFont(new Font("Arial", Font.PLAIN, 20));

        txtAnswer4.setSize(150, 30);
        txtAnswer4.setLocation(890, 300);
        //Adding to Array List
        txtFields.add(txtAnswer4);
        add(txtAnswer4);
        
        //Editing and adding the text field for your answer       
        txtAnswer5 = new JTextField();
        txtAnswer5.setFont(new Font("Arial", Font.PLAIN, 20));

        txtAnswer5.setSize(150, 30);
        txtAnswer5.setLocation(1170, 300);
        //Adding to Array List
        txtFields.add(txtAnswer5);
        add(txtAnswer5);
        
        //Editing and adding label that will be a subtitle
        lblSubtitle2 = new JLabel();
        lblSubtitle2.setText("Fill in the Blank");
        lblSubtitle2.setFont(new Font("Arial", Font.BOLD, 20));

        lblSubtitle2.setForeground(Color.WHITE);

        lblSubtitle2.setSize(350, 50);
        lblSubtitle2.setLocation(25, 350);

        add(lblSubtitle2);
        
        //Editing and addingtext areal that willbe a questionk
        txtQuestion6 = new JTextArea();
        txtQuestion6.setText("In the equation, the ____ is represented by b");
        txtQuestion6.setFont(new Font("Arial", Font.PLAIN, 20));

        txtQuestion6.setForeground(Color.WHITE);

        txtQuestion6.setSize(150, 100);
        txtQuestion6.setLocation(50, 400);
        txtQuestion6.setLineWrap(true);
        txtQuestion6.setWrapStyleWord(true);
        txtQuestion6.setOpaque(false);

        add(txtQuestion6);
        
        //Editing and addingtext areal that willbe a questionk
        txtQuestion7 = new JTextArea();
        txtQuestion7.setText("____ of Change");
        txtQuestion7.setFont(new Font("Arial", Font.PLAIN, 20));

        txtQuestion7.setForeground(Color.WHITE);

        txtQuestion7.setSize(150, 100);
        txtQuestion7.setLocation(330, 400);
        txtQuestion7.setLineWrap(true);
        txtQuestion7.setWrapStyleWord(true);
        txtQuestion7.setOpaque(false);

        add(txtQuestion7);
        
        //Editing and addingtext areal that willbe a questionk
        txtQuestion8 = new JTextArea();
        txtQuestion8.setText("y-int is found when x = ____");
        txtQuestion8.setFont(new Font("Arial", Font.PLAIN, 20));

        txtQuestion8.setForeground(Color.WHITE);

        txtQuestion8.setSize(150, 100);
        txtQuestion8.setLocation(610, 400);
        txtQuestion8.setLineWrap(true);
        txtQuestion8.setWrapStyleWord(true);
        txtQuestion8.setOpaque(false);

        add(txtQuestion8);
        
        //Editing and addingtext areal that willbe a questionk
        txtQuestion9 = new JTextArea();
        txtQuestion9.setText("y=mx+b is the _____ of a Line");
        txtQuestion9.setFont(new Font("Arial", Font.PLAIN, 20));

        txtQuestion9.setForeground(Color.WHITE);

        txtQuestion9.setSize(150, 100);
        txtQuestion9.setLocation(890, 400);
        txtQuestion9.setLineWrap(true);
        txtQuestion9.setWrapStyleWord(true);
        txtQuestion9.setOpaque(false);

        add(txtQuestion9);
        
        //Editing and adding text area that will be a question
        txtQuestion10 = new JTextArea();
        txtQuestion10.setText("Slope is ____ in y over _____ in x");
        txtQuestion10.setFont(new Font("Arial", Font.PLAIN, 20));

        txtQuestion10.setForeground(Color.WHITE);

        txtQuestion10.setSize(150, 100);
        txtQuestion10.setLocation(1170, 400);
        txtQuestion10.setLineWrap(true);
        txtQuestion10.setWrapStyleWord(true);
        txtQuestion10.setOpaque(false);

        add(txtQuestion10);

        //Editing and adding the text field foryour answerk       
        txtAnswer6 = new JTextField();
        txtAnswer6.setFont(new Font("Arial", Font.PLAIN, 20));

        txtAnswer6.setSize(150, 30);
        txtAnswer6.setLocation(50, 500);
        //Adding to Array List
        txtFields.add(txtAnswer6);

        add(txtAnswer6);
        
        //Editing and adding the text field foryour answerk       
        txtAnswer7 = new JTextField();
        txtAnswer7.setFont(new Font("Arial", Font.PLAIN, 20));

        txtAnswer7.setSize(150, 30);
        txtAnswer7.setLocation(330, 500);
        //Adding to Array List
        txtFields.add(txtAnswer7);
        add(txtAnswer7);
        
        //Editing and adding the text field foryour answerk       
        txtAnswer8 = new JTextField();
        txtAnswer8.setFont(new Font("Arial", Font.PLAIN, 20));

        txtAnswer8.setSize(150, 30);
        txtAnswer8.setLocation(610, 500);
        txtFields.add(txtAnswer8);
        //Adding to Array List
        add(txtAnswer8);
        
        //Editing and adding the text field foryour answerk       
        txtAnswer9 = new JTextField();
        txtAnswer9.setFont(new Font("Arial", Font.PLAIN, 20));

        txtAnswer9.setSize(150, 30);
        txtAnswer9.setLocation(890, 500);
        //Adding to Array List
        txtFields.add(txtAnswer9);
        add(txtAnswer9);
        
        //Editing and adding the text field for your answer       
        txtAnswer10 = new JTextField();
        txtAnswer10.setFont(new Font("Arial", Font.PLAIN, 20));

        txtAnswer10.setSize(150, 30);
        txtAnswer10.setLocation(1170, 500);
        //Adding to Array List
        txtFields.add(txtAnswer10);
        add(txtAnswer10);
        
        //Editing and adding label that will prompt user for the students mark
        lblSubtitle3 = new JLabel();
        lblSubtitle3.setText("Short Answer");
        lblSubtitle3.setFont(new Font("Arial", Font.BOLD, 20));

        lblSubtitle3.setForeground(Color.WHITE);

        lblSubtitle3.setSize(350, 50);
        lblSubtitle3.setLocation(25, 600);

        add(lblSubtitle3);
        
        //Editing and adding text area that will be a question
        txtQuestion11 = new JTextArea();
        txtQuestion11.setText("Calculate Slope (4, 3) and (-2, -1)");
        txtQuestion11.setFont(new Font("Arial", Font.PLAIN, 20));

        txtQuestion11.setForeground(Color.WHITE);

        txtQuestion11.setSize(150, 100);
        txtQuestion11.setLocation(50, 650);
        txtQuestion11.setLineWrap(true);
        txtQuestion11.setWrapStyleWord(true);
        txtQuestion11.setOpaque(false);

        add(txtQuestion11);
        
        //Editing and adding text area that will be a question
        txtQuestion12 = new JTextArea();
        txtQuestion12.setText("\u0394 means...");
        txtQuestion12.setFont(new Font("Arial", Font.PLAIN, 20));

        txtQuestion12.setForeground(Color.WHITE);

        txtQuestion12.setSize(150, 100);
        txtQuestion12.setLocation(330, 650);
        txtQuestion12.setLineWrap(true);
        txtQuestion12.setWrapStyleWord(true);
        txtQuestion12.setOpaque(false);

        add(txtQuestion12);
        
        //Editing and adding text area that will be a question
        txtQuestion13 = new JTextArea();
        txtQuestion13.setText("Slope = 3, a point is (3, 9), find the y-int");
        txtQuestion13.setFont(new Font("Arial", Font.PLAIN, 20));

        txtQuestion13.setForeground(Color.WHITE);

        txtQuestion13.setSize(150, 100);
        txtQuestion13.setLocation(610, 650);
        txtQuestion13.setLineWrap(true);
        txtQuestion13.setWrapStyleWord(true);
        txtQuestion13.setOpaque(false);

        add(txtQuestion13);
        
        //Editing and adding text area that will be a question
        txtQuestion14 = new JTextArea();
        txtQuestion14.setText("y=7x+0, is this direct or partial");
        txtQuestion14.setFont(new Font("Arial", Font.PLAIN, 20));

        txtQuestion14.setForeground(Color.WHITE);

        txtQuestion14.setSize(150, 100);
        txtQuestion14.setLocation(890, 650);
        txtQuestion14.setLineWrap(true);
        txtQuestion14.setWrapStyleWord(true);
        txtQuestion14.setOpaque(false);

        add(txtQuestion14);
        
        //Editing and adding text area that will be a question
        txtQuestion15 = new JTextArea();
        txtQuestion15.setText("If a car travels 240km from 5 to 8pm, what is the rate of change");
        txtQuestion15.setFont(new Font("Arial", Font.PLAIN, 20));

        txtQuestion15.setForeground(Color.WHITE);

        txtQuestion15.setSize(150, 100);
        txtQuestion15.setLocation(1170, 650);
        txtQuestion15.setLineWrap(true);
        txtQuestion15.setWrapStyleWord(true);
        txtQuestion15.setOpaque(false);

        add(txtQuestion15);

        //Editing and adding the text field for your answer       
        txtAnswer11 = new JTextField();
        txtAnswer11.setFont(new Font("Arial", Font.PLAIN, 20));

        txtAnswer11.setSize(150, 30);
        txtAnswer11.setLocation(50, 750);
        //Adding to Array List
        txtFields.add(txtAnswer11);

        add(txtAnswer11);
        
        //Editing and adding the text field for your answer       
        txtAnswer12 = new JTextField();
        txtAnswer12.setFont(new Font("Arial", Font.PLAIN, 20));

        txtAnswer12.setSize(150, 30);
        txtAnswer12.setLocation(330, 750);
        //Adding to Array List
        txtFields.add(txtAnswer12);
        add(txtAnswer12);
        
        //Editing and adding the text field for your answer       
        txtAnswer13 = new JTextField();
        txtAnswer13.setFont(new Font("Arial", Font.PLAIN, 20));

        txtAnswer13.setSize(150, 30);
        txtAnswer13.setLocation(610, 750);
        txtFields.add(txtAnswer13);
        //Adding to Array List
        add(txtAnswer13);
        
        //Editing and adding the text field for your answer       
        txtAnswer14 = new JTextField();
        txtAnswer14.setFont(new Font("Arial", Font.PLAIN, 20));

        txtAnswer14.setSize(150, 30);
        txtAnswer14.setLocation(890, 750);
        //Adding to Array List
        txtFields.add(txtAnswer14);
        add(txtAnswer14);
        
        //Editing and adding the text field for your answer       
        txtAnswer15 = new JTextField();
        txtAnswer15.setFont(new Font("Arial", Font.PLAIN, 20));

        txtAnswer15.setSize(150, 30);
        txtAnswer15.setLocation(1170, 750);
        //Adding to Array List
        txtFields.add(txtAnswer15);
        add(txtAnswer15);
        
        //Adding and editing the back button
        btnBack = new JButton();
        btnBack.setText("Back");
        btnBack.setSize(150, 40);
        btnBack.setLocation(50, 100);
        btnBack.setBackground(Color.RED);
        btnBack.setActionCommand("Back");
        btnBack.addActionListener(this);

        add(btnBack);
        
        //Adding and editing the msin menu button
        btnMainMenu = new JButton();
        btnMainMenu.setText("Main Menu");
        btnMainMenu.setSize(150, 40);
        btnMainMenu.setLocation(675, 100);
        btnMainMenu.setBackground(Color.RED);
        btnMainMenu.setActionCommand("MainMenu");
        btnMainMenu.addActionListener(this);

        add(btnMainMenu);
        
        //Adding and editing the next button
        btnNext = new JButton();
        btnNext.setText("Next");
        btnNext.setSize(150, 40);
        btnNext.setLocation(1300, 100);
        btnNext.setBackground(Color.RED);
        btnNext.setActionCommand("Next");
        btnNext.addActionListener(this);

        add(btnNext);
        
        //Adding and editing the End Session button
        btnEndSession = new JButton();
        btnEndSession.setText("End Session");
        btnEndSession.setSize(150, 40);
        btnEndSession.setLocation(1300, 900);
        btnEndSession.setBackground(Color.RED);
        btnEndSession.setActionCommand("EndSession");
        btnEndSession.addActionListener(this);

        add(btnEndSession);
        
        //Adding and editing the submit button
        btnSubmit = new JButton();
        btnSubmit.setText("SUBMIT");
        btnSubmit.setSize(150, 40);
        btnSubmit.setLocation(1300, 25);
        btnSubmit.setBackground(Color.GREEN);
        btnSubmit.setActionCommand("Submit");
        btnSubmit.addActionListener(this);

        add(btnSubmit);
        
    }
    
    public void actionPerformed(ActionEvent e) {
        
        if (e.getActionCommand().equals("Back")) {
           
            //Opening previous slide
            PracticeQuestions_Solutions myFrame = new PracticeQuestions_Solutions();
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
            Quiz_Solutions myFrame = new Quiz_Solutions();
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
        
        //If submit is clicked
        if (e.getActionCommand().equals("Submit")) {
            
            //Declaring variable for the users score
            int intScore = 0;
                                   
            //Adding all the answers to the array list
            Collections.addAll(strAnswers, "true", "false", "false", "true", "true", "y-int", "rate", "0", "equation", "change", "2/3", "change in", "0", "direct", "80");
            
            //Adding the user answers to an array list
            Collections.addAll(strUserAnswers, txtAnswer1.getText(), txtAnswer2.getText(), txtAnswer3.getText(), txtAnswer4.getText(), txtAnswer5.getText(), txtAnswer6.getText(), 
                    txtAnswer7.getText(), txtAnswer8.getText(), txtAnswer9.getText(), txtAnswer10.getText(), txtAnswer11.getText(), txtAnswer12.getText(), txtAnswer13.getText(), txtAnswer14.getText(), txtAnswer15.getText());
            
            //Calling the method
            checkAnswers(intScore, strAnswers, strUserAnswers, txtFields, lblDisplay);  
                      
        }
        
    }
    
    public static void checkAnswers(int intScore, ArrayList<String> strAnswers, ArrayList<String> strUserAnswers, ArrayList<JTextField> txtFields, JLabel lblDisplay) {
        
        //For every value in the answers array list
        for (int i = 0; i < strAnswers.size(); i++) {
            //If correct add one to score and make text field green
            if (strUserAnswers.get(i).toLowerCase().equals(strAnswers.get(i))) {
                txtFields.get(i).setBackground(Color.GREEN);
                intScore++;
            } 
            //Make text field red
            else {
                txtFields.get(i).setBackground(Color.RED);
            }
        }
        //Print final score
        lblDisplay.setText("Your score is: " + intScore + "/15");

    }
    
}
