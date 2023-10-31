package wrapperClasses;

public class Practice2 {
    public static void main(String[] args) {

        System.out.println("10" + "10"); // 1010

        String str1 = "10";
        String str2 = "10";
        //Convert string to number
        //parsing >> converting string to related data type

        int numberString = Integer.parseInt(str1);
        System.out.println(numberString + 10);//
        Integer numberString2 = Integer.parseInt(str2);// AutoBoxing

        Double dNumber = Double.parseDouble("50.50");
        System.out.println(dNumber * 2);

        String str3 = "false";
        Boolean realBoolean = Boolean.parseBoolean(str3);
        System.out.println(realBoolean);//
        System.out.println(realBoolean == false);//

        String str4 = "w";
        // you cannot parse string to Character

        // valueOf();
        Short sh2 = new Short(String.valueOf("3"));
        System.out.println(sh2 + 2);// 5

        String str5 = String.valueOf(3.5);
        System.out.println(str5 + 3.5);//


        String str6 = String.valueOf(true);
        System.out.println(str6.equals(true));//
        System.out.println(str6.equals("true"));//

        String str7 = String.valueOf('y');
        System.out.println(str7 + 100); //
        System.out.println('y'+100);//

    }
}
