package arrayPractice;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] zipCodes = new int[6];
        zipCodes[0] = 600;
        zipCodes[1] = 700;
        zipCodes[2] = 800;
        zipCodes[3] = 900;
        zipCodes[4] = 400;
        zipCodes[5] = 300;

        System.out.println(Arrays.toString(zipCodes)); // [600, 700, 800, 900, 400, 300]
        System.out.println(zipCodes[3]);//900
        // want to print every zipcode one by one
        /*
        600
        700
        800
        ...
         */
        // [600, 700, 800, 900, 400, 300]
        for (int i = 0; i < zipCodes.length; i++) {

            System.out.println(zipCodes[i]);

        }
        System.out.println("=====================");

        String[] studentNames = new String[5];
        System.out.println(Arrays.toString(studentNames));
        studentNames[3] = "John";
        studentNames[0] = "Ana";
        studentNames[1] = "David";
        studentNames[4] = "jenny";

        // want to print every student name one by one
        for (int index = 0; index < studentNames.length; index++) {
            System.out.println(studentNames[index]);
        }
        // ======== >> print if the name starts with letter 'j'
        System.out.println("==solution by using while loop====");
        int index = 0;
        while (index < studentNames.length) {
            System.out.println(studentNames[index]);
            index++;
        }

        System.out.println("======== >> print if the name starts with letter 'j'");

        for (int a = 0; a < studentNames.length; a++) {
            //  System.out.println( studentNames[a]);
           // studentNames[a] = studentNames[a].toUpperCase();
            if (studentNames[a] != null && (studentNames[a].startsWith("J") || studentNames[a].startsWith("j"))) {
                System.out.println(studentNames[a] +" index for this name is: "+a);

            }

        }


    }
}
