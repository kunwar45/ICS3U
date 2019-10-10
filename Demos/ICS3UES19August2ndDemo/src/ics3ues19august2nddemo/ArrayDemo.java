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
public class ArrayDemo {
    
    //Usuing arrays in a method
    /**
     * 
     * @param intArr is an Integer array
     * @return the sum of each elements in the array
     */
    public static int intArraySum(int [] intArr){
        int intTotal = 0;
        for(int i = 0; i < intArr.length; i++){
            intTotal += intArr[i];
        }
        return intTotal;
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        //Declaring an Integer array in Java
        int [] intArr1 = new int[5];
        //Accesing a Value in the index i
        System.out.println(intArr1[0]);
        //Assigning Value to an index i
        intArr1[0] = 10;
        intArr1[1] = 20;
        intArr1[2] = 30;
        intArr1[3] = 40;
        intArr1[4] = 50;
        //Traversing through the array using for loop
        for(int i = 0; i < intArr1.length; i++){
            System.out.print(intArr1[i] +"\t");
        }
        System.out.println("");
        int [] intArr2 = new int[5];
        //Initilizing the array value using a for loop
        for(int i = 0; i < intArr2.length; i++){
            intArr2[i] = input.nextInt();
        }
        for(int i = 0; i < intArr2.length; i++){
            System.out.print(intArr2[i] +"\t");
        }
        System.out.println("");
        //Declaring Values in the array by comma separated values
        int [] intArr3 = {10,13,16,18,19,23,14,16};
        //Let's print the content of the array
        for(int i = 0; i < intArr3.length; i++){
            System.out.print(intArr3[i] +"\t");
        }
        System.out.println("");
        //Declaring a String Array
        String [] strName = new String[5];
        //declaring a double array
        double [] dblArr1 = new double[5];
        //declaring a boolean  array
        boolean [] isHungry = new boolean[5];
        int [] intFun = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(intArraySum(intFun));
    }
}
