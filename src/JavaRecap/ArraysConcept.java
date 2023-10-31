package JavaRecap;

import java.util.ArrayList;
import java.util.List;

public class ArraysConcept {

    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-What is the difference between Array and ArrayList()?
      -->Array is a storage for Primitives and Objects
      -->The purpose of usage is all about storing "MULTIPLE DATA" with a simple way.

         ARRAYLIST:                                        ARRAYS:
      1-Dynamic size                                       1-Fixed size
      2-Storage for ONLY OBJECT                            2-Storage for PRIMITIVES AND OBJECT
      3-It does not have MULTIDIMENSIONAL form             3-It does have it
      4-It has some special methods(add,remove..etc)       4-It does not have these methods I mentioned on the left
      5-Syntax is different                               5-Syntax is different
           */
    public static void main(String[] args) {
        int[] numbers=new int[4];
        numbers[0]=5;
        int number5=2;
        Integer number6=5;
        String[] names={"Ahmet","Mehmet","Mahmut","Ayse"};
        List<Integer> numbers2=new ArrayList<>();
        numbers2.add(number5);
        int[][] numbers63={{12,3,4},{123,5}};
        System.out.println(numbers63[1][1]);
        /*
        HOMEWORK:
        1-Write an implementation that initialize int array find the:

         -->Sum of the even number
         -->Sum of the odd number
         -->Positive value of differences between even and sum
         exp:{1,2,3,8,12,65,5,73,22,17}
         Please use for-foreach loop -->please use Ternary operator
         */
    }
}
