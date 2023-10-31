package arrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class SplitPractice2 {

    public static void main(String[] args) {
        // ask user to provide his/her birth month day and year as in following format
        // September-20-2023
        // if the month and the day is today's date >> "Happy Birthday"
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your birthdate as >> mm-dd-yyyy");
        String birthDate = input.next();
        // September-20-2023
        String[] partsOfBirthdate = birthDate.split("-");
        if (partsOfBirthdate[0].equalsIgnoreCase("september") && partsOfBirthdate[1].equalsIgnoreCase("20")) {

            System.out.println("Happy birthdate");
        }
        /*
        09.20.2023
        08\20\2025

         */
        String date = "09.20.2023";

        String[] partsOfDate = date.split("\\.");
        System.out.println(Arrays.toString(partsOfDate));

    }
}
