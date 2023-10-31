package mapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice3 {
    public static void main(String[] args) {

        // keys
        // values
        // pairs

        HashMap<String, String> map = new HashMap<>();

        map.put("IL", "Chicago");
        map.put("FL", "Tampa");
        map.put("WI", "Kenosha");
        System.out.println(map);

        map.entrySet(); // will return key-value pairs from the map
        System.out.println(   map.entrySet() );

        Set<Map.Entry<String,String>> pairs = map.entrySet(); // [WI=Kenosha, IL=Chicago, FL=Tampa]
        // reach out each pair individually

        for (Map.Entry<String,String> pair  : pairs){

            System.out.println( pair);
        }

    }
}
