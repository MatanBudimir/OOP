package druge;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

public class RandomAndArrays {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Please provide length");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int[] polje = new int[n];

        Random rand = new Random();
        rand.setSeed(LocalTime.now().getNano());

        for (int i = 0; i < polje.length; i++)
            polje[i] = rand.nextInt(101);

        int najmanji = 0;
        int najveci = 0;

        for (int i = 1; i < polje.length; i++) {
            if (polje[najmanji] > polje[i])
                najmanji = i;
            if (polje[najveci] < polje[i])
                najveci = i;
        }

        for (int i = polje.length - 1; i >= 0; i--)
            System.out.println(polje[i]);

        System.out.println(String.format("Najveci (index): %d (%d), najmanji (index): %d (%d)", polje[najveci], najveci, polje[najmanji], najmanji));
    }
}
