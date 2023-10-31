package ifStatement;

public class IfCurlyBrackets {
    public static void main(String[] args) {
        int number = 6, ageKid = 7;
        if (number < ageKid) {
            System.out.println("Your number is smaller than the age");
            System.out.println("This is another Print");
            System.out.println("this is THIRD print");
        }

        // FALSE
        if (number > ageKid) {
            System.out.println("***********");
            System.out.println("&&&&&&&&&&&&");
            System.out.println("!!!!!!!!!!!!!");
        }

        System.out.println("---------------");
        int count = 9, capacity = 10;
        if (count > capacity)
            System.out.println("There is enough space");
        System.out.println("Go to apple picking since it is the season");
        System.out.println("THIRD PRINT for new IF statement");

        //===============
        int x = 3, y = 5;
        if ( y > x)
            ++x ;
            y++;
        System.out.println(++y); // 7
        System.out.println( x + y++); // 11
        System.out.println(y);
        System.out.println("----------");
        x = 3; y = 5;
        if ( y < x)
            ++x ;
            y++;
        System.out.println(++y); // 7
        System.out.println( x + y++);

        // can we use else if with, if there is no curly brackets

        if (5 != 5)
            System.out.println("Some Print");
       // System.out.println("sfgjsfg"); >> you cannot have multiple statements if there is no curly brackets for 'if' and
                                            // you are having else statement with that
        else{
            System.out.println("This is first Example");
        }

        System.out.println("--------------");
        if (5 == 5)
            System.out.println("Some Print");
            // System.out.println("sfgjsfg"); >> you cannot have multiple statements if there is no curly brackets for 'if' and
            // you are having else statement with that
        else
            System.out.println("This is first Example");
        System.out.println("This is my LAST after ELSE");

    }
}
