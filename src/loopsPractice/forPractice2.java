package loopsPractice;

public class forPractice2 {
    public static void main(String[] args) {

        // finding sum of numbers, between 10 and 20 by using for loop
        // > "The total is ...."
        int total = 0;
        for (int n1 = 10; n1 <= 20; n1++) {

            total += n1;
            System.out.println(total);
        }
        System.out.println("The total is " + total);

        // print each char from given string separated by dash(-) by using for loop
        String str = "chicago loop is the best!";// c-h-i-.....
        //charAt(index)
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.print(ch + "-");
        }
        System.out.println();

        String str2 = "Java is getting very easy to work with!";
        // print only letter 't's from the string

        for (int index = 0; index < str2.length(); index++) {

            char ch = str2.charAt(index);

            if (ch == 't') {
                System.out.println("Here is the letter >> " + ch);
            }
        }


        str2 = "Java is getting very easy to work with!v";
        // if the amount of letter 'e' and amount of letter 'v' in the string are equal
        // >> "BINGO"
        int countOfe = 0;
        int countOfv = 0;
        for (int i = 0; i < str2.length(); i++) {

            char ch = str2.charAt(i);
            if (ch == 'e') {
                countOfe++;
            }
            if (ch == 'v') {
                countOfv++;
            }

        }
        System.out.println("e > "+ countOfe + "- v >"+countOfv);
        if (countOfe == countOfv) {
            System.out.println("BINGO");
        }


    }
}
