package ifStatement;

import java.util.Scanner;

public class ElsePractice2 {
    public static void main(String[] args) {
        // ask user if s/he has driver's license
        // if user says yes >> "You are GREAT!"
        //              NO >> "Please got to DMV"
        Scanner dataTaker = new Scanner(System.in);
        System.out.println("Do you have driver's license? yes/No");

        String answer = dataTaker.next();


        if (answer.equalsIgnoreCase("YES")){
            System.out.println("You are GREAT");
        }else {
            System.out.println("Go to DMV");
        }

    }
}
