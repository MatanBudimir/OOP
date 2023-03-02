package pete.prvi;

import javax.xml.crypto.dsig.SignatureMethod;
import java.util.Objects;
import java.util.Scanner;

public class Doodle {
    private static final String FORMAT = "|%-10s|%-10s|%n";
    private static final String EOL = "END";
    private SimpleArrayList names;
    private SimpleArrayList times;
    public Doodle() {
        this.names = new SimpleArrayList();
        this.times = new SimpleArrayList();
    }

    public void read() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Unesite podatke [Ime, Vrijeme]: ");
            String line = scanner.nextLine();
            if (line.equals(EOL))
                break;

            String[] words = line.split(" ");
            names.add(words[0]);
            times.add(words[1]);
        }
    }

    public void printTable() {
        System.out.println("|----------|----------|");
        for (int i = 0; i < names.size(); i++)
            System.out.printf((FORMAT) + "%n", names.get(i), times.get(i));

        System.out.println("|----------|----------|");
    }
}
