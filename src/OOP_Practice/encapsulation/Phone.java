package OOP_Practice.encapsulation;

public class Phone {
    // immutable
    private Double price=99.9;
    private String brand = "JAVA";
    private String color = "Blue";

//    public void setPrice(Double price) {
//        this.price = price;
//    }

    public Double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }
}
