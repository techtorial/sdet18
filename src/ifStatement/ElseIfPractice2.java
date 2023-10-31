package ifStatement;

import java.util.Scanner;

public class ElseIfPractice2 {
    public static void main(String[] args) {
        /*
        find out average score for student
        when student has 3 test scores
        if average is 0- 59 >> "Your letter  grade is FAILING"
        if average is 60- 69 >> "Your letter  grade is D"
          if average is 70- 79 >> "Your letter  grade is C"

          ... till 100 as top average
         */
        int test1 = 90, test2= 100, test3 = 90, average = (test1+test2+test3)/3;
        if (average >=0 && average <=59){
            System.out.println( "Your letter  grade is FAILING");
        }
        else if(average >= 60 && average<70){
            System.out.println("Your letter  grade is D");
        }else if(average >= 70 && average<80){
            System.out.println("Your letter  grade is C");
        }else if(average >= 80 && average<90){
            System.out.println("Your letter  grade is B");
        }else if(average >= 90 && average<=100){
            System.out.println("Your letter  grade is A");
        }else {
            System.out.println("Invalid Average");
        }
        System.out.println("=============");
        // get an int number from user and find out if the given number positive/negative or none

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your an integer number");
        int number = scanner.nextInt();

        if (number>0){
            System.out.println("positive");
        }else if(number <0){
            System.out.println("Negative");
        }else {
            System.out.println("Neither");
        }







    }
}
