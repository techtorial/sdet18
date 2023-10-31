package Primitives;

public class ComparisonPractice {
    public static void main(String[] args) {

        // ==
        System.out.println(5 == 5);// true

        int count = 20;
        int number = ++count;
        boolean compare1 = count == number;
        System.out.println(compare1);// true


        char symbol = 'a';
        char symbol2 = 'b';
        System.out.println(symbol == symbol2);// FALSE

        System.out.println( symbol == 90);//
        System.out.println("-------------");

        System.out.println("apple" == "orange");//
        System.out.println("APPLE" =="apple");
        System.out.println("apple" == "apple");

        System.out.println("===============");
        System.out.println(true == true);

        boolean b1 = 6 == 7;
        boolean b2 = 6 == 6;
        System.out.println((b1 == b2) == (symbol == 'A'));//T
        System.out.println("===============");
        //===========================
        // !=

        int a = 4, b =5;

        boolean b3 = a != b;
        System.out.println(b3); // TRUE

        System.out.println( ++a != b);

        System.out.println("tuesday" != "wednesday"); // T
        boolean b4 = "tuesday" != "wednesday"; // TRUE

        System.out.println( b3 != !b4 );//

        // > greater than
        System.out.println(   4 > 5); // FALSE
        double digit = 4.50;
        float digit2 = 4.50f;

        boolean b5 = digit > digit2;
        System.out.println(" b5 is >> "+ b5);

        int age = 56, kidAge = 12, grandFatherAge = age + kidAge;

        boolean b6 = kidAge + age > grandFatherAge;
        System.out.println("B6 >> "+ b6); //

        System.out.println( grandFatherAge == kidAge + age);// TRUE



    }
}
