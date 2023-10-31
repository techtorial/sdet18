package arrayPractice;

import java.util.Arrays;

public class multiDimension2 {
    public static void main(String[] args) {

        String[] states = { "IL", "MO","WI", "MI"};
        //print out only state that has letter 'o' in the name of it

        for ( String state  :  states) {
            System.out.println(state);// << this is printing all states
            //print out only state that has letter 'o' in the name of it
            if ( state.contains("O")){
                System.out.println( "This state has letter 'o' >> " + state);
            }
        }

        // multi dimensional string array

        String[][] cities = { {"Chicago","Rosemont","Des Plaines"} , {"St Louis","Cuba"} , {"Kenosha"} ,{"Detroit","ABCD", "xyz"} };

        System.out.println(Arrays.deepToString(cities));// [[Chicago, Rosemont, Des Plaines], [St Louis, Cuba], [Kenosha], [Detroit, ABCD, xyz]]

        // print each city one by one. by using for-each loop

        for ( String[] state  : cities ){

            for (String city : state){

                System.out.println(city);
            }
        }
        System.out.println("===============");


        for ( int i=0; i< cities.length; i++){

            for (int a=0; a < cities[i].length; a++ ){
                System.out.println(cities[i][a]);// printing each city, no specific requirement

                // print out city that has 5 or more letters >> "..chicago.***"
                if (cities[i][a].length() >=5){
                    System.out.println(cities[i][a]+"***");
                }
            }

        }

    }
}
