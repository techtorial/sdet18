package exceptionPractice;

public class Practice2 {
    public static void main(String[] args) {

        // parsing >> from string to other data type

        String str = "35";
        // convert str to integer
        // int number = Integer.parseInt(str);
        try {
            int number1 = Integer.parseInt(str);
            System.out.println("This is In TRY block");

            int result = 12 / 0;
            System.out.println(result); // 12,


        } catch (NumberFormatException e1) {
            System.out.println("This is my FIRST catch block");
            System.out.println(e1.getCause());
            System.out.println(e1.getMessage());
        } catch (ArithmeticException e2) {
            System.out.println("This is SECOND catch block");
        }


        System.out.println("I am happy that I can do Parsing");
        int[] nums = {1, 2, 3, 4};
        method1(nums);
        System.out.println("This is LAST LINE");

    }


    public static void method1(int[] numbers) {
        try {
            int sum = 0;
            for (int i = 0; i <= numbers.length; i++) {
                sum += numbers[i];
            }
            System.out.println("The total is " + sum);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Your logic is going beyond to the last index");
            System.out.println(exception.getMessage());
        }


    }


}
