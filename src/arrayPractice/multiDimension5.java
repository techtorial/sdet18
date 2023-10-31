package arrayPractice;

public class multiDimension5 {
    public static void main(String[] args) {


        String[][] electronics = {{"LgTV", "SonyTV"}, {"NIKON"}, {"apple", "Lenovo", "HP"}};

        double[][] prices = {{650.99, 1200}, {350.25, 100, 500}, {2000, 1100, 750.99}};


        for (int i = 0; i < prices.length; i++) {

            for (int i1 = 0; i1 < prices[i].length; i1++) {

                if (prices[i][i1] < 1000) {
                    System.out.println(electronics[i][i1] + " is $" + prices[i][i1]);
                }
            }
        }
        int index1 = 0, index2 = 0;

        for (double[] aisle : prices) {

            for (double price : aisle) {

                if (price < 1000) {
                    System.out.println(electronics[index1][index2] + "**** $" + price);
                }
                index2++;
            }
            index1++;
            index2 =0;


        }

    }
}
