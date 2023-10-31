package JavaRecap;

public class JavaPrimitiveAscii {

    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-What is Java and what do you know about JDK,JVM and JRE?

    Java:Is a programming language.To make a connection between computer and people.

     JDK:JAva Development Kit --> It has some libraries which supports the "Application Development)
     JRE:Java RunTime Environment --> It is all about creating an environment for JVM to execute
     the codes.
     JVM:Java Virtual Machine -->It is responsible for converting byte code to binary code(1,0)

     b --> 0001010100010110101010101

     PRIMITIVE DATA:It is a way to store the data in it.It does not take up too much space in
     the memory.

     Where do we use:

      -->Temperature Measurement
      -->Sports Statistics
      -->GPS Coordinate

      WHOLE NUMBERS:             DECIMAL NUMBERS:       CONDITION:          Character:
      byte                       double                 boolean             Char
      short                      float
      int
      long

      -->ASCII TABLE:It is a table for all characters(alphabet,digits,symbols etc)
       -->They use it for security purposes.

      short a=5;
      short b=6;
      short c=a+b;
      sout(c)
     */
    public static void main(String[] args) {
        short a=5;
        short b=6;
        short c=(short)(a+b);
        int number=323423423;
        double number2=number+4.2;
        float number3=5.3f;
        long number4=1242432342254423435l;
        char letter='g';
        char letter2=65;
        int letter3='g';
        double letter4='g';
        System.out.println(letter);//g
        System.out.println(letter2);//A
        System.out.println(letter3);//103
        System.out.println(letter4);//103.0
        boolean result=number4>number3;
        System.out.println(result);



    }
}
