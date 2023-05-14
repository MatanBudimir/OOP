package hr.fer.oop.kolekcije.drugi;

import hr.fer.oop.kolekcije.prvi.Ladder;

public class Main {

    public static void main(String[] args) {
        Ladder ladder = new Ladder("Brian", "Mia", "Sophia", "John", "Charlotte", "Pierre", "Bruno");
        printDraw(LadderUtil.randomDraw(ladder));
        System.out.println();
        printDraw(LadderUtil.randomDraw(ladder));
        System.out.println();
        printDraw(LadderUtil.randomDraw(ladder));
    }

    private static void printDraw(Iterable<Pair<String>> randomDraw) {
        for(Pair<String> pair : randomDraw) {
            System.out.format("%s - %s%n", pair.getFirst(), pair.getSecond());
        }
    }
}
