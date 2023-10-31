package stringBuilderPractice;

public class Practice1 {
    public static void main(String[] args) {

        //StringBuilder builder = "Example"; //> compile time error

        StringBuilder builder = new StringBuilder("TEST");

        System.out.println(builder);
        StringBuilder builder1 = new StringBuilder();
        //builder1 = "TEST2"; //> compile time error
        builder1.append("Saturday");
        System.out.println(builder1);

        builder1.append("SUNDAY");
        System.out.println( builder1); //


        builder1.append(" are weekend days");
        System.out.println(builder1);

        builder1 = builder1.append(12345);
        System.out.println( builder1); //12345, SaturdaySUNDAY12345, SaturdaySunday are weekend days,

        StringBuilder builder2 = builder1;

        System.out.println(builder2);
        System.out.println( builder1 == builder2);//
        StringBuilder builder3 = new StringBuilder();
        builder3.append("SaturdaySUNDAY are weekend days12345");
        System.out.println(builder3);
        System.out.println( builder1 == builder3);
        builder1.append(true).append(2222).append('4').append( new Character('t'));
        System.out.println( builder1);
        builder1.append(1111+"test"+'3'+true);
        System.out.println(builder1);

        System.out.println("+++++++++++++");
        //append
        //charAt()

        char c = builder.charAt(1);
        System.out.println( c );

        // length
        System.out.println(  builder.length()  );
        // indexOf()
        System.out.println( builder.indexOf("ET")  ); // TEST
        System.out.println( builder.indexOf("ST")); //

        //replace()

        builder.replace(1,2, "$$$$$$$$$");
        System.out.println(builder);
        System.out.println( builder.length());
        //builder.replace(0,11, "A");
        System.out.println(builder);

        // substring
        System.out.println(builder.substring(3));// from 3 till end
        System.out.println( builder.substring( 2,8) ); //
        System.out.println(builder);
        builder.append("abcd");
        System.out.println(builder);
        StringBuilder b3 = new StringBuilder("Aiza");
        builder = b3;
        System.out.println(builder.substring(2));
        System.out.println( builder);




//        System.out.println("==========");
//        String str = new String();
//        str = str.concat("Apple");
//        System.out.println(str);//
//        str.concat("Orange");
//        System.out.println(str);// Apple
//        System.out.println("==========");



    }
}
