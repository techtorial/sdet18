package arrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        // ask user, how many names s/he wants to store
        //  get those names from user one by one
        // store those names in an array
        // at the end print entire array with names

        // want to store names that are 6 character and longer in to a separate array

        System.out.println("How many names you want to store?");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[size];

        String[] longNames = new String[size];

        for (int i = 0; i < names.length; i++) {

            System.out.println("Please enter " + (i + 1) + " name");
            String name = scanner.nextLine();
            if (name.length() >= 6) {
                longNames[i] = name;
            } else {
                names[i] = name;
            }

        }

        System.out.println("These are the names you gave me >> " + Arrays.toString(names));
        System.out.println("Long Names array >> "+Arrays.toString(longNames));

    }
}
