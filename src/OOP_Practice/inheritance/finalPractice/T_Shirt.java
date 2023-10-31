package OOP_Practice.inheritance.finalPractice;

final public  class T_Shirt extends Shirt{

// override wear method
    //** you cannot override FINAL methods
//
//    public final  void wear(){
//        System.out.println("Put the T-Shirt ON");
//    }

    int countOfSale = 100;

    @Override
    public void wear(String size){
        System.out.println("Overriding wear method which is not final");
    }

}
