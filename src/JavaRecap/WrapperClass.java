package JavaRecap;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {

    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-What is wrapper class?
      It is a process to convert data into different forms.

    2-How many ways of wrapper class do you know?

      -->Wow, that's a great question. There are few ways for conversion in wrapper class
         -->autoboxing:
           --->The conversion of data from "PRIMITIVE" to "OBJECT"
         -->unboxing:
           --->The conversion of data from "OBJECT" to "PRIMITIVE"
     */
    public static void main(String[] args) {
        int number=5;
        Integer number5=3;
       number=(int) number5;//Unboxing because you are re-assigning the OBject Value(3) to int number
        System.out.println(number);
        List<Integer> numbers=new ArrayList<>();
        numbers.add(number);
        numbers.get(0) ;//AutoBoxing -->it turns the Primitive to Object directly by self
        String price="24.64";
        String total="26.21";
        double all=Double.parseDouble(total)-Double.parseDouble(price);
                       //UNBOXING-->It turns the OBJECT(String) to Pritimive(double) with parsing.

    }
}
