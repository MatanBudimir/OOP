package hr.fer.oop.prveIDruge;

import java.util.Arrays;
import java.util.Random;

public class Izvlacenje {
    private int no;
    private int[] izvuceni;
    private int brIzvucenih;
    private boolean nacin = false;

    public Izvlacenje(int no, int brIzvucenih) {
        this.no = no;
        this.izvuceni = new int[brIzvucenih];
        this.brIzvucenih = brIzvucenih;
    }

    public Izvlacenje(int no, int brIzvucenih, boolean nacin) {
        this.no = no;
        this.izvuceni = new int[brIzvucenih];
        this.nacin = nacin;
    }

    public void simulacija() {
        int i = 0;
        while (brojIzvucenih() != brIzvucenih) {
            int izvucen = izvuci(nacin);
            if (!provjera(izvucen))
                continue;

            izvuceni[i] = izvucen;
            i++;
        }
    }

    private int izvuci(boolean nacin) {
        if (nacin) {
            Random rand = new Random();
            return rand.nextInt(1,no + 1);
        }
        return (int) (Math.random() * no);
    }

    private boolean provjera(int num) {
        return Arrays.stream(izvuceni).filter(n -> n == num).count() == 0;
    }

    private int brojIzvucenih() {
        return (int) Arrays.stream(izvuceni).filter(n -> n > 0).count();
    }
}
