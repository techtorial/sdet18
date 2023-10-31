package OOP_Practice.inheritance.finalPractice;

public class Store {
    public static void main(String[] args) {

        Shirt shirt = new Shirt();
        System.out.println( shirt.COLOR);

        Shirt shirt1 = new Shirt();
        System.out.println( shirt1.COLOR);
       // shirt1.COLOR = "RED"; you cannot change value for a final variable
        Shirt shirt2 = new Shirt();
        System.out.println( shirt2.COLOR);

        shirt.sale();
        shirt.wear();

        T_Shirt t_shirt = new T_Shirt();
        System.out.println(t_shirt.countOfSale);
        t_shirt.countOfSale = 200;
        System.out.println( t_shirt.countOfSale);

    }
}
