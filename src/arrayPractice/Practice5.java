package arrayPractice;

import java.util.Arrays;

public class Practice5 {
    public static void main(String[] args) {

        //first way of creating array
        int[] numbers = new int[7];

        numbers[0] = 9;
        numbers[1] = 8;

        // another way to create array
        int[] ids = {12, 15, 35, 45, 50};

        System.out.println(Arrays.toString(ids));

        System.out.println(ids.length);// size >>> 5

        //for loop to reach out every number one by one
        for (int i = 0; i < ids.length; i++) {
            System.out.println(ids[i]);
        }
        ids[0] = 25;
        System.out.println(Arrays.toString(ids));
        // ids[5] = 100;


        int[] doorNumber = {12, 15, 35, 45, 50,12, 15, 35, 45, 50};

        // print house numbers that are less than 30
        // and count that how many house numbers is less than 30
        //>> 12, 15 >> Less than 30
        //> There is 2 house number less than 30
        int count =0;
        for (int index = 0; index < doorNumber.length; index++) {

            if (doorNumber[index] < 30) {
                System.out.println(doorNumber[index] + " << is less than 30");
                count++;
            }

        }
        System.out.println("there  is "+ count + " door numbers less than 30 in the array");


    }
}
