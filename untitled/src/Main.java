import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    static Scanner _input = new Scanner(System.in);

    public static void main(String[] args) {

        int tal = getValidInput();
        System.out.println(tal);
    }

    private static int getValidInput() {
        do {
            try {
                int number = _input.nextInt();
                return number;
            }
            catch (Exception e){
                System.out.println("Choose a number dumbass!!");
                _input.nextLine();
            }
        } while(true);
    }

    public static long getValidLongInput()
    {
        String inString = _input.nextLine().trim();

        for (Character c: inString.toCharArray()) {
            if (c != '-' && !Character.isDigit(c)) {
                System.out.println("enter a number dumbass");
                return getValidLongInput();
            }
        }

        BigInteger bigInteger = new BigInteger(inString);

        if(bigInteger.compareTo(new BigInteger("9223372036854775807")) > 0 ||
                bigInteger.compareTo(new BigInteger("-9223372036854775807")) < 0) {
            System.out.println("The number is to large or to small");
            System.out.println("MAX is 9223372036854775807");
            System.out.println("MIN is -9223372036854775807");
            return getValidLongInput();
        }

        return Long.parseLong(inString);
    }


}
