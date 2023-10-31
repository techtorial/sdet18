package arrayPractice;

public class Practice11 {
    public static void main(String[] args) {
       int[] numbers = {12 , 16 , 15 , 18, 14, 9 , 21, 7};
        // find out pairs of numbers from given array if they make 30 as total
        // 12 and 18 makes 30
        // 16 and 14 makes 30
        // 9 and 21 makes 30
        for (int i = 0 ; i< numbers.length; i++){

            for (int k=i+1; k < numbers.length;k++){


                if ( numbers[i] + numbers[k] == 30){
                    System.out.println( numbers[i] +" and  "+numbers[k] +" makes " + (numbers[i]+ numbers[k])  );
                }


            }





        }

    }
}
