package JavaRecap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MapConcept {

    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-can you tell me what do you know about map? Do you use it in your project?

    Of course(with the full of energy), Map is a way to store data with a
    "KEY AND VALUE" logic.
     Map<String,Integer> customer=new Map();
     {Ahmet=31,Mehmet=24,Mahmut=35,Ayse=25}

    2-What is the connection between Collections and Map?
     They are all useful for my project, but specifically whenever I need to store
     data with duplication, I use LIST
          with uniqueness,  I use SET
          with Key-Value,   I use MAP

    3-What is the type of Map and differences between them?
      -->HashMap       -->Random order
      -->LinkHashMap   -->Insertion order Key(Ahmet,Mehmet,Mahmut,Ayse)
      -->TreeMap       -->Ascending order Key(Ahmet,Ayse,Mahmut,Mehmet)

    SHOW OFF:As you know, the map is not part of collection but It is the combination
    of the Collection
      -->The Key part of the map behaves like SET, it means you can only have unique keys
      -->The Value part of the map behaves like LIST, it means you can have duplicate values

    4-What is synchronization in java?Can you give me an example used in java?

      First come, first served

       * It executes any actions one by one.
       *We have 2 common concepts in java use Synchronization
         -->HASHTABLE   --> STRING BUFFER -->Synchronized

       *Synchronization system is "THREAD-SAFE" -> SLOW PROCESS
       *Non-Synchronization system is "NON-THREAD SAFE" -->FAST PROCESS
        -->LIST,MAP,SET,STRING BUILDER ..etc
     */
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();
        HashSet<String> lastname=new HashSet<>();
        Map<String,String> nameAndLastName=new HashMap();
        nameAndLastName.put("Ahmet","Baldir");
        nameAndLastName.put("Mehmet","Mahmut");
        System.out.println(nameAndLastName);

        /*
        HOMEWORK:
        1-String[] fruits={"Apple","Banana","Peach","Apple","Orange","Strawberry","Banana","Cherry","Orange"}
        print out --> {Apple=2,Banana=2,Peach=1,Orange=1,Cherry=1,Strawberry=1}
        -->Please use map
        -->Please use loop
         */

    }
}
