package OOP_Practice.Abstraction1.interface2;

public class Rectangle implements Storage, Shape{

    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double findArea() {
        System.out.println("Area in the RECTANGLE");
        return length * width;
    }

    @Override
    public double findPerimeter() {
        System.out.println("PERIMETER in the RECTANGLE");
        return (length + width) * 2;
    }
}
