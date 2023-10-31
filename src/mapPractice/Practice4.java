package mapPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Practice4 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();
        TreeMap <String,String> treeMap = new TreeMap<>();

        hashMap.put("First","Pineapple");     linkedHashMap.put("First", "Pineapple");       treeMap.put("First","Pineapple");
        hashMap.put("Second","Orange");       linkedHashMap.put("Second", "Orange");         treeMap.put("Second","Orange");
        hashMap.put("Third","Apple");         linkedHashMap.put("Third", "Apple");           treeMap.put("Third","Apple");
        hashMap.put("Fourth","Melon");        linkedHashMap.put("Fourth", "Melon");          treeMap.put("Fourth","Melon");
        System.out.println( hashMap);            System.out.println(linkedHashMap);          System.out.println(treeMap);
        //No order                                  // Insertion Order                          // Ascending Order

        // null key
        hashMap.put(null,"Melon");        linkedHashMap.put(null, "Melon");      //    treeMap.put(null,"Melon");

        System.out.println( hashMap);            System.out.println(linkedHashMap);          System.out.println(treeMap);
        System.out.println("**********************");

        // null value
        hashMap.put("Fifth", null);        linkedHashMap.put("Fifth", null);                treeMap.put("Fifth",null);
        hashMap.put("Sixth", null);        linkedHashMap.put("Sixth", null);                treeMap.put("Sixth",null);
        hashMap.put("Seventh", null);        linkedHashMap.put("Seventh", null);            treeMap.put("Seventh",null);

        System.out.println( hashMap);            System.out.println(linkedHashMap);          System.out.println(treeMap);

    }
}
