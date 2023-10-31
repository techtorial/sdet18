package OOP_Practice.inheritance.staticPractice;

public class Book {

    private String title;
    double price;
    static String author;
    int pageCount;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    /// == static method====

    public static void  read(){
        System.out.println("READING BOOK");
    }

    //==OVERLOAD READ METHOD===

    public static  void read(int minute){
        System.out.println("Reading my book for "+minute+" minutes");
    }



    public int sale(){
        System.out.println("SALE in the BOOK");
        return 1000;
    }




}
