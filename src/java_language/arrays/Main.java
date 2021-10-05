package java_language.arrays;

import java.io.PrintStream;
import java.util.Arrays;
//The class Arrays offers several methods to be used with arrays, be it to search for an item or modify them.
//It can be parallelized with the class Collections and its methods which treat lists and Collections.

//Implementing a two-dimensional array with its second dimension being variable.

public class Main {
    public static void main(String[] args) {
        double[] ext = {1,2};
        double[] ext2;
        //ext2 = {1,2}; //Failed! Java needs confirmation of the type to avoid confusion among them.
        ext2 = new double[]{1,2}; //Working!
        int [][]matrix = new int[10][]; //It is not required to define the size of the second dimension!
        matrix[0] = new int[]{1,2,3,4,5,6,7,8,9,0}; //10 variables
        matrix[1] = new int[]{1,2,3,4,5,6,7,8,9}; //9 variables
        matrix[2] = new int[]{1,2,3,4,5,6}; //6 variables
        matrix[3] = new int[]{1,2,3,4}; //4 variables
        matrix[4] = new int[]{1,2,3,4,5,6,7,8,9,0}; //10 variables
        matrix[5] = new int[]{1,2}; //2 variables
        matrix[6] = new int[]{1}; //1 variable
        matrix[7] = new int[]{1,2,3,4,5,6,7,8,9}; //9 variables
        matrix[8] = new int[]{1,2,3,4,5,6,7,8}; //8 variables
        matrix[9] = new int[]{1,2,3,4,5,6}; //6 variables
        PrintStream cmd = System.out;
        cmd.println("-------- With for-each ---------");
        for (int[] arr : matrix) {
            for (int num : arr) {
                if (num != arr[arr.length - 1]) cmd.print(num + "\t");
                else cmd.println(num); //Last iteration
            }
            cmd.println();
        }
        cmd.println("--------------------------------");
        cmd.println("----- With traditional for -----");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j < matrix[i].length - 1) cmd.print(matrix[i][j] + "\t");
                else cmd.println(matrix[i][j]); //Last iteration
            }
            cmd.println();
        }
        cmd.println("--------------------------------");
        //char[] chars = new char[-1]; //A runtime exception will be thrown!
        cmd.println(Arrays.toString(matrix));
        int verifiable;
        //cmd.println(verifiable); //Failed! Only attributes in a class are initialized with the standard values!
        //Reference variables: null;
        //Integers: 0;
        //Floating point numbers: 0.0
        //Boolean variables: false;
        String name;
        //cmd.println(name); //Failed!
        Test tt = new Test();
        tt.print("A simple print!");
        String msg = tt.print("A more complex message ",7);
        System.out.println(msg);
    }
}
