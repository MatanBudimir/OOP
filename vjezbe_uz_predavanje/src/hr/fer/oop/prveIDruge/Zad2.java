package hr.fer.oop.prveIDruge;

public class Zad2 {
    public static void main(String[] args) {
        int prvihPet = (int) (Math.PI * 10e5);

        double suma = 0;
        int i = 1;
        while ((int) (suma * 10e4) != prvihPet) {
            suma += 1 / Math.pow(i, 2);
            i++;
        }

        System.out.println((suma * 2) + " " + i);
    }
}
