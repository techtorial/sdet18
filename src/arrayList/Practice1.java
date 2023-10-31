package arrayList;

import objectMethodPractice.Pet;
import wrapperClasses.Microphone;

import java.util.*;

public class Practice1 {
    public static void main(String[] args) {

        ArrayList list1 = new ArrayList();
        list1.add("Boolean.true");
        list1.add(true);
        Iterator iterator = list1.iterator();
        while (iterator.hasNext()){
            System.out.println("---> "+iterator.next());
        }

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList();

        System.out.println(list3);
        System.out.println(list1);
        list3.add(5);
        list3.add(0,15);
        System.out.println(list3);
        list3.add(8);
        list3.add(18);
        list3.add(3);


        System.out.println(list3); // [15,5, 8, 18, 3] insertion order
        list3.set(1,500);
        System.out.println(list3);

        Integer size = list3.size();// return int, for numbers of elements of arraylist
        System.out.println(size);



        list3.add(2, 100);
        System.out.println(list3);
        list3.add(5, 500);
        System.out.println(list3);
        //   list3.add(8, 800);
        System.out.println(list3); // [5, 8, 100,18 , 3, 500]

        // get();
        int n = list3.get(3); // 18
        System.out.println(n);
        System.out.println(list3.get(2));

        ArrayList<Double> myMoney = new ArrayList<>();
        myMoney.add(2.50);
        myMoney.add(100.99);
        myMoney.add(5.55);

        System.out.println(myMoney);
        Double n2 = myMoney.get(2);

        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i));
        }
        // for each loop
        System.out.println("==for each loop implementation==");
        for (Integer number : list3) {
            System.out.println(number);
        }
        // while loop
        int i = 0;
        while (i < list3.size()){

            System.out.println(" >>> " + list3.get(i));
            i++;
        }
    //// add some elements to the list1
        list1.add(3);
        list1.add("Hello");
        list1.add('T');
        list1.add( new Pet());
        list1.add(7.8);
        list1.add(new Microphone("ABCD", "BLUE", "10"));
        System.out.println( list1 );

        // use for each loop with this list1, how to show each element one by one?

        for (Object item : list1){
            System.out.println( item);

        }





    }
}
