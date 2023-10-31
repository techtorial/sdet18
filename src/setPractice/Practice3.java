package setPractice;


import java.util.ArrayList;
import java.util.HashSet;

public class Practice3 {

    // create a method that will take parameter of Array list of integers
    // this method will find duplicate elements from given arraylist  >> can use set's add method return logic
    // this method will return those duplicate elements in another ArrayList

    public static ArrayList<Integer> findDupes(ArrayList<Integer> numbers) {

        ArrayList<Integer> bucket = new ArrayList<>();

        HashSet<Integer> set = new HashSet();

        for (Integer number : numbers) {

            if (!set.add(number)) { // if set does not add the value
                bucket.add(number); // adding that value to arrayList
            }
        }

        return bucket;
    }

    public static void main(String[] args) {

        ArrayList<Integer> abcd = new ArrayList<>();
        abcd.add(1);
        abcd.add(5);
        abcd.add(2);
        abcd.add(1);
        abcd.add(3);
        abcd.add(3);

        System.out.println(findDupes(abcd));

    }


}
