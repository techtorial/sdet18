package switchStatement;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        /*
        select following departments >> 1 - Customer Help, 2 - IT ...
        1 - Customer Help >> 'You are connected to ..department.."
        2 - IT >>  'who do you want to connect with?'
                    "John" "Sam"
                    "John" >> you are speaking with John from IT".
        3 - HR  >>
                    'who do you want to connect with?'
                    Abishek, Diana , David
                    "David" >> you are speaking with David from HR".
        4 - Finance >> 'You are connected to ..department.."
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select corresponding number for each department" +
                "\n1 - Customer Help\n2 - IT Department\n3 - HR Department\n4 - Finance Department");

        int departmentNumber = scanner.nextInt();

        switch (departmentNumber) {
            case 1: // Customer
                System.out.println("You are in Customer Department");
                break;
            case 2: //IT
                System.out.println("Who do you want to speak with? JOHN/SAM");

                String name = scanner.next().toUpperCase();// modifying name to Uppercase
                switch (name) {
                    case "JOHN":
                        System.out.println("You are speaking with " + name + " from IT dept.");
                        break;
                    case "SAM":
                        System.out.println("You are speaking with " + name + " from IT dept.");
                        break;
                    default:
                        System.out.println("There is no such " + name);
                }
                break;
            case 3: // HR >>   Abishek, Diana , David
                System.out.println("Who do you want to speak with? Abishek/Diana/David");
                String name1 = scanner.next().toUpperCase();// modifying name to Uppercase

                switch (name1) {
                    case "ABISHEK":
                    case "DIANA":
                    case "DAVID":
                        System.out.println("You are speaking with " + name1 + " from HR dept.");
                        break;
                    default:
                        System.out.println("There is no such " + name1);
                }
                break;
            case 4: //Finance
                System.out.println("You are in FINANCE Department");
                break;
            default:
                System.out.println("No matching department");

        }


    }
}
