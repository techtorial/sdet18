package mapPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Practice2 {
    public static void main(String[] args) {


        HashMap<String, String> map = new HashMap<>();

        map.put("IL", "Chicago");
        map.put("FL", "Tampa");
        map.put("WI", "Kenosha");
        System.out.println(map);

        String city1 = map.get("FL"); // Tampa
        System.out.println(city1);

        // put("FL","Orlando") >> it will replace old value if the given value is different than first one

        map.put("FL", "Orlando");
        System.out.println(map);
        System.out.println(map.size()); // 3

        // remove()
        map.remove("FL");
        System.out.println(map);
        map.remove("IL", "Chicago");
        System.out.println(map);

        //replace()
        map.replace("WI", "Madison");
        System.out.println(map);

        // contains, isEmpty, clear,

        // containsKey >> looking for key in the map
        Boolean b1 = map.containsKey("NY");
        System.out.println(b1);

        // containsValue >> looking for value in the map
        Boolean b2 = map.containsValue("Madison");
        System.out.println(b2);

        //isEmpty()
        System.out.println(map.isEmpty());

        //clear
        map.clear();
        System.out.println(map.isEmpty());

        // {WI=Kenosha, IL=Chicago, FL=Orlando}

        map.put("IL", "Chicago");
        map.put("FL", "Tampa");
        map.put("WI", "Kenosha");

        //want to have values only
        System.out.println(map.values());

        System.out.println("---------");
        Collection<String> valuesFromMap = map.values();
        System.out.println(valuesFromMap);

        printValues(map);
        System.out.println("----------");
        // want to extract only keys from map
        // keySet(); will return keys from given map

        System.out.println(map.keySet());
        // store keys from map in a variable

        Set<String> keysFromMap = map.keySet();
        System.out.println(keysFromMap);

        System.out.println("******");
        printValuesByKeys(map);

    }

    // create a method that will take a map as a parameter
    // your method will print each value from the parameter map one by one
    // in the main method, call/use your newly created method to check the result

    public static void printValues(HashMap<String, String> map) {
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }
    }

    // create a method that will take a map as a parameter
    // your method will extract keys from parameter map
    // print each value from map by using map.get() method call
    //
    // in the main method, call/use your newly created method to check the result

    public static void printValuesByKeys(HashMap<String,String > map){
        Set<String> keys = map.keySet();

       for ( String key : keys){
           System.out.println(   map.get( key )   );
       }

    }

}
