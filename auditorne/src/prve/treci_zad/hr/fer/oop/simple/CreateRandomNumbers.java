package prve.treci_zad.hr.fer.oop.simple;

import java.time.LocalTime;
import java.util.Random;

public class CreateRandomNumbers {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Program requires lower and upper bound");
            return;
        }

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        if (x >= y) {
            System.out.println("Invalid bounds");
            return;
        }

        Random rand = new Random();
        rand.setSeed(LocalTime.now().getNano());

        System.out.println(String.format("Two different random numbers in range [%d, %d] are %d and %d", x, y, rand.nextInt(x, y + 1), rand.nextInt(x, y + 1)));
    }
}
