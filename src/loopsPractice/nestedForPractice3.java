package loopsPractice;

public class nestedForPractice3 {
    public static void main(String[] args) {
        /*
        from 2023 to 2027 print years and months as in following format

        2023 --> 1 - JAN, 2 - FEB, 3 - MARCH, ...,12 - DEC,
        2024 --> 1 - JAN, 2 - FEB, 3 - MARCH, ...,12 - DEC,
        ....

        2027 --> 1 - JAN, 2 - FEB, 3 - MARCH, ...,12 - DEC,
         */

        for (int year = 2023; year <= 2027; year++) {

            System.out.print(year + " --> ");

            for (int month = 1; month <= 12; month++) {


                switch (month) {
                    case 1:
                        System.out.print(month + "- JAN,");
                        break;
                    case 2:
                        System.out.print(month + "- FEB,");
                        break;
                    case 3:
                        System.out.print(month + "- MARCH,");
                        break;
                    case 4:
                        System.out.print(month + "- APRIL,");
                        break;
                    case 5:
                        System.out.print(month + "- MAY,");
                        break;
                    case 6:
                        System.out.print(month + "- JUN,");
                        break;
                    case 7:
                        System.out.print(month + "- JULY,");
                        break;

                    case 8:
                        System.out.print(month + "- AUG,");
                        break;
                    case 9:
                        System.out.print(month + "- SEP,");
                        break;
                    case 10:
                        System.out.print(month + "- OCT,");
                        break;
                    case 11:
                        System.out.print(month + "- NOV,");
                        break;
                    case 12:
                        System.out.print(month + "- DEC");
                        break;

                }
            }
            System.out.println();

        }


    }
}
