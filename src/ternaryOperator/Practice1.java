package ternaryOperator;

public class Practice1 {
    public static void main(String[] args) {

        int num1 = 5, num2 = 7;

        // ? :
        // storing result of ternary into a new variable since the both options are same data type
        int result1 = num1 <= num2 ? 3 + 9 : 4 * 8;

        System.out.println(result1);
        // storing result of ternary into a new variable since the both options are same data type
        String result2 = num2 < num1 ? "Coffee" : "Tea";

        System.out.println(result2);

        System.out.println(num2 == num1 ? "Hi John" : 6 - 1);// 5

        System.out.println('A' < 90 ? 'c' : 100);
        System.out.println("test".equals("test123") ? "Found IT" : 100 / 25);

        //  String str = "test".equals("test123") ?  "Found IT": 100/25; >> you cannot store result of ternary
        //                                                                  if the options' data types are different

        System.out.println((int) ('A' > 90 ? 'c' : 100));

        char ch = 'A' > 90 ? 'c' : 100;
        int ch2 = 'A' > 90 ? 'c' : 100;
    }


}
