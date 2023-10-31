package arrayPractice;

public class Practice12 {
    public static void main(String[] args) {
        int[] pattern = {1, 2, 3, 4, 5,6, 8};
        // find out missing number from pattern
        // >> ..5.. is the missing number from pattern
        int sum1 = 0;

        for (int a : pattern) {
            sum1 += a;
        }

        int sum2 = 0;
        for (int i = 1; i <= 8; i++) {
            sum2 += i;
        }
        System.out.println("Missing number is: " + (sum2 - sum1));
    }
}
