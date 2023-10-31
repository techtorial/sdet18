package stringBuilderPractice;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("VACATION");

        // create a logic to replace all Uppercase 'A' with '$'

        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == 'A') {
                builder.replace(i, i + 1, "$");
            }
        }
        System.out.println(builder);


        System.out.println(builder.equals("V$C$TION")); //FALSE

        // insert()

        builder.insert(1, "is little LATER "); // C---LASS
        System.out.println(builder);

        int[] numbers = {1, 2, 3, 4, 5};
        builder.insert(builder.length(), Arrays.toString(numbers));
        System.out.println(builder);

        // delete()

        builder.delete(builder.indexOf("L"), builder.indexOf("R") + 1);

        System.out.println(builder);

        builder.delete(11, builder.length());
        System.out.println(builder);

        // deleteCharAt
        builder.deleteCharAt(3);
        System.out.println(builder);

        builder.append(" is the new version of string builder value");
        System.out.println("=====" + builder + "======");

        // delete the char in the middle of builder object

        builder.deleteCharAt(builder.length() / 2);
        System.out.println("=====" + builder);
        System.out.println("__________________");

        StringBuilder b2 = new StringBuilder("va****ca****ti****o****n");
        System.out.println("Before calling method " + b2);
        System.out.println("method result >> " + starDeletingMethod(b2));

    }
    // create a method to delete '*'s from string builder object parameter and return the new version

    // va*ca*ti*on >>> vacation

    private static StringBuilder starDeletingMethod(StringBuilder builder) {

        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == '*') {
                builder.deleteCharAt(i);
                i--;
            }

        }
        return builder;
    }


}
