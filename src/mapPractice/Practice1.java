package mapPractice;

import java.util.HashMap;

public class Practice1 {
    public static void main(String[] args) {

        HashMap <String, Integer>  students = new HashMap();

        System.out.println( students );

        students.put("David", 10);
        System.out.println( students );

        students.put("Aiza", 20);
        students.put("Jenny", 30);
        students.put("Mary", 40);
        System.out.println( students); // {  Aiza=20, David=10, Jenny=30, Mary=40}

        // get()

        students.get("Mary"); // 40 >> get method will return value for the given key
        System.out.println( students.get("Mary"));
        // put on same key

        students.put("Mary", 41);
        System.out.println(students);

        students.get(41);
        System.out.println( students.get(41));

        // null
        students.put(null,50);
        System.out.println( students);


    }
}
