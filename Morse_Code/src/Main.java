import java.util.Scanner;
import Translate.Encrypt;

public class Main {.
    private static String phrase;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Encrypt encrypt = new Encrypt();

        System.out.println("Would you like to encrypt a sentence or decrypt it? (encrypt || decrypt)");
        String ask = sc.nextLine();

        ask = ask.toLowerCase();

        if (ask.equals("encrypt")) {
            System.out.println("Type a phrase");
            String phrase = sc.nextLine();

            encrypt.encrypt(phrase);
        }


    }
}
