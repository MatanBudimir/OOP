package prve.drugi_zad.hr.fer.oop.util;

import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(String @NotNull [] args) {
        for (int i = 0; i < args.length; i += 2) {
            if (args[i].chars().allMatch(Character::isDigit) && args[i + 1].chars().allMatch(Character::isDigit)) {
                int x = Integer.parseInt(args[i]);
                int y = Integer.parseInt(args[i + 1]);

                int gcd = GCD.gcd(x, y);

                if (gcd == 1)
                    System.out.println(String.format("gcd(%d, %d) coprime!", x, y));
                else
                    System.out.println(String.format("gcd(%d, %d)", x, y));
            }
        }
    }
}
