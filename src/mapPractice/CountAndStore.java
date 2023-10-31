package mapPractice;

import java.util.HashMap;

public class CountAndStore {
    public static void main(String[] args) {

        String[] states = {"IL", "IL","NY", "WI", "WA", "FL","FL", "FL"};

        // create a logic to count states and store them in a hashMap as in following format
        /** <K , V>
         *  IL, 2
         *  NY, 1
         *  WI, 1
         *  WA, 1
         *  FL, 3
         */

        HashMap<String, Integer> map = new HashMap<>();
       // map.put("IL", 2);

        for ( String state : states) {

           if(!map.containsKey(state)){
               map.put(state,1);
           }else {
               map.put(state, map.get(state)+1 );
           }

        }
        map.get("IL");// >> value
        System.out.println(map);// {WI=1, IL=2, FL=3, WA=1, NY=1}


        System.out.println(countStore(states));
    }

    // // create a method to count states and store them in a hashMap as in following format
    // and return the hashmap

    public static HashMap<String, Integer> countStore(String[] states){
        HashMap<String, Integer> map = new HashMap<>();
        for ( String state : states) {
            if(!map.containsKey(state)){
                map.put(state,1);
            }else {
                map.put(state, map.get(state)+1 );
            }
        }
        return map;
    }







}
