package JavaRecap;

import java.util.Scanner;

public class Loops {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-Many technical questions are related with that

      -->DO WHILE -->It is a loop that check the condition
      no matter what ONCE.

      -->WHILE -->It is a loop we use for specific condition

      -->FOR --> It is a good way to iterate the elements one by one,
      really useful for AUTOMATION

      -->FOR EACH -->It is a good way to iterate without indexing
      it means no matter what it will iterate all the data

     */
    public static void main(String[] args) {
//        String username;
//        do{
//            Scanner scanner=new Scanner(System.in);
//            System.out.println("Please enter Username");
//            username=scanner.nextLine().toLowerCase();
//        }while(username.startsWith("a"));
        //Ask the user put an int number and reverse it
        //by using while loop
        //multiply the digits
        //exp:12345
        //OUTPUT 1:54321 2:120
        /*
        Please read the task carefully
        Prepare your codes for executions
        Make sure all the requirements are met

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter number");
        int number=scanner.nextInt();
        String reverse="";
        int total=1;
        //12345 --> %10 --> 5
        //12345 /10 -->1234%10-->4
        //1/10 --> 0
        while(number!=0){
           int digit=number%10;//12345%10-->5 ->4
            reverse+=digit;//"5"
            total*=digit;//5
            number=number/10;//12345/10 -->1234
        }
        System.out.println(total);
        System.out.println(reverse);
    }
    /*
    HOMEWORK:
    1-USING SCANNER:Ask User to enter one string value with 3 words
     1-Print first letter of Each word
     2-Print last letter of each word
     3-Print the sum of the first letters of each word's index number
     4-Print sum of the last letter of each word's index number
     5-Print the difference between total last letters index and total first letters index

     EXAMPLE:Ahmet Loves Java
     /output 1:ALJ
     /output 2:tsa
     /output 3:18(0+6+12)
     /output 4:29 (4+10+15)
     /output 5:11(29-18) -->this result must be always positive
     CLUE:I would use if condition for charAt and ' '
     //Please use for-foreach loop
     */
}
