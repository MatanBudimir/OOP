package hr.fer.oop.prveIDruge;

public class Zad1 {
    public static void main(String[] args) {
        int powerOf10 = 10;
        float sum = 0;
        for (int i = 0; i < 10e6; i++) {
            sum += 4 * (Math.pow(-1, i) / (2 * i + 1));

            if (i == powerOf10) {
                powerOf10 *= 10;
                System.out.printf("Pi = %.10f%n", sum);
            }
        }
    }
}
