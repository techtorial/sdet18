package JavaRecap;

import java.util.Arrays;

public class SplitMethod {

    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-Technical questions might be related with this String method?

      -->Split is a method to cut the specific word/words from the value.

     */
    public static void main(String[] args) {
        String str="Hello Java is so cool";
        //olleH avaJ si os looc
        /*
        1-Understand the questions and then ask more details to interview what they want
        2-Think about the logic that you will use to solve the question
        3-You should have the mind of SPLIT method
        4-You should use Loops
         */
        String [] words=str.split(" ");//Hello,Java,is,so cool

         for(int i=0;i< words.length;i++){
//             System.out.println(Arrays.toString(words)); //Hello
             String reverse="";
            for(int k= words[i].length()-1;k>=0;k--){
                reverse+=words[i].charAt(k);
            }
             System.out.println(reverse);
         }

    }
}
