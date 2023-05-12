package prve.drugi_zad.hr.fer.oop.util;

import java.util.Comparator;

public class GCD {
    public static int gcd(int x, int y) {
        int manji = Math.min(x, y);

        for (int i = manji; i > 0; i--)
            if (x % i == 0 && y % i == 0)
                return i;

        return 1;
    }
}
