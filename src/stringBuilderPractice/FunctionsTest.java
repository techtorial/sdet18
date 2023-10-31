package stringBuilderPractice;

public class FunctionsTest {
    public static void main(String[] args) {

        StringBuilder[] words = {new StringBuilder("PRACTICES"),
                new StringBuilder("WORK"), new StringBuilder("BATCH")};

        FunctionsPractice.reverseBuilders(words);

        System.out.println("---------------------");

        System.out.println(FunctionsPractice.middleCharReplacement(words));
        FunctionsPractice.sumOfDigits(new StringBuilder("d5yy74&5*Tyi"));
    }
}
