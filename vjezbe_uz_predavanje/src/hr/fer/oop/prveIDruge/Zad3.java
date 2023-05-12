package hr.fer.oop.prveIDruge;

import java.util.Arrays;

public class Zad3 {
    public static void main(String[] args) {
        int[] brojevi = new int[7];

        for (int i = 0; i < 7; i++)
            brojevi[i] = (int) (Math.random() * 39);

        Arrays.sort(brojevi);

        for (int i = 0; i < 7; i++)
            System.out.println(brojevi[i]);
    }
}
