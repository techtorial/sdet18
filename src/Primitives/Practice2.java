package Primitives;
public class Practice2 {
    public static void main(String[] args){

        //declaring variable
        int number;
      //  System.out.println( number ); // it is compile time error since there is no value for number

        // initializing variable
         number = 60;
        System.out.println(number); // 60
        System.out.println( number + 10 ); // 70
        System.out.println( number ); // 60

        // reassignment
        number = 8;
        System.out.println(number);
        System.out.println(number +10);//18

        int age = 21;

        age = 30;
        System.out.println(age);

        /*
        variable naming
        -it needs to start with letter, $ or _
        -you can use numbers after first character of name of variable
        -you cannot use same name multiple times
        -you cannot use java keywords for variable names. such as: static, void, class ...
         */
        int a = 8;
        //int a = 10;

       // int void = 7;





    }

}
