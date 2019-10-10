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
public class ArrayAlgorithms {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int [] intArr1 = {13, -100,19,1000,34,56,-20};
        //Finding the Max and Min
        //let assume the first element of the array is the max 
        // and also the min value
        int intMax = intArr1[0];
        int intMin = intArr1[0];
        for(int i = 0; i < intArr1.length; i++){
            if(intArr1[i] >= intMax){
                intMax = intArr1[i];
            }
            if(intArr1[i] <= intMin){
                intMin = intArr1[i];
            }
        }
        System.out.println("Max: "+ intMax);
        System.out.println("Min "+ intMin);
    }
}
