package loopsPractice;
public class forPractice5_PalindromeString {
    public static void main(String[] args) {

        // check if given string is palindrome or not

        String str = "EFE"; // GNIHTEMOS
        String reversed= "";
        for (int i = str.length()-1; i >=0; i-- ){

            reversed += str.charAt(i);
            //System.out.println(reversed);
        }
        System.out.println(reversed);
        System.out.println(str);
        if (str.equals( reversed)){
            System.out.println("Your string is PALINDROME");
        }else {
            System.out.println("NOT A PALINDROME");
        }



    }
}
