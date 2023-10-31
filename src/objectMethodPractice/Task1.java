package objectMethodPractice;

public class Task1 {

    /*
    create 4 cup object by using last constructor
    store your newly created cup objects in an array
    from your array, print out total prices of those 4 cups

     */
    public static void main(String[] args) {


        Cup c1 = new Cup("white", "nike", 10, 1.99);
        Cup c2 = new Cup("white", "nike", 10, 2.99);
        Cup c3 = new Cup("white", "nike", 10, 3.99);
        Cup c4 = new Cup("white", "nike", 10, 4.99);

     //   System.out.println( c1.price);

        Cup[] items = { c1, c2, c3, c4 };

        double total = 0;
        for ( int i=0; i< items.length; i++){

         //   System.out.println(items[i].price);

            total += items[i].price;

        }

        System.out.println("Total price of cups is: "+total);







    }

}
