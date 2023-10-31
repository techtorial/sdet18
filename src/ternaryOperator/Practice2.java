package ternaryOperator;

public class Practice2 {

    public static void main(String[] args) {

        String school = "Techtorial";

        String r1 = school.contains(school.toLowerCase().substring(0, 5)) ? school.concat("Academy") : school.replace("Tech", "IT");

        System.out.println(r1);

        int x = 7, y = 5;

        int result = --x >= ++y ? ++y : y++ + ++x;

        System.out.println(result);// 7

        System.out.println(x); // 6

        // nested ternary

        String result1 = 5 == 5 ? 8 > 5 ? "Morning" : "Evening" : "Coffee";

        System.out.println(result1);
        String result2 = 5 == 2 ? 8 > 5 ? "Morning" : "Evening"  : "Coffee";

        System.out.println(result2);

        String result3 = 5 == 2 ? 8 < 5 ? "Morning" : "Evening"  : "Coffee";

        System.out.println(result3);

        String result4 = 5 == 5 ? 8 < 5 ? "Morning" : "Evening"  : "Coffee";

        System.out.println(result4);
        String result5 = 5 != 5 ? "HELLO" : 8 != 5 ? "Morning" : "Evening" ;

        System.out.println(result5);

        // user response as string >> yes/no

        String userResponse = "yes";

        int yesNo = userResponse.equalsIgnoreCase("yes")? 1 : 0;
        if (yesNo==1){
            System.out.println("you said YES to me");
        }else {
            System.out.println("You said something else than YES");
        }


    }
}
