package OOP_Practice.inheritance.staticPractice;

public class JavaBook  extends Book {


    @Override
    public int sale(){

        System.out.println("JAVA book on SALE");
        return 2000;
    }


    public static void read(){
        System.out.println("READING JAVA BOOK");
    }

    public static void main(String[] args) {

        Book book1 = new Book();
        System.out.println( book1.getTitle());

        book1.setTitle("Harry Potter");
        System.out.println( book1.getTitle());

        book1.author = "EFE";

        System.out.println(  book1.author );
        System.out.println(   Book.author  );

        Book book2 = new Book();

        System.out.println( book2.author );// not recommended
        System.out.println(Book.author);

        System.out.println("============");

        JavaBook jb1 = new JavaBook();

        System.out.println( jb1.getTitle());
        System.out.println(  jb1.author ); // not recommended
        System.out.println(  JavaBook.author );
        JavaBook.author = "James Bond";
        System.out.println(Book.author);


        System.out.println("=========");
        jb1.sale();

        book1.sale();

        Book.read();
        JavaBook.read();
        book1.read();
        jb1.read();

        Book.read(5);

    }
}
