package arrayPractice;

public class Practice7 {
    public static void main(String[] args) {

        char[] symbols = {'L', 'K','5', '$', '@', 'b', 'W', '1','!'};
        System.out.println(symbols.length);

       // print only symbols from this array

        for (int i=0; i< symbols.length;i ++){


            if (!((symbols[i] >='A' && symbols[i] <='Z') || (symbols[i]>= 'a' && symbols[i] <='z') || (symbols[i]>='0' && symbols[i] <='9'))){
                System.out.println(symbols[i]);
            }




        }


    }
}
