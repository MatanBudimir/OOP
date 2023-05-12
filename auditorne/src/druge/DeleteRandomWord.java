package druge;

import java.util.Scanner;

public class DeleteRandomWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Upisite recenicu: ");
        String recenica = scanner.nextLine();
        String[] rijeci = recenica.split(" ");

        int index = (int)(Math.random() * rijeci.length);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < rijeci.length; i++) {
            if (i != index) {
                builder.append(rijeci[i]);

                if (i + 1 != rijeci.length)
                    builder.append(' ');
            }
        }

        System.out.println(builder.toString());
    }
}
