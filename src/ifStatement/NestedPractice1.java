package ifStatement;

import java.util.Scanner;

public class NestedPractice1 {
    public static void main(String[] args) {

        // traveling to Europe>> ID, Visa, Ticket
        // yes/no
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have an ID yes/no");
        String id = scanner.next();
        if (id.equalsIgnoreCase("yes")) {

            System.out.println("Do you have visa? yes/no");
            String visa = scanner.next();
            if (visa.equalsIgnoreCase("yes")) {

                System.out.println("Do you have ticket? yes/no");
                String ticket = scanner.next();

                if (ticket.equalsIgnoreCase("yes")) {
                    System.out.println("You can FLY to Europe");

                } else {
                    System.out.println("No Valid TICKET");
                }

            } else {
                System.out.println("No Valid VISA");
            }

        } else {
            System.out.println("No Valid ID");
        }


    }
}
