package OOP_Practice.inheritance.inheritance2;

public class Test {
    public static void main(String[] args) {
        Flower flower = new Flower("Purple", "ParentFlower",4.00, 10);

        System.out.println(   flower.color  ); // purple

        Rose rose = new Rose();
        System.out.println( rose.color); //

        Flower flower1 = new Flower();

        Rose rose1 = new Rose("RED", "RED-ROSE", 9.99, 10);
        System.out.println( rose1.color);

        Flower f3 = new Flower();
        System.out.println( f3.color);

    }
}
