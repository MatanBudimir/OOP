package druge;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntConsumer;

public class Bioninfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite redoslijed: ");
        String redoslijed = scanner.next();

        prvi(redoslijed);
        drugi(redoslijed);
    }

    public static void prvi(String redoslijed) {
        String res = "";

        for (int i = redoslijed.length() - 1; i >= 0; i--)
            res += zamijeni(redoslijed.charAt(i));

        System.out.println(res);
    }

    public static void drugi(String redoslijed) {
        StringBuilder builder = new StringBuilder();

        for (int i = redoslijed.length() - 1; i >= 0; i--)
            builder.append(zamijeni(redoslijed.charAt(i)));

        System.out.println(builder);
    }



    public static char zamijeni(char slovo) {
        // A-T C-G
        return (slovo == 'A') ? 'T' : (slovo == 'T') ? 'A' : (slovo == 'C') ? 'G' : 'C';
    }
}
