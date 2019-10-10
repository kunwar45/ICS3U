/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ics3ues19august2nddemo;
import java.util.Scanner;

/**
 *
 * @author nanth
 */
public class ICS3UES19August2ndDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        /**
         * Read 10 Integers from the user calculate the average and print the integers that
         * are greater than the average
         * 1 2 3 4 5 6 7 8 9 10
         */
        
        int intTotal = 0; // This will tally all them
        int intX1 , intX2, intX3, intX4, intX5; //To read the numbers
        intX1 = input.nextInt();
        intX2 = input.nextInt();
        intX3 = input.nextInt();
        intX4 = input.nextInt();
        intX5 = input.nextInt();
        double dblAvg = (intX1 + intX2 + intX3 + intX4 + intX5)/5.0;
        if(intX1 > dblAvg)System.out.println (intX1);
        if(intX2 > dblAvg)System.out.println (intX2);
    }
    
}