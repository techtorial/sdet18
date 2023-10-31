package stringPractice;

public class StringEquality {
    public static void main(String[] args) {

        //    ==    vs  equals()

        String name1 = "David";
        String name2 = "David";

        System.out.println( name1 == name2); // True
        System.out.println(  name1.equals(name2)); // True

        String name3 = new String("David");
        String name4 = new String("David");
        System.out.println( name3 == name4);// False
        System.out.println( name3.equals(name4) );// True

        System.out.println( name1.toLowerCase() == name2.toLowerCase() );

        name1 =  name1.toLowerCase();
        name2 = name2.toLowerCase();

        System.out.println(name1 == name2);

        // to compare string values, use equals method
        // to compare any object, use == comparison

        // stack memory
        // heap memory >> string pool>> common string values



    }
}
