package stringBuilderPractice;

public class Practice3 {
    public static void main(String[] args) {
        // print out lowercase letters from alphabet by using StringBuilder
        StringBuilder builder = new StringBuilder();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            //System.out.println(ch);
            builder.append(ch);
            System.out.println( builder );

        }
        System.out.println("++++++++++++");
        System.out.println( builder);

        // toString()

        String str = builder.toString();

       // String str2 = builder; it is compile-time error


        // print above lowercase alphabet - builder object -  in reverse order
        // zywv....cba

        // abcdefghijklmnopqrstuvwxyz

        StringBuilder b2 = new StringBuilder();
        for ( int i = builder.length()-1; i >=0; i--){

            b2.append(builder.charAt(i));
        }
        System.out.println(b2);

        // reverse() >> it will reverse given string builder object

        System.out.println(b2.reverse());

    }

}
