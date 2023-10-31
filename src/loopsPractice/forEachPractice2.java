package loopsPractice;

import java.util.Arrays;

public class forEachPractice2 {
    public static void main(String[] args) {
        /*
        {"Aiza", "David", "Diana", "John"}
        >> aiza@gmail.com
            david@gmail.com
            ...
        >> store newly created e-mails into another array for future usage
        >> print emails array to show all created emails for employees

         */
        String[] employees =  {"Aiza", "David", "Diana", "John"};
        String[] emails = new String[employees.length];
        int i =0;
        for (String name : employees){

            String email = name.toLowerCase().concat("@gmail.com");
            System.out.println(email);

            emails[i] = email;
            i++;

        }
        System.out.println(Arrays.toString(emails));
        // did not like those e-mails
        // if the name of the person starts with j / d, e-mail should be >> @yahoo.com
        int a = 0;
        for ( String name: employees){

            if (name.startsWith("J") || name.startsWith("j") || name.startsWith("D") || name.startsWith("d")){

                emails[a] = name.toLowerCase().concat("@yahoo.com");
            }else{

                emails[a] = name.toLowerCase().concat("@gmail.com");
            }
            a++;
        }
        System.out.println(Arrays.toString(emails));




    }
}
