package JavaRecap;

import java.util.Scanner;

public class IfStatementAndTernary {

    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-Most of the technical interview questions are related with If/Ternary?

      If is a conditional statement

      if(boolean condition){ -->weather is 25
      get some actions
      I will come to school
      else{
      get some actions
      I will stay at home

      AND(&)                                                OR(||)
      TRUE && TRUE   --> TRUE                           TRUE  || TRUE --> TRUE
      TRUE && FALSE  --> FALSE                          TRUE  || FALSE -->TRUE
      FALSE && FALSE -->FALSE                           FALSE || FALSE -->FALSE
     */
    public static void main(String[] args) {
        String time="morning";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a temperature");
        int expectedTemperature=scanner.nextInt();
        if(expectedTemperature>25 || time.equals("morning") ){
            System.out.println("The weather is good");
        }else{
            System.out.println("The weather is cold");
        }
        String result=(expectedTemperature>25 || time.equals("mornings")) ? "The weather is good" : "The weather is cold";
        System.out.println(result);
        System.out.println((expectedTemperature>25 || time.equals("mornings")) ? "The weather is good" : "The weather is cold");
    }
}
