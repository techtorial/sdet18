package JavaRecap;

import java.util.Scanner;

public class SwitchStatement {

    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-SOme of the technical questions are related with switch
    but tbh i really did not see a lot recently.
    2-In automation it is useful in same cases

    -->It is really well once you want to make your code look professional
     -->There is big difference between switch and if
     -->I would recommend you use switch when you have known limited options.
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String department= scanner.nextLine();
        switch (department){
            case "IT":
                System.out.println("You are talking to IT department");
                break;
            case "HEALTH":
                System.out.println("You are talking to HEALTH department");
                break;
            default:
                System.out.println("Please provide correct department");
        }
    }
}
