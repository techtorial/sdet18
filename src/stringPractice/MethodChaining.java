package stringPractice;

public class MethodChaining {
    public static void main(String[] args) {

        String str = "WElcOme";

        // make entire string as lowercase
        // replace letter 'e' with '#'
        // take substring from first '#'
        // get length of  substring

        str = str.toLowerCase();
        str = str.replace('e', '#');
        String part = str.substring(str.indexOf('#'));
        int lengthOfPart = part.length();

        System.out.println(str);
        System.out.println(part);
        System.out.println( lengthOfPart );

        // method chaining
        System.out.println("------------");
        str = "WElcOme";
        int number = str.toLowerCase().replace('e','#').substring(str.indexOf('E')).length();

        System.out.println(number);


    }
}
