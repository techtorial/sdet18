package setPractice;
import java.util.HashSet;
import java.util.Iterator;

public class Practice1 {
    public static void main(String[] args) {


        HashSet<String> set2 = new HashSet();
        set2.add("David");
        set2.add("Sam");
        set2.add("Azzedine");
        set2.add("Aiza");

        System.out.println(set2);
        //duplicate

        set2.add("Aiza");
        System.out.println(set2);

        System.out.println(set2.add("Vlad")); // true
        System.out.println(set2.add("Vlad")); // false
        System.out.println(set2);

        //reach out one/single value
        // there is no get() method in hashset
        // say hi to Vlad only

        for ( String name : set2){
            if (name.equalsIgnoreCase("vlad")){
                System.out.println("Hi "+name);

            }
        }
        // say bye to Vlad by using for loop
        //for (int i=0; i <set2.size(); i++ ){

            if (set2.contains("Vlad")){
                System.out.println("Bye Vlad");
              //  break;
            }

       // }

        // null value in HashSet
        set2.add(null);
            set2.add(null);
        System.out.println(">>> "+ set2);

        set2.remove("Vlad");
        System.out.println(set2);
        set2.remove(null);
        System.out.println( set2);

        // size()
        System.out.println(set2.size());

        // addAll
        set2.addAll(set2);
        System.out.println(set2);
        HashSet<String> set3 = new HashSet<>();
        set3.add("Bogdan");
        set3.addAll(set2);
        System.out.println( set3);

        // clear
        set2.clear();
        System.out.println( set2);
        // isEmpty
        System.out.println( set2.isEmpty());

        // Iterator
        Iterator iterator = set3.iterator();

        while (iterator.hasNext()){
            System.out.println(" ++ "+iterator.next());
        }







    }
}
