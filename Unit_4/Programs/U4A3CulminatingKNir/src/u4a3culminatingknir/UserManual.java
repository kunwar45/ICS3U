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
 * Title: User Manual
 * Purpose: Tell the user how to use program
 */
public class UserManual extends JFrame implements ActionListener{
    
    //Adding and declaring variables so that lables, textfields etc. are existent
    JLabel lblTitle;
    JLabel lblImage1;
    JLabel lblImage2;
    JLabel lblImage3;
    JTextArea txtText1;
    JTextArea txtText2;
    JTextArea txtText3;
    ImageIcon image1 = new ImageIcon("step11.jpg");
    ImageIcon image2 = new ImageIcon("step1.jpg");
    ImageIcon image3 = new ImageIcon("step2.jpg");
    JButton btnMainMenu;
    
    public UserManual(){
        
        //Setting the text for the title bar
        super("User Manual");
        //Setting background colour
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null); // set frame layout
        
        //Adding and editing the title label
        lblTitle = new JLabel();
        lblTitle.setText("User Manual");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 36));

        lblTitle.setForeground(Color.WHITE);

        lblTitle.setSize(300, 50);
        lblTitle.setLocation(350, 10);

        add(lblTitle);
        
        //Adding and editing the first text
        txtText1 = new JTextArea();
        txtText1.setText("Step One: Open file in NetBeans");
        txtText1.setFont(new Font("Arial", Font.PLAIN, 20));
        txtText1.setOpaque(false);
        txtText1.setLineWrap(true);
        txtText1.setWrapStyleWord(true);
        txtText1.setForeground(Color.WHITE);

        txtText1.setSize(150, 150);
        txtText1.setLocation(600, 150);

        add(txtText1);
        
        //Adding and editing the second text
        txtText2 = new JTextArea();
        txtText2.setText("Select This file to open");
        txtText2.setFont(new Font("Arial", Font.PLAIN, 20));
        txtText2.setOpaque(false);
        txtText2.setLineWrap(true);
        txtText2.setWrapStyleWord(true);
        txtText2.setForeground(Color.WHITE);

        txtText2.setSize(150, 150);
        txtText2.setLocation(600, 300);

        add(txtText2);
        
        //Adding and editing the third text
        txtText3 = new JTextArea();
        txtText3.setText("Run the file by right clicking on the JFrame Tester");
        txtText3.setFont(new Font("Arial", Font.PLAIN, 20));
        txtText3.setOpaque(false);
        txtText3.setLineWrap(true);
        txtText3.setWrapStyleWord(true);
        txtText3.setForeground(Color.WHITE);

        txtText3.setSize(150, 150);
        txtText3.setLocation(600, 650);

        add(txtText3);
        
        //Adding and editing the first image
        lblImage1 = new JLabel();
        lblImage1.setText("");
        lblImage1.setFont(new Font("Arial", Font.BOLD, 36));
        lblImage1.setIcon(image1);
        lblImage1.setForeground(Color.WHITE);
        lblImage1.setOpaque(false);
        lblImage1.setSize(512, 106);
        lblImage1.setLocation(50, 100);

        add(lblImage1);
        
        //Adding and editing the second image
        lblImage2 = new JLabel();
        lblImage2.setText("");
        lblImage2.setFont(new Font("Arial", Font.BOLD, 36));
        lblImage2.setIcon(image2);
        lblImage2.setForeground(Color.WHITE);
        lblImage2.setOpaque(false);
        lblImage2.setSize(512, 191);
        lblImage2.setLocation(50, 250);

        add(lblImage2);
        
        //Adding and editing the third image
        lblImage3 = new JLabel();
        lblImage3.setText("");
        lblImage3.setFont(new Font("Arial", Font.BOLD, 36));
        lblImage3.setIcon(image3);
        lblImage3.setForeground(Color.WHITE);
        lblImage3.setOpaque(false);
        lblImage3.setSize(512, 510);
        lblImage3.setLocation(50, 500);

        add(lblImage3);
        
        //Adding and editing the main menu button
        btnMainMenu = new JButton();
        btnMainMenu.setText("Main Menu");
        btnMainMenu.setSize(150, 40);
        btnMainMenu.setLocation(700, 100);
        btnMainMenu.setBackground(Color.RED);
        btnMainMenu.setActionCommand("MainMenu");
        btnMainMenu.addActionListener(this);

        add(btnMainMenu);
        
    }
    
    public void actionPerformed(ActionEvent e) {
        
        if (e.getActionCommand().equals("MainMenu")) {
            
            //Opening main menu
            A_Menu myFrame = new A_Menu();
            myFrame.setSize( 900, 900 );
            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame.setVisible(true);
            
            //Closing this frame
            this.dispose();
            
        }
        
    }
    
}
