package arrayPractice;

import java.util.Arrays;

public class multiDimension1 {
    public static void main(String[] args) {

        int[][] numbers = new int[5][3];

        System.out.println(Arrays.deepToString(numbers));
//     [[0, 0, 0],    [0, 0, 0],    [0, 0, 0],    [0, 0, 0],    [0, 0, 0] ]

        numbers[0][0] = 23;
        System.out.println(Arrays.deepToString(numbers));
        numbers[0][2] = 12;
        numbers[2][1] = 45;
        numbers[2][2] = 50;
        numbers[4][0] = 77;
        System.out.println(Arrays.deepToString(numbers));
        System.out.println(   numbers[2][1]); // 45
       // System.out.println( numbers[0][3]);// RunTimeError / Exception

        // how to use length ?
        System.out.println( numbers.length );//
        System.out.println( numbers[0].length );// 3

        // [[23, 0, 12], [0, 0, 0], [0, 45, 50], [0, 0, 0], [77, 0, 0]]
        // store value '100' in the last array's last index

        numbers[4][2] = 100;
        System.out.println(Arrays.deepToString(numbers));

        numbers[numbers.length-1][numbers[numbers.length-1].length-1] = 200;
        System.out.println(Arrays.deepToString(numbers));

//  [[23, 0, 12], [0, 0, 0], [0, 45, 50], [0, 0, 0], [77, 0, 200]]

        // show numbers one by one

        for (int i= 0; i< numbers.length; i++){

            for (int k= 0; k< numbers[i].length; k++){
                System.out.println(  numbers[i][k]  );
            }
            System.out.println("-------");

        }

        for ( int[] elements : numbers ){

            for ( int number: elements ){
                System.out.println(   number + " <<< "  );
            }


        }










    }
}
