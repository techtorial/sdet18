package objectMethodPractice;

public class Netflix {

    String user;
    static  int data = 100;

    public void usage(int streamingAmount){

        if (data > 0) {
            data -= streamingAmount;
            System.out.println("Remaining data is : " + data);
        }else {
            System.out.println("Please purchase data, make Payment");
        }
    }

    public Netflix(String user) {
        this.user = user;
    }

    public static void main(String[] args) {
        Netflix kids = new Netflix("Heroes");
        kids.usage(30);



    }



}
