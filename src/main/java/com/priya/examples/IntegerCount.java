package com.priya.examples;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class IntegerCount {

    public static void main(String[] args) {

        /* Get the Input from user */
        out.println("Enter the required size of the array :: ");
        Scanner scanner = new Scanner(in);
        int size = scanner.nextInt();
        int[] myArray;
        myArray = new int[size];
        out.println("Enter the elements of the array one by one ");
        for (int i = 0; i < size; i++) {
            myArray[i] = scanner.nextInt();
        }
        out.println("Enter the Integer to be Compared with given Array :: ");
        int compare = scanner.nextInt();

        String result = computecount(myArray, compare);

    }

    public static String computecount(int[] myArray, int compare) {
        //Execute array Iteration
        int above = 0;
        int below = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > compare) {
                above++;
            } else if (myArray[i] < compare) {
                below++;
            }
        }
        int[] output = new int[2];
        output[0] = above;
        output[1] = below;
        out.println("The Numbers above the Comparative: " + output[0]);
        out.println("The Numbers below the Comparative: " + output[1]);
        return Arrays.toString(output);
    }

}

