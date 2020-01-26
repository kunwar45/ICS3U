/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Admin
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i <= 4; i++) {
            num1 = i * i;
            num2 += num1;
            System.out.println(num1 + " num1 ");
        }
        System.out.println(num2 + " 87");
    }

}
