package JavaRecap;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetConcept {

    /*
    Possible Interview Questions:
    1-How can you make the element unique with collection(American style)
    1.1-What is set? what is the purpose of using it?(Indian style)

    In my project, I am facing some duplication of the data which causes some
    conflicts through project.Based on my research, In Java we have "SET" collection
    which handle this duplication issues.It means it is all about uniqueness

    2-Can you tell me the types of collections?

      Sure, We have few collections that I am familiar with
       -->List -->ArrayList  --> LinkedList
       -->Set   -->HashSet         -->Data integration with "RANDOM ORDER"
                -->LinkedHashSet   -->Data Integration with "INSERTION ORDER"
                -->TreeSet         -->Data integration with "ASCENDING ORDER"
       -->Queue(I do not use it currently in my project)

    3-Can you explain the difference between List and Set?

              List:                                          Set:
   1-It can store duplicates data(1,1,2,3,4,4)     1-You can have only unique data(1,2,3,4)
   2-It works with "INDEXING"                      2-It does not have "INDEXING"
   3-it has different subcategories                3-HashSet,LinkedHashSet,TreeSet
     Arraylist,LinkedList
     */
    public static void main(String[] args) {
        Set<Integer> numbers=new HashSet<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(5);
        numbers.add(3);
        numbers.add(2);
        System.out.println(numbers);
        Set<Integer> numbers2=new LinkedHashSet<>();
        numbers2.add(1);
        numbers2.add(4);
        numbers2.add(5);
        numbers2.add(3);
        numbers2.add(2);
        System.out.println(numbers2);
        Set<Integer> numbers3=new TreeSet<>();
        numbers3.add(1);
        numbers3.add(1);
        numbers3.add(4);
        numbers3.add(5);
        numbers3.add(5);
        numbers3.add(3);
        numbers3.add(2);
        numbers3.add(2);
        System.out.println(numbers3);
    }



}
