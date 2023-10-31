package loopsPractice;

import java.util.Arrays;

public class forEachPractice3 {
    public static void main(String[] args) {


        String[] days = {"monday", "tuesday", "wednesday"};

        for (  String a       : days ) {

            System.out.println(a.length());

            System.out.println(days.length);
            System.out.println(Arrays.toString(days));
        }

        char[] somethingArray = {'a', 'b', 'c', 'd'};

        for ( char c  : somethingArray ){
            System.out.println( c);
        }

        String name1 = "Alex";
        String name2 = "Mariana";
        String name3 = "Yahshi";

        String[] names = {name1, name2, name3};
        System.out.println("===========");
        // mix data type in array

        int deskNumber = 3;
        double valuableItems = 100.55;
        boolean takingToys = true;
        String chair = "White";
        char ch = 't';

        Object[] everything = {deskNumber, valuableItems, takingToys, chair, ch, 'e', "Another String", 200};

        // reach out individual element
        for ( Object item : everything ){

            System.out.println( item.toString().concat("--000--")   );

        }


    }
}
