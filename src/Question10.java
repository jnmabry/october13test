import java.util.Scanner;

/**
 * Created by lrterry on 10/13/16.
 */
public class Question10 {
    public static void main(String[] args) {
        System.out.println("Enter a character: ");

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next().substring(0, 1);

        System.out.print(s + " is" + (isVowel(s) ? " " : " not ") + "a vowel");
    }

    public static boolean isVowel(String s) {
//        if(s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u") || s.equals("y"))
        return false;
    }
}


