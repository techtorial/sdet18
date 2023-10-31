package JavaRecap;

import java.util.Arrays;

public class StringMethods {

    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-Most of the technical questions are related with String and its methods?

    2-What is the difference between .equals and == ?

     Thats a great question, First of all these two ways are all about comparison the data

     I do not use == a lot for String value comparison, specifically I use it for
     primitive data comparison

      -->When I use .equals method, it compares only the "VALUE"

      -->When I use ==, it compares not only the "VALUE" also "LOCATION" of the data

    3-What is String and how do you declare?

      String is an object that we store some data in it.

      -->General Description of the answer
       -->DECLARE:Means you create a variable but do not assign any value
          String str;
          String str2=new String();
      -->Initialize:Means you create a variable and assign the value
          str2="Ahmet Loves Java";
          String str3=new String("Ahmet Loves Java")

      STRING METHODS: * means we use commonly in automation
       1-IndexOf()   --> IT gives you the index number of character. IT RETURNS INT
    *  2-Length()    -->It gives you the size(characters)(amount) of the data(value).IT RETURNS INT
       3-Concat()    -->It is a way to to combine two or more values(Concat or + ).IT RETURNS STRING
   *   4-Split()     -->It is a way to cut the words from specific spot(character).IT RETURNS STRING ARRAY ******
       5-StartsWith  -->It checks the value starts with a specific character/s.IT RETURNS BOOLEAN
       6-EndsWith    -->It checks the value ends with a specific character/s.IT RETURNS BOOLEAN
  *    7-Substring   -->It is a way to get specific character/s from value.IT RETURNS STRING
       8-CharAt      -->It is a wat to get the single character from specific index.(OPPOSITE OF INDEXOF).IT RETURNS Char
   *** 9-CONTAINS    -->It checks the value has the data that you are looking for. IT RETURNS BOOLEAN
  *** 10-EQUALS      -->It checks the data %100 equals the value that you are looking for. IT RETURNS BOOLEAN
      11-EQUALIGNORECASE-->It checks the data %100 equals but ignore the uppercase or lowercase sensitiveness.IT RETURNS BOOLEAN
  *   12-REPLACE    -->It replaces the specific character/s in String.IT RETURNS STRING
      13-TOUPPER/TOLOWER-->It changes all the characters to upper or lower. IT RETURNS STRING
      14-VALUEOF    -->It converts the data to String value from the different data types.IT RETURNS STRING
 ***** 15-TRIM      --> It removes spaces from beginning and at the end of value.
     */
    public static void main(String[] args) {
        String str=" Ahmet Loves Java ";//$12
        System.out.println(str.trim());
        String price="$123,454";
        String tax="$12,34";
        int priceTax=12545;
        System.out.println("$"+String.valueOf(priceTax).concat("$"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        double value=Double.parseDouble(price.replace("$","").replace(",","."));
        System.out.println(value);
        System.out.println(value);
        String str5="AHMET LOVES java";
        System.out.println(str.equalsIgnoreCase(str5));
        System.out.println(str.equals(str5));
        System.out.println(str.contains("Lo"));
        System.out.println(str.contains("JAVA"));
        System.out.println(str.substring(0,5).equals("Ahmet"));
        System.out.println(str.substring(2,7));//met L
        System.out.println(str.substring(1));
        System.out.println(str.substring(3,4).toUpperCase());//e
        System.out.println(str.charAt(3));//e
        System.out.println(str.startsWith("AHmet"));//false
        System.out.println(str.startsWith("A"));
        System.out.println(str.endsWith("va"));
        System.out.println(str.indexOf('t'));
        System.out.println(str.length());
        System.out.println(str.concat(" and Automation"));
        System.out.println(str + " and Automation");
        String[] words=str.split(" ");
        System.out.println(Arrays.toString(words));
        String str2=new String("Ahmet Loves Java");
        String str3="Ahmet Loves Java";
        String str4=new String("Ahmet Loves Java");
        System.out.println(str.equals(str3));//true
        System.out.println(str==str3); //true
        System.out.println(str.equals(str2));
        System.out.println(str==str2);//false
        System.out.println(str2.equals(str4));
        System.out.println(str2==str4);//false
        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
    }
}
