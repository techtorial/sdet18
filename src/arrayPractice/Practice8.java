package arrayPractice;

import java.util.Arrays;

public class Practice8 {
    public static void main(String[] args) {


        String[] daysOfWeek = {"Monday","Tuesday", "Wednesday", "Thursday"};
        /*
        print each of the day in reverse version from the given array
        Monday >> yadnoM
        Tuesday >> yadseuT

        2 - store reversed names of the days into another array
        yadsruhT
        yadsendeW
        yadseuT
        yadnoM
         */
        String[] reversedDays = new String[daysOfWeek.length];
        for ( int i = daysOfWeek.length-1; i >=0 ; i--){

            String reversed ="";

            for (int k = daysOfWeek[i].length()-1; k >=0 ; k--){

                reversed += daysOfWeek[i].charAt(k);
            }
            System.out.println(reversed);
            reversedDays[i] = reversed;

        }
        System.out.println(Arrays.toString(reversedDays));








    }
}
