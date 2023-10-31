package objectMethodPractice;

public class MethodPractice1 {

int a;
String color;

    /*

    create a method
    that will take a parameter of Cat   >>> (Cat c)
     this method will print following
    if the name of the cat is 'Tom' and the age of the cat is less than 5
        print >> This is tom who is Jerry's friend
    otherwise
        print >> This is a random cat
     */

    public void catFinder(Cat cat){

        if ( cat.name.equalsIgnoreCase("TOM") && cat.age < 5){
            System.out.println("This is tom who is Jerry's friend");
        }else {
            System.out.println("Random cat");
        }
    }

    public static void main(String[] args) {

       MethodPractice1 p1 = new MethodPractice1();

        Cat cat1 = new Cat();
        cat1.name = "Tom";
        cat1.age = 2;

        p1.catFinder(cat1);




    }



}
