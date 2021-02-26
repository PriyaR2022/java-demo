package com.priya.examples;

import java.util.Scanner;

import static java.lang.System.*;

public class StringRotate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        out.print("Enter a String to be Rotated:");
        String inputStr = scanner.nextLine();
        out.print("Enter the Number of characters to be rotated to right:");
        int number = scanner.nextInt();
        // print or return the rotated String
        out.println("The Rotated String is " + strRotate(inputStr, number));
    }

    public static String strRotate(String inputStr, int num) {

        //Validate Input String
        if ((inputStr == null) || (inputStr == "")) {
            out.println("The Entered String is Null. Please Enter the valid String");
            return "invalid_string";
        }
        //Validate Input Integer
        if (num < 0) {
            out.println("The Entered Integer is Negative. Please Enter the valid Integer");
            return "invalid_int";
        }
        //Execute logic
        int length = inputStr.length();
        String str1 = inputStr.substring(0, (length - num));
        String str2 = inputStr.substring((length - num), length);
        return str2.concat(str1);
    }
}