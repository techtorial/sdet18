package OOP_Practice.Abstraction1.interface2;

public class Test {

    public static void main(String[] args) {


        Triangle t = new Triangle(2,5,10,10);

       double areaOfTriangle =  t.findArea();// 5
        System.out.println(areaOfTriangle);

        double perimeterOfTriangle = t.findPerimeter();// 25,
        System.out.println(perimeterOfTriangle);

        System.out.println("==========");

        Rectangle r = new Rectangle(20, 15);
        System.out.println(  r.findArea()  );
        System.out.println(   r.findPerimeter() );
    }

}
