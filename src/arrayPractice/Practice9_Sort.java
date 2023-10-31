package arrayPractice;

import java.util.Arrays;

public class Practice9_Sort {
    public static void main(String[] args) {


        int[] numbers = {56, 2, 34, 54, 100, 500, 56, 3, 8, 20, 57};

        System.out.println(Arrays.toString(numbers));

        System.out.println("==After sort=====");
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[numbers.length-1]);

        //============================

        String[] favorites = {"red","Blue", "White", "Black", "yellow"};
        System.out.println(Arrays.toString(favorites));

        System.out.println("====Sort++++");
        Arrays.sort(favorites);

        System.out.println(Arrays.toString(favorites));

        char[] chs = {'3','r','Y','W','A', '$'};

        System.out.println(Arrays.toString(chs));

        System.out.println("+++SORT CHARS++++");
        Arrays.sort(chs);
        System.out.println(Arrays.toString(chs));



    }
}
