package com.example;

import java.util.Scanner;

public class StudentGradeEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Prompt the user to enter their age
        System.out.print("Enter you age: ");
        int age = scanner.nextInt();
        
        // Prompt the user to enter their exam score
        System.out.println("Enter student's exam score: ");
        int score = scanner.nextInt();

        // Determine the grade
        String grade;
        if (score >=90){
            grade = "A";
        } else if (score >= 80){
            grade ="B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
    
        // Print the student's details
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);

         // Determine scholarship eligibility
         boolean eligibleForScholarship = (age < 25) && (grade.equals("A") || grade.equals("B"));

         // Print scholarship eligibility message
         if (eligibleForScholarship) {
             System.out.println("\nCongratulations! " + name + " is eligible for a scholarship.");
         } else {
             System.out.println("\n" + name + " is not eligible for a scholarship.");
         }
 
         // Close the scanner
         scanner.close();
     }
         

       
    
}
