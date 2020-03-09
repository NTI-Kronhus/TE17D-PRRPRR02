package sample;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    static Scanner _input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(checkInputIsNumber());
    }

    public static long checkInputIsNumber()
    {
        String inString = _input.nextLine().trim();

        for (Character c: inString.toCharArray()) {
            if (c != '-' && !Character.isDigit(c)) {
                System.out.println("enter a number dumbass");
                return checkInputIsNumber();
            }
        }

        BigInteger bigInteger = new BigInteger(inString);

        if(bigInteger.compareTo(new BigInteger("9223372036854775807")) > 0 ||
                bigInteger.compareTo(new BigInteger("-9223372036854775807")) < 0) {
            System.out.println("The number is to large or to small");
            System.out.println("MAX is 9223372036854775807");
            System.out.println("MIN is -9223372036854775807");
            return checkInputIsNumber();
        }

        return Long.parseLong(inString);
    }
}
