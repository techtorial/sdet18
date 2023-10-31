package arrayPractice;

public class Practice6 {
    public static void main(String[] args) {

        int[] numbers = {4,2,990,22, 55, 304, 1, 300, 6, -34};
        // find and show the largest number from given array
        int large = numbers[0];
        int small = numbers[0];
        for (int i = 0; i < numbers.length;i++){

            if ( numbers[i] > large){
                large = numbers[i];
            }
            if( numbers[i] < small){
                small = numbers[i];
            }

        }
        System.out.println(large);
        System.out.println(small);

    }
}
