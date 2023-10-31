package wrapperClasses;

import accessModifier.Animal;

public class Practice1 {
    public static void main(String[] args) {


        System.out.println("++++++++++++++++++++++++++++++");

        Animal animal = new Animal();
        animal.namePublic = "Joe";
        animal.runPublic();

        Practice1 p1 = new Practice1();



        System.out.println("++++++++++++++++++++++++++++++");

        byte b1 = 7;
        Byte b = new Byte(b1);
        Byte b2 = 3; // AutoBoxing

        short s = 45;

        Short sh = new Short(s);

        Short sh1 = new Short((short)40);
        System.out.println(sh);// 45

        Integer i = new Integer(10);

        Integer i1 = 20; // AutoBoxing
        int number = 19;
        Integer i2 = number;
        System.out.println( i2 + 10); //29

        Character ch = new Character('t');
        Character ch2 = 'e';// AutoBoxing


        Boolean bl = new Boolean(true);
        Boolean bl1 = new Boolean("true");
        Boolean bl2 = true;
        System.out.println(bl1);
        System.out.println(bl2);

        //==============

        boolean bl3 = new Boolean(true);

        int number2 = new Integer(100);
        double number3 = new Integer(200); // UnBoxing
        // object of wrapper class is converted to primitive is called 'UnBoxing'

        /*
        AutoBoxing: is when primitive converted to Wrapper class object, it is called 'autoboxing'
         */







    }
}
