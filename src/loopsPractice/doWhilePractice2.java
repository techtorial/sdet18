package loopsPractice;

public class doWhilePractice2 {
    public static void main(String[] args) {
        /*
        find the sum of numbers in between 10 and 20
        use do-while loop in your implementation
         */
        int i=1, j=5,r=0;

        do {
            r = r + i;
            i++;
        }while(i<=j);
        System.out.println("Result is: "+r);

    }
}
