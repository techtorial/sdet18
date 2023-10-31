package switchStatement;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {

        /*
        apple, grape, strawberry, watermelon, cherry
        >> ask for favorite fruit of user
        if user's favorite is one of the above fruits, >> We have your favorite!!
        otherwise >> Sorry, We do not have your favorite :(
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter favorite fruit");

        String myFavorite = sc.nextLine().toLowerCase();

        switch (myFavorite){
            case "apple":
//                System.out.println("We have your favorite!!");
//                break;
            case "grape":
//                System.out.println("We have your favorite!!");
//                break;
            case "strawberry":
//                System.out.println("We have your favorite!!");
//                break;
            case "watermelon":
//                System.out.println("We have your favorite!!");
//                break;
            case "cherry":
                System.out.println("We have your favorite!!" + myFavorite);
                break;
            default:
                System.out.println("Sorry, We do not have your favorite :( ");
        }

    }
}
