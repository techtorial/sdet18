package loopsPractice;

public class doWhilePractice5 {
    public static void main(String[] args) {

        String sentence = "I want to solve this question";
        // count numbers of letter 'o' in this string
        int index = 0, counter = 0;
        do{

            if (sentence.charAt(index) == 'o'){
                System.out.println("I found an 'o'");
                counter++;
                System.out.println("Counter is now "+counter);
            }
            index++;

        }while( index < sentence.length()   );
        System.out.println(counter);

    }
}
