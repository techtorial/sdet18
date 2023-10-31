package switchStatement;

public class Practice2 {
    public static void main(String[] args) {

        char symbol = '!';
        switch (symbol) {

            case 'a':
                int num = 2, num2 = 4;
                double result = num * num2;
                System.out.println(result + " result from case 'a'");
                break;
            case 'b':
                System.out.println("In the case 'b'");
                break;
            case 'z':
                System.out.println(100 / 25 * 3 + " result from case 'z'");
                break;
            default:
                System.out.println("This is from Default case");
                break;
        }

    }
}
