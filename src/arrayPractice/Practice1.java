package arrayPractice;
import java.util.Arrays;
public class Practice1 {
    public static void main(String[] args) {

        // syntax for array creation

        int[] numbers = new int[11];

        System.out.println(numbers);// memory location for the array
        // how to print array to see values?  >> Arrays.toString(nameOfArray)
        System.out.println(Arrays.toString(numbers));

        // how to assign values to any index??
        numbers[0] = 5;
        System.out.println(Arrays.toString(numbers) );
        numbers[1] = 45;
        numbers[3] = 20;
        numbers[2] = 11;
        numbers[6] = 60;
        System.out.println(Arrays.toString(numbers));// [5, 45, 11, 20, 0, 0, 60, 0, 0, 0]

        numbers[1] = 22;
        System.out.println(Arrays.toString(numbers));// [5, 22, 11, 20, 0, 0, 60, 0, 0, 0]
        // How to reach/use individual values from any index?
        System.out.println(     numbers[3] );
        // if you try to use/reach/print any index which is not existing on the array >> Exception
       // System.out.println(  numbers[20]); // ArrayIndexOutOfBoundsException
       // System.out.println(numbers[10]);
        String str = "abcdsfgsf";
        System.out.println( str.length());

        // array has size, you can use length property to check size of array

        int l = numbers.length;
        System.out.println( l +" << is the size of array  Numbers");
        System.out.println( numbers.length );

        numbers[9] = 80;
        System.out.println(Arrays.toString(numbers));
        numbers[ numbers.length-1] = 99 ;
        System.out.println(Arrays.toString(numbers));

        // store number 700 to the middle index of array
        numbers[ numbers.length/2 ] = 700;
        System.out.println(Arrays.toString(numbers));

        System.out.println("=====================");
        String[]  studentNames = new String[5];

        System.out.println(Arrays.toString(studentNames));

        studentNames[3] = "John";
        studentNames[0] = "Ana";
        studentNames[1] = "David";
        studentNames[4] = "Sam";
        System.out.println(Arrays.toString(studentNames));
        System.out.println( studentNames.length);
        studentNames[studentNames.length-1] = "Meza";

        System.out.println(Arrays.toString(studentNames));

        System.out.println(studentNames[1]); // David

    }
}
