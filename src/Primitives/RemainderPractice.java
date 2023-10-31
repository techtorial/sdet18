package Primitives;

public class RemainderPractice {

    public static void main(String[] args) {
        /*
            345 --> find out total of digits from given number
            3 + 4 + 5 >> 12
            Print >> "The total of digits of 345 is ..."
         */

        int number = 555;

        int digit3 = number % 10; //taking 5 from 345, and store it in digit3 variable
        System.out.println(digit3);// printing 5, which is digit3
        number = number / 10; // making number 10 times less, which is making it 34
        System.out.println(">>> "+ number);// printing number, which is 34
        int digit2 = number % 10; // taking 4 from 34, and store it in digit2 variable

        int digit1 = number/10; // taking digit1, which is 3
        System.out.println(digit1+digit2+digit3 + " is the total of digits from given number."); // finding sum of digits and printing

    }
}
