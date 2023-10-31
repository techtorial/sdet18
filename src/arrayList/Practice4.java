package arrayList;

import java.util.LinkedList;

public class Practice4 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList();

        list.add("Chicago");
        list.add("New York");
        list.add("Washington");
        list.add("Tampa");

        // get()
        System.out.println(list.get(1));

        System.out.println(list);

        // remove
        list.remove(3);
        System.out.println(list);

        // ArrayList vs LinkedList

        //{1,2,4,5,6,6,7,8,8,9,9,0,9,8,7,6,5,43,,22,3}
        // add or remove value to the arraylist, it is slow when you compare to the LinkedList
        //{1,2,4,6,6,7,8,8,9,9,0,9,8,7,6,5,43,,22,3}

        for (String str : list){
            System.out.println(str);

        }
        for (int i=0; i < list.size();i++){
            System.out.println(">> "+ list.get(i));
        }

    }
}
