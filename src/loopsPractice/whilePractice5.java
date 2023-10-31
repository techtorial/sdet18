package loopsPractice;

public class whilePractice5 {
    public static void main(String[] args){
        /*
        user will give any string value
        take that string value and print each letter one by one
        Ex: "winter is coming" >>> w, i, n, .... n, g
         */
        String str = "winter is coming";

//        System.out.println( str.charAt(0));
//        System.out.println( str.charAt(1));
//        System.out.println( str.charAt(2));

        int indexNumber  = 0;

        while (indexNumber < str.length()){
            System.out.print( str.charAt(indexNumber) + ", ");
            indexNumber++;
        }
        System.out.println();
        System.out.println("===following code will print last letter without comma at the end====");

        indexNumber  = 0;
        str = "winter is coming";
        while (indexNumber < str.length()){

            if (indexNumber==str.length()-1){
                System.out.print(str.charAt(indexNumber));
            }else {
                System.out.print(str.charAt(indexNumber)+", ");
            }

            indexNumber++;
        }
        System.out.println("\n-----------no spaces to print--------");
        indexNumber  = 0;
        str = str.replace(" ", "");
        while (indexNumber < str.length()){

            if (indexNumber==str.length()-1){
                System.out.print(str.charAt(indexNumber));
            }else {
                System.out.print(str.charAt(indexNumber)+", ");
            }
            indexNumber++;
        }
    }
}
