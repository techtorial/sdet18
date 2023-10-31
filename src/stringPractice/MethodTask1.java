package stringPractice;

import java.util.Scanner;

public class MethodTask1 {
    public static void main(String[] args) {
        /*
        TASK: get a string from User via scanner and:
        -print:
            first char
            last char
            index of second matching letter 'c'
            length of string
            index of x
            middle char
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter any string value");
        String text = scanner.nextLine();
        System.out.println( text.charAt(0)     );// first char
        System.out.println( text.charAt(  text.length()-1  )  );// last char
        System.out.println( text.indexOf('c', text.indexOf('c')+1));// second 'c' index number
        System.out.println( text.length());// length of entire string
        System.out.println( text.indexOf('x') ); // index of 'x'
        System.out.println(    text.charAt(  text.length()/2  ) ); // middle char

    }
}
