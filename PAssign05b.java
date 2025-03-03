
import java.util.Scanner;


/**
* File: Lab06.java
* Class: CSCI 1301 H
* Author: Jae Jackson
* Created on: March 3, 2025
* Last Modified: March 3, 2025
* Description: checks grades and outputs what kind of grade it is, stops at -999 using a for loop
*/


public class PAssign05b {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double firstGrade = 0; // first inputted grades
        int validGrades = 0; // valid and invalid grades
        int invalidGrades = 0;
        double highGrade = Double.NEGATIVE_INFINITY; // initiates the highest grade as negative infinity
        double lowGrade = Double.POSITIVE_INFINITY;

        int aCount = 0; 
        int bCount = 0; // range from A-F for grades
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;


        System.out.println("Number of grades:");
        int count = input.nextInt(); // creates the number of grades going to be entered

        for (int i = 1; i <= count; i++){
            System.out.println("Enter grade from 0-100 (" + i + " of " + count + "):");
            firstGrade = input.nextDouble();

            if (firstGrade >= 0 && firstGrade <= 100){
                validGrades++; // adds to valid grades

                if (firstGrade > highGrade){
                    // if the firstgrade is higher than negative infinity, it is the new highgrade, and every other number is compared to it
                    highGrade = firstGrade;
                } 
                
                if (firstGrade < lowGrade) {
                    // if the firstgrade is lower than positive infinity, its the new lowgrade, and every number is compared to it
                    lowGrade = firstGrade;
                }

                // ranges for the count of grades and what they are
                if (firstGrade >= 90){
                    aCount++;
                } else if (firstGrade >= 80 && firstGrade < 90){
                    bCount++;
                } else if (firstGrade >= 70 && firstGrade < 80){
                    cCount++;
                } else if (firstGrade >= 60 && firstGrade < 70){
                    dCount++;
                } else {
                    fCount++;
                }

            } else {
                invalidGrades++;
                System.out.println("Error: That is not a valid score.");
            }
        }

        if (validGrades != 0){
            System.out.println("Valid grades:" + "\t" + validGrades );
            System.out.println("Invalid grades:" + "\t" + invalidGrades );
            System.out.println("Highest grade:" + "\t" + highGrade + "0");
            System.out.println("Lowest grade:" + "\t" + lowGrade + "0") ;

            System.out.println("");

            System.out.println("As:" + "\t"+ aCount);
            System.out.println("Bs:" + "\t" + bCount);
            System.out.println("Cs:" + "\t" + cCount);
            System.out.println("Ds:" + "\t" + dCount);
            System.out.println("Fs:" + "\t" + fCount);
        } else {
            System.out.println("Valid grades:" + "\t" + validGrades );
            System.out.println("Invalid grades:" + "\t" + invalidGrades );
            System.out.println("Highest grade:" + "\t" + "0.00");
            System.out.println("Lowest grade:" + "\t" + "0.00" );

            System.out.println("");

            System.out.println("As:" + "\t"+ aCount);
            System.out.println("Bs:" + "\t" + bCount);
            System.out.println("Cs:" + "\t" + cCount);
            System.out.println("Ds:" + "\t" + dCount);
            System.out.println("Fs:" + "\t" + fCount);
        }
    }
}
