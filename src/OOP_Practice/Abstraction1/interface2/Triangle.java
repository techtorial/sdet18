package OOP_Practice.Abstraction1.interface2;

public class Triangle implements Shape, Storage{

    private  double height, base, side1, side2;

    public Triangle(double height, double base, double side1, double side2) {
        this.height = height;
        this.base = base;

        this.side1 = side1;
        this.side2 = side2;

    }

    public Triangle(double base, double side1, double side2) {
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;

    }

    @Override
    public double findArea() {
        System.out.println("AREA Calculator in Triangle");
        return (base * height) / 2;
    }

    @Override
    public double findPerimeter() {

        System.out.println("Perimeter calculator in Triangle");
        return side1 + side2 + base;
    }
}
