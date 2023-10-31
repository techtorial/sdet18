package scannerPractice;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        // best buy will give 20% discount
        // on the 28th of the month
        // for the people whose name starts with 'T'
        // "You get 20% discount today : ..T/F.."
        // for the task get the day as number and name as string from user by using scanner

        Scanner input = new Scanner(System.in);
        System.out.println("What is the date today as number? (is it 28th? enter it as int");

        int date = input.nextInt();
        System.out.println("Please enter your name");
        //input.nextLine();
        input = new Scanner(System.in);
        char firstLetter = input.nextLine().charAt(0); //taking first char/letter from name of user

        boolean result = date == 28 && (firstLetter == 't' || firstLetter == 'T');
        System.out.println("You get 20% discount today : " + result);

    }
}
