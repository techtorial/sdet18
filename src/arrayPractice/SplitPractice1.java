package arrayPractice;

import java.util.Arrays;

public class SplitPractice1 {
    public static void main(String[] args) {
        String sentence = "Java is getting so easy";

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));
        // put ** after each of word and print them
        for (String str : words) {
            System.out.println(str + "**");
        }


        String  str = "telecommunication";
        // split above word from 'c'
        // print >> "Hello" for each element after splitting the word
        // [vcasd,asdfS,sdfsdf,sDFs....]
        String[] a = str.split("c");

        for ( String w : a){
            System.out.println("Hello >> "+ w);
        }


    }
}
