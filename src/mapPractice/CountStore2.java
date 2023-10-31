package mapPractice;

import java.util.HashMap;

public class CountStore2 {

    //create a method to count and store each letter from a String into a hashmap and return your final map
    // String >> Azeddine  A - 1
    // z - 1
    // e - 2
    // ...Azeddine

    public static HashMap<Character, Integer> method1(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++)
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(method1("Azeddine"));
        System.out.println(method1("**Techtorial academy**"));
    }

}
