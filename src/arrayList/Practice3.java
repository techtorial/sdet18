package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice3 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList();
        list.add(23);
        list.add(24);
        list.add(25);
        System.out.println(list);

        // size, remove, clear, get ,...

        // convert array to arrayList >> asList();
        // asList

        int[] numbers = {1, 2, 3, 4, 5};


        List<Object> list1 = Arrays.asList(numbers);
        System.out.println(list1);
        // arrayList has no limitation for size
        //  list1.add(7); // UnsupportedOperationException
        System.out.println(list1);
        list1.set(0, 99);

        // find out if there is a way to add multiple values to arraylist/list at one

        // convert arrayList to array >> toArray()

        ArrayList<String> items = new ArrayList<>();

        items.add("ABCD");
        items.add("XYZ");

            Object[] arrayItems =    items.toArray();

            items.toArray(new String[]{});

        System.out.println(Arrays.toString( items.toArray(new String[]{})));

        System.out.println( Arrays.toString(arrayItems));





    }


}
