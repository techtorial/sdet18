package arrayPractice;

import java.util.Arrays;

public class Practice10_BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {56, 2, 34, 54, 100, 500, 56, 3, 8, 20, 57};

        // need to sort your array before using binary search

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // [2, 3, 8, 20, 34, 54, 56, 56, 57, 100, 500]

        int indexOf8 = Arrays.binarySearch(numbers, 8);
        System.out.println(indexOf8);


        String str = "example";

        System.out.println(str.indexOf('x'));

        int indexOf500 = Arrays.binarySearch(numbers, 500);
        System.out.println(  numbers.length == indexOf500+1); //

        // [2, 3, '4' 8, 20, 34, 54, 56, 56, 57, 100, 500]

        int indexOf4 = Arrays.binarySearch(numbers, 4); // return negative number with possible location of that value
        System.out.println(  indexOf4 );


    }
}
