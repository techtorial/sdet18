package ifStatement;

import java.util.Scanner;

public class NestedPractice2 {
    public static void main(String[] args) {

        //>> city >> if the city is "chicago"

            // check the school>> Techtorial>> Great, you are doing this QUESTION NOW!
                                    // ??? >>> Come and visit Techtorial since u are in Chicago
        // city is not chicago >> Come to Chicago and visit US

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is you city name?");
        String city = scanner.nextLine();

        if (city.equalsIgnoreCase("chicago")){

            System.out.println("What is th School?");
            String school = scanner.nextLine();
            if (school.equalsIgnoreCase("Techtorial")){

                System.out.println("Great, you are doing this QUESTION NOW!");
            }else {
                System.out.println("Come and visit Techtorial since u are in Chicago");
            }

        }else{
            System.out.println("Come to Chicago and visit US");
        }








    }
}
