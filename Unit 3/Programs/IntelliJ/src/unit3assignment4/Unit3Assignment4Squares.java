package unit3assignment4;
import java.lang.Math;

public class Unit3Assignment4Squares {

    public static void main(String[] args) {

        int[] arrayNumbers = {0,1,2,3,4,5,6,7,8,9};
        int[] arraySquares = new int [10];

        System.out.println("Squares ArrayList");
        System.out.println("*****************");

        System.out.println(" ");


        for (int i = 0; i < arrayNumbers.length; i++){
            arraySquares[i] = (int)Math.pow(arrayNumbers[i], 2);


        }

        for (int x = 0; x < arrayNumbers.length; x++) {
            System.out.print("Number: " + arrayNumbers[x]);
            System.out.println("\tSquare: " + arraySquares[x]);
        }
    }
}
