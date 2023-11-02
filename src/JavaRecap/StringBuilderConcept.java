package JavaRecap;

public class StringBuilderConcept {

    /*
    Possible Interview Questions:
    1-What is the difference between String and String Builder?

    They are both useful for my project, in terms of "Mutability" and "Immutability"
      -->String is immutable -->Is all about the function/actions/manipulation with "RE-ASSIGNING
      THE VALUE".In other words -->It is not changeable unless you re-assign it.

      -->StringBuilder is mutable-->is all about function/actions/manipulation without "Re-Assign Value"
      In other words -->You do not need to reassign the value once you do changes.

    2-What is the difference between String Builder and String Buffer?
      --> StringBuffer and HashTable are both synchronized
      -->Map,List,Set,StringBuilder are non-synchronized
     */

    public static void main(String[] args) {

        //Immutability
        String name="Ahmet";
        name=name.concat("Baldir").replace("a","*");
        System.out.println(name);
        //Mutability
        StringBuilder stringBuilder=new StringBuilder("Ahmet");

        System.out.println(stringBuilder.append("Baldir").replace(1,2,"*").lastIndexOf("a"));


    }
}
