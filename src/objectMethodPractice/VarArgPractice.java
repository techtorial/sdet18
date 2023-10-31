package objectMethodPractice;

public class VarArgPractice {


    /*
    create a method that will take an int array as parameter
    finding sum of those number, print sum at the end
     */

    public static void sumOfNumbers(int[] numbers){
        int sum = 0;
        for (int i=0; i< numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println(sum);
    }

    public static void sumOfNumbers2( int ... numbers){

        int sum = 0;
        for (int i=0; i< numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println(sum);

    }
// create a method with those var args parameters (...)  as taking strings
  //   this method should print each string as in following format:
    // 1. John
    // 2. David
    // ....

    public static void printNames(String ... names){
        int number = 1;
        for (String name : names){
            System.out.println(number++ + ". "+name);
        }

    }

    public static void main(String[] args) {
        int[] houseNumbers = {10,20,30,40};

        sumOfNumbers(houseNumbers);
        sumOfNumbers2(1,2,3);
        sumOfNumbers2(100, 200, 300,400);
        printNames("John", "David", "Bob");

    }




}
