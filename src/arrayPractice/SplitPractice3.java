package arrayPractice;

import java.util.Arrays;

public class SplitPractice3 {
    public static void main(String[] args) {
        String fall = "Autumn is usually defined in the Northern Hemisphere as the period between " +
                "the autumnal equinox (day and night equal in length), September 22 or 23, and the " +
                "winter solstice (year’s shortest day), December 21 or 22; and in the Southern Hemisphere" +
                " as the period between March 20 or 21 and June 21 or 22. The autumn temperature transition" +
                " between summer heat and winter cold occurs only in middle and high latitudes; in equatorial " +
                "regions, temperatures generally vary little during the year.";
        // split this sentence from '.' show product array
        System.out.println(fall.split("\\.").length);

        // count numbers of words which has odd amount of letters
        String[] parts = fall.split(" ");
        int count = 0;
        for (int i = 0; i < parts.length; i++) {

            if (parts[i].length() % 2 != 0) {
                System.out.println(parts[i]);
                count++;
            }
        }
        System.out.println(count);
    }


}
