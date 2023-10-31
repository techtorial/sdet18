package Primitives;
public class Boolean {
    public static void main(String[] args) {

        boolean isCoffeeHot = true;

        System.out.println( isCoffeeHot );

        boolean hasMoney = false;
        System.out.println(hasMoney);
        System.out.println(hasMoney);
        System.out.println(hasMoney);

        hasMoney = true;
        System.out.println(hasMoney);// true

        // !
        System.out.println(!hasMoney); // false
        System.out.println(hasMoney); //

        System.out.println("------------");
        boolean isLightOn = hasMoney;
        System.out.println( isLightOn );

        boolean isCold = !hasMoney;
        System.out.println(isCold); //false
    }
}
