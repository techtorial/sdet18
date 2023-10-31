package wrapperClasses;

public class TestMicrophone {
    public static void main(String[] args) {

        Microphone m1 = new Microphone("A", "White","10");
        Microphone m2 = new Microphone("B", "Blue","100");
        Microphone m3 = new Microphone("c", "Red","20");
        Microphone m4 = new Microphone("D", "Black","1.99");

        Microphone[] mics = {m1,m2,m3,m4};

        Microphone.priceChecker(mics);

    }
}
