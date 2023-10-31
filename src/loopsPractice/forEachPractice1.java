package loopsPractice;

public class forEachPractice1 {

    public static void main(String[] args) {

        int[] numbers = {56, 2, 34, 54, 100, 500, 56, 3, 8, 20, 57};

        // print out every single number from given array by using for-each loop

        for (int i : numbers) {

            System.out.println(i);

        }

        System.out.println("===============");

        String[] seasons = {"Fall", "Winter", "Spring", "Summer"}; // print each season as UPPERcase
        // FALL
        for (String season : seasons) {

            System.out.println(season);
            System.out.println(season.toUpperCase());
        }

        // find out sum of given numbers from an array by using for-each loop
        int[] records = {1, 3, 5, 7, 9, 10};

        int total = 0;

        for (int num: records) {


            total += num;

        }
        System.out.println( total);

       // records = {1, 3, 5, 7, 9, 10};
        // === find out total of odd numbers from above array by using for each loop
        int total2 = 0;
        for ( int number  :  records){

            if ( number % 2 !=0){
                total2 = total2 + number;
            }
        }
        System.out.println("Total of odd numbers is "+total2);




    }
}
