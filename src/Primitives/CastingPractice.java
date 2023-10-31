package Primitives;

public class CastingPractice {
    public static void main(String[] args) {

        int count = 128;
        System.out.println( "count >> "+count);
        byte number = (byte)count; // Explicit casting, storing int type to byte type
        System.out.println("Number --> "+number);

        int money = (int) 13.25; // Explicit casting, double type to int type
        System.out.println("Money is >> "+ money);

        byte b1 = 8, b2 = 2;

        short result1 = (short) (b1 + b2);

        short result2 = (byte) (b1 + b2);


        byte id = 23;
        short shortID = id; // implicit casting

        long accountNumber = 12;

        int accNumber = (int)accountNumber;

        char letter = 'K';

        byte i = (byte)letter;

        System.out.println( i + 1000 );

        // implicit casting

        int age = 23;

        double age2 = age;

        // double, long, int








    }

}
