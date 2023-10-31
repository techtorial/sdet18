package loopsPractice;

import java.util.Random;
import java.util.Scanner;

public class doWhile_HeadTailGame {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String yesNo;
        do {
            int number = random.nextInt(2);
            String myFlip =  number == 0 ?  "HEAD"   :  "TAIL"    ;
            System.out.println("Game is started, MAKE a GUESS! HEAD/TAIL");
            String userGuess = scanner.next();

            if (myFlip.equalsIgnoreCase(userGuess)){
                System.out.println("You are lucky, it is your day today.");
            }else {
                System.out.println("Sorry, that was not the correct choice!");
            }

            System.out.println("Do you want to play again? y/n");
            yesNo = scanner.next();
        } while (yesNo.equalsIgnoreCase("y"));
        System.out.println("Its Ok, SEE you NEXT time!");


    }
}
