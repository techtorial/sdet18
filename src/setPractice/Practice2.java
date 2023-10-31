package setPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practice2 {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet <String> treeSet = new TreeSet<>();

        hashSet.add("Nike");            linkedHashSet.add("Nike");              treeSet.add("Nike");
        hashSet.add("Puma");            linkedHashSet.add("Puma");              treeSet.add("Puma");
        hashSet.add("Adidas");          linkedHashSet.add("Adidas");            treeSet.add("Adidas");
        hashSet.add("ON");              linkedHashSet.add("ON");                treeSet.add("ON");
        System.out.println(hashSet);    System.out.println(linkedHashSet);      System.out.println(treeSet);
//      [Nike, Adidas, Puma, ON]        [Nike, Puma, Adidas, ON]                [Adidas, Nike, ON, Puma]

        System.out.println("-------------");
        // storing duplicate value
        hashSet.add("ON");              linkedHashSet.add("ON");                treeSet.add("ON");
        System.out.println(hashSet);    System.out.println(linkedHashSet);      System.out.println(treeSet);

        System.out.println("-------------");
        // storing null value
        hashSet.add(null);              linkedHashSet.add(null);               // treeSet.add(null);
        System.out.println(hashSet);    System.out.println(linkedHashSet);      System.out.println(treeSet);

        //on the tree set there are some more methods we can use
        System.out.println(treeSet.first());// first element is returned
        System.out.println( treeSet.last());// last element is returned

        System.out.println(treeSet);
        System.out.println(treeSet.pollFirst()); // removing first element from TreeSet
        System.out.println(treeSet);

        treeSet.pollLast(); // removing last element from TreeSet
        System.out.println( treeSet);





    }
}
