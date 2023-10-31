package arrayPractice;

import java.util.Arrays;

public class multiDimension4 {
    public static void main(String[] args) {
        String[][] cities = {{"Chicago", "Rosemont", "Des Plaines"}, {"St. Louis", "Cuba","St Charles"}, {"Kenosha"}, {"Detroit", "Ann Arbor", "Lensing"}};

        // if the length of state(cities array's individual element) is 3 or more
        // store those elements/cities into another array

        int size = cities[0].length + cities[1].length + cities[2].length + cities[3].length;
        String[] newCities = new String[size];
        int count = 0;
        for (int i = 0; i < cities.length; i++) {


            if (cities[i].length >= 3) {

                for (int k = 0; k < cities[i].length; k++) {

                    newCities[count] =cities[i][k];
                    count++;

                }
            }

        }
        System.out.println(Arrays.toString(newCities));

    }
}
