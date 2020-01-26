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
import java.lang.RuntimeException;

/**
 *
 * @author Kunwar Nir
 * 13-08-2019
 * Title: Main Menu
 * Purpose: To be the main menu for my lesson
 */
public class A_Menu extends JFrame implements ActionListener{
    
    //Adding and declaring variables so that lables, textfields etc. are existent
    JLabel lblTitle;
    JButton btnUserManual;
    JButton btnEndSession;
    JButton btnBeginLesson;
    JButton btnRateOfChange;
    JButton btnDirectAndPartial;
    JButton btnSlope;
    JButton btnEquationOfALine;
    JButton btnPracticeQuestions;
    JButton btnPracticeSolutions;
    JButton btnQuiz;
    JButton btnQuizSolutions;
    JLabel lblImage;
    JLabel lblImage2;
    //Adding images
    ImageIcon image = new ImageIcon("nice.jpg");
    ImageIcon image2 = new ImageIcon("images.jpg");
    
    public A_Menu(){
        
        //Setting the text for the title bar
        super("Main Menu");
        //Setting background colour
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null); // set frame layout
        
        //Adding and editing the title label
        lblTitle = new JLabel();
        lblTitle.setText("Linear Equations");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 36));

        lblTitle.setForeground(Color.WHITE);

        lblTitle.setSize(288, 50);
        lblTitle.setLocation(306, 50);

        add(lblTitle);
        
        //Adding and editing the first image
        lblImage = new JLabel();
        lblImage.setText("");
        lblImage.setFont(new Font("Arial", Font.BOLD, 36));

        lblImage.setForeground(Color.WHITE);
        lblImage.setIcon(image);
        lblImage.setSize(320, 157);
        lblImage.setLocation(200, 300);

        add(lblImage);
        
        //Adding and editing the second image
        lblImage2 = new JLabel();
        lblImage2.setText("");
        lblImage2.setFont(new Font("Arial", Font.BOLD, 36));

        lblImage2.setForeground(Color.WHITE);
        lblImage2.setIcon(image2);
        lblImage2.setSize(296, 170);
        lblImage2.setLocation(200, 500);

        add(lblImage2);
        
        
        //Adding and editing the User Manual button
        btnUserManual = new JButton();
        btnUserManual.setText("User Manual");
        btnUserManual.setSize(150, 40);
        btnUserManual.setLocation(25, 150);
        btnUserManual.setBackground(Color.RED);
        btnUserManual.setActionCommand("UserManual");
        btnUserManual.addActionListener(this);

        add(btnUserManual);
        
        //Adding and editing the End Session button
        btnEndSession = new JButton();
        btnEndSession.setText("End Session");
        btnEndSession.setSize(150, 40);
        btnEndSession.setLocation(700, 800);
        btnEndSession.setBackground(Color.RED);
        btnEndSession.setActionCommand("EndSession");
        btnEndSession.addActionListener(this);

        add(btnEndSession);
        
        //Adding and editing the Begin Lesson button
        btnBeginLesson = new JButton();
        btnBeginLesson.setText("Begin Lesson");
        btnBeginLesson.setSize(150, 40);
        btnBeginLesson.setLocation(700, 150);
        btnBeginLesson.setBackground(Color.RED);
        btnBeginLesson.setActionCommand("BeginLesson");
        btnBeginLesson.addActionListener(this);

        add(btnBeginLesson);
        
        //Adding and editing the Rate Of Change button
        btnRateOfChange = new JButton();
        btnRateOfChange.setText("Rate Of Change");
        btnRateOfChange.setSize(150, 40);
        btnRateOfChange.setLocation(700, 210);
        btnRateOfChange.setBackground(Color.RED);
        btnRateOfChange.setActionCommand("RateOfChange");
        btnRateOfChange.addActionListener(this);

        add(btnRateOfChange);
        
        //Adding and editing the Direct And Partial button
        btnDirectAndPartial = new JButton();
        btnDirectAndPartial.setText("Direct And Partial");
        btnDirectAndPartial.setSize(150, 40);
        btnDirectAndPartial.setLocation(700, 270);
        btnDirectAndPartial.setBackground(Color.RED);
        btnDirectAndPartial.setActionCommand("DirectAndPartial");
        btnDirectAndPartial.addActionListener(this);

        add(btnDirectAndPartial);
        
        //Adding and editing the Slope button
        btnSlope = new JButton();
        btnSlope.setText("Slope");
        btnSlope.setSize(150, 40);
        btnSlope.setLocation(700, 330);
        btnSlope.setBackground(Color.RED);
        btnSlope.setActionCommand("Slope");
        btnSlope.addActionListener(this);

        add(btnSlope);
        
        //Adding and editing the Equation Of A Line button
        btnEquationOfALine = new JButton();
        btnEquationOfALine.setText("Equation Of A Line");
        btnEquationOfALine.setSize(150, 40);
        btnEquationOfALine.setLocation(700, 390);
        btnEquationOfALine.setBackground(Color.RED);
        btnEquationOfALine.setActionCommand("EquationOfALine");
        btnEquationOfALine.addActionListener(this);

        add(btnEquationOfALine);
        
        //Adding and editing the Practice Questions button
        btnPracticeQuestions = new JButton();
        btnPracticeQuestions.setText("Practice Questions");
        btnPracticeQuestions.setSize(150, 40);
        btnPracticeQuestions.setLocation(700, 450);
        btnPracticeQuestions.setBackground(Color.RED);
        btnPracticeQuestions.setActionCommand("PracticeQuestions");
        btnPracticeQuestions.addActionListener(this);

        add(btnPracticeQuestions);
        
        //Adding and editing the Practice Solutions button
        btnPracticeSolutions = new JButton();
        btnPracticeSolutions.setText("Practice Solutions");
        btnPracticeSolutions.setSize(150, 40);
        btnPracticeSolutions.setLocation(700, 510);
        btnPracticeSolutions.setBackground(Color.RED);
        btnPracticeSolutions.setActionCommand("PracticeSolutions");
        btnPracticeSolutions.addActionListener(this);

        add(btnPracticeSolutions);
        
        //Adding and editing the Quiz button
        btnQuiz = new JButton();
        btnQuiz.setText("Quiz");
        btnQuiz.setSize(150, 40);
        btnQuiz.setLocation(700, 570);
        btnQuiz.setBackground(Color.RED);
        btnQuiz.setActionCommand("Quiz");
        btnQuiz.addActionListener(this);

        add(btnQuiz);
        
        //Adding and editing the Quiz Solutions button
        btnQuizSolutions = new JButton();
        btnQuizSolutions.setText("Quiz Solutions");
        btnQuizSolutions.setSize(150, 40);
        btnQuizSolutions.setLocation(700, 630);
        btnQuizSolutions.setBackground(Color.RED);
        btnQuizSolutions.setActionCommand("QuizSolutions");
        btnQuizSolutions.addActionListener(this);

        add(btnQuizSolutions);
        
    }
    
    
    public void actionPerformed(ActionEvent e) {
        
        //Begin Lesson is clicked
        if (e.getActionCommand().equals("BeginLesson")) {
            
            //Opening intro page
            B_IntroPage myFrame = new B_IntroPage();
            myFrame.setSize( 900, 900 );
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame.setVisible(true);
            
            //Closing this frame
            this.dispose(); 

        }
        
        //UserManual is clicked
        if (e.getActionCommand().equals("UserManual")) {
            
            //Opening user manual
            UserManual myFrame = new UserManual();
            myFrame.setSize( 900, 1300 );
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame.setVisible(true);
            
            //Closing this frame
            this.dispose();
            
        }
        
        //Rate of change is clicked
        if (e.getActionCommand().equals("RateOfChange")) {
            
            //Opening rate of change frame
            C_RateOfChange myFrame = new C_RateOfChange();
            myFrame.setSize( 900, 900 );
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame.setVisible(true);
            
            //Closing this frame
            this.dispose();
            
        }
        
        //Direct and partial is clicked
        if (e.getActionCommand().equals("DirectAndPartial")) {        
            
            //Opening that frame
            D_DirectAndPartialVariation myFrame = new D_DirectAndPartialVariation();
            myFrame.setSize( 900, 900 );
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame.setVisible(true);
            
            //Closing this frame
            this.dispose();
            
        }
        
        //If slope is clicked
        if (e.getActionCommand().equals("Slope")) {      
            
            //Opening slope frame
            E_WhatIsSlope myFrame = new E_WhatIsSlope();
            myFrame.setSize( 900, 900 );
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame.setVisible(true);
            
            //Closing this frame
            this.dispose();
            
        }
        
        //Equation of a line is clicked
        if (e.getActionCommand().equals("EquationOfALine")) {         
            
            //Opening equation of a line
            G_EquationOfALine myFrame = new G_EquationOfALine();
            myFrame.setSize( 900, 900 );
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame.setVisible(true);
            
            //Closing this frame
            this.dispose();
            
        }
        
        //Practice questions is clicked
        if (e.getActionCommand().equals("PracticeQuestions")) {          
            
            //Opening practice questions
            PracticeQuestions myFrame = new PracticeQuestions();
            myFrame.setSize( 900, 900 );
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame.setVisible(true);
            
            //Closing this frame
            this.dispose();
            
        }
        
        //Practice Solutions is clicked
        if (e.getActionCommand().equals("PracticeSolutions")) {           
            
            //Opening practice solutions
            PracticeQuestions_Solutions myFrame = new PracticeQuestions_Solutions();
            myFrame.setSize( 900, 900 );
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame.setVisible(true);
            
            //Closing this frame
            this.dispose();
            
        }
        
        //Quiz is clicked
        if (e.getActionCommand().equals("Quiz")) {          
            
            //Opening quix frame
            Quiz myFrame = new Quiz();
            myFrame.setSize( 1500, 1000 );
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame.setVisible(true);
            
            //Closing this frame
            this.dispose();
            
        }
        
        //Quiz Solution is clicked
        if (e.getActionCommand().equals("QuizSolutions")) {
            
            //Opening quiz solutions
            Quiz_Solutions myFrame = new Quiz_Solutions();
            myFrame.setSize( 1500, 1000 );
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame.setVisible(true);
            
            //Closing this frame
            this.dispose();
            
        }
        
        //End session is clicked
        if (e.getActionCommand().equals("EndSession")) {
            
            //Closing program
            System.exit(0);
        }
        
    }
    
}