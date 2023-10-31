package objectMethodPractice;

public class Phone {

    String brand;

    public Phone(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Phone brand is: " + brand;
    }

    @Override
    protected void finalize() {
        System.out.println("Found an object for garbage");

    }

    public static void main(String[] args) {

        Phone phone1 = new Phone("Samsung");
        Phone phone2 = new Phone("IPhone");
        Phone phone3 = new Phone("Google");
        Phone phone4 = new Phone("Huawei");
        Phone phone5 = new Phone(null);

        phone3 = null;

        phone5 = phone3;

        System.gc();




    }


}
