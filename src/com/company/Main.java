package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
            The letter grade is determined as follows:
            A = 90–100%
            B = 80–89%
            C = 70–79%
            D = 60–69%
            F = 0–59%
            Write a program that will print the
            letter grade based on the percentage entered.
        */

        Scanner in = new Scanner(System.in);
        System.out.print("Enter percentage: ");
        int percentage = in.nextInt();
        String letterGrade = getLetterGrade(percentage);
        System.out.println(letterGrade);

    }

    public static String getLetterGrade(int percentage){
        String letterGrade = "";

        if(percentage >= 90){
            letterGrade = "A";
        }

        else if(percentage >= 80){
            letterGrade = "B";
        }

        else if(percentage >= 70){
            letterGrade = "C";
        }

        else if(percentage >= 60){
            letterGrade = "D";
        }

        else {
            letterGrade = "F";
        }

        return letterGrade;
    }
}