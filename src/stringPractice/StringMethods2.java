package stringPractice;
public class StringMethods2 {
    public static void main(String[] args) {
        String device = "Computer";
        // startsWith
        boolean b1 = device.startsWith("c");// returns boolean
        System.out.println(b1);
        System.out.println(  device.startsWith("Computer"));// T
        System.out.println(device.startsWith("uter"));// F

        // endsWith
        boolean b2 = device.endsWith("puter");// T
        System.out.println(b2);

        System.out.println(device.endsWith("Computer"));// T

        device.concat("true");
        System.out.println(device.concat("true"));
        System.out.println(device.endsWith("true")); //F
        String desk = device.concat(" desk");
        System.out.println(desk.endsWith("desk")); //T

        System.out.println("-----------------");
        // contains
       boolean b3 =  desk.contains("Computer");
        System.out.println(b3);
        System.out.println( ">>>"+desk + "<<<<<");
        System.out.println( desk.contains(" "));
        System.out.println(desk.contains("blue"));//
        System.out.println(desk.contains("t") || desk.contains("y"));

        System.out.println("-----------------");
        //equals()

        String car = "toyota";
        boolean b4 = car.equals("Toyota");
        System.out.println(b4); //False
        System.out.println(car.equals("toyota"));// TRUE

        String vehicle = "toyota";

        System.out.println(  car.equals(vehicle)  ); // TRUE
        String number = "1234";
        System.out.println(  vehicle.equals(number)  );

        System.out.println(  number.equals( car ));//FALSE


    }
}
