package switchStatement;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        // get 2 int numbers for user
        // ask for name of math operation >> like: multiply, add, subtract, divide
        // based on user entry show the correct math result
        // subtraction >> always subtract small number from large number
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int firstNumber = sc.nextInt();
        System.out.println("Please enter second Number");
        int secondNumber = sc.nextInt();
        ;
        System.out.println("Please choose an operation: like >>  multiply, add, subtract, divide");
        String operation = sc.next();

        switch (operation) {
            case "multiply":
                System.out.println("multiply >> " + firstNumber * secondNumber);
                break;
            case "add":
                System.out.println("Add >> " + (firstNumber + secondNumber));
                break;
            case "subtract":
                if (firstNumber >= secondNumber) {
                    System.out.println("Subtract >> " + (firstNumber - secondNumber));
                } else {
                    System.out.println("Subtract >> " + (secondNumber - firstNumber));
                }
                break;
            case "divide":
                System.out.println("Divide >> " + firstNumber / secondNumber);
                break;
            default:
                System.out.println("Please choose correct operation name");
        }

    }
}
