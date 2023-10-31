package stringBuilderPractice;

import java.util.ArrayList;
import java.util.List;

public class FunctionsPractice {
    //create a method that will take StringBuilder array
    //this method will reverse and print each element from given array

    public static void reverseBuilders(StringBuilder[] array){

        for ( StringBuilder builder : array ){
            builder.reverse();
            System.out.println(builder);
        }
    }

    // create a method that will take builder array
    // this method should replace middle char from words
    //              which has odd numbers of characters
    // replacement char is '$'
    // this method should return new words in a List

    public static List<StringBuilder> middleCharReplacement(StringBuilder[] array){
        List<StringBuilder> list = new ArrayList<>();
        for (StringBuilder builder : array){

            if ( builder.length()%2 != 0){

                list.add(  builder.replace(builder.length()/2,builder.length()/2 +1, "$" ));
            }

        }

        return list;

    }

    // create a method that will take StringBuilder as parameter
    // this method will find and return sum of digits
    //                          from given builder object
    // "d5yy74&5*Tyi" >> 5+7+4+5 = 21

    public static Integer sumOfDigits(StringBuilder builder){
        Integer sum = 0;
        for (int i =0; i< builder.length();i++ ){
            if (builder.charAt(i) >= '0' && builder.charAt(i)<='9') {

                sum = sum + Integer.parseInt( ""+builder.charAt(i));
            }
        }
        System.out.println(sum);

       return sum;
    }




}
