package hr.fer.oop.utils;

public class GCD {
    /**
     * Funkcija racuna najveci zajednicki djeljitelj
     * @param x
     * @param y
     * @return int
     */
    public static int gcd(int x, int y) {
        int manji = Math.min(x, y);

        for (int i = manji; i > 0; i--)
            if (x % i == 0 && y % i == 0)
                return i;

        return 1;
    }
}
