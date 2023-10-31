package ifStatement;

public class ElseIfPractice1 {
    public static void main(String[] args) {


        int number = 16;
        // 0-5
        // 5-10
        // 10-15
        if (number> 0 && number < 5){
            System.out.println("Range is 0 - 4");
        }else if(number >= 5 && number < 10) {
            System.out.println("Range is 5 - 9");
        }else if(number >=10 && number <15){
            System.out.println("Range is 10 - 14");
        } else{
            System.out.println("out of range");
        }





    }
}
