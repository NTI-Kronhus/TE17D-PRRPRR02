import java.util.ArrayList;
import java.util.Scanner;

public class hjej {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        String lowerWord = word.toLowerCase();


        for(Character c : lowerWord.toCharArray())
        {
            for(char c2 : lowerWord.toCharArray())
            {
                if(c.compareTo(c2) == 0)
                {
                    System.out.println(c);
                    System.out.println(c2);
                    System.out.println(c.compareTo(c2));
                    System.out.println("true");
                    return;
                }
            }
        }

        System.out.println("false");
        return;
    }
}
