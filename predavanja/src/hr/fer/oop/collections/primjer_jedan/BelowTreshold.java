package hr.fer.oop.collections.primjer_jedan;

import java.util.function.Predicate;

public class BelowTreshold implements Predicate<Number> {
    private double treshold;

    public BelowTreshold(double treshold) {
        this.treshold = treshold;
    }
    @Override
    public boolean test(Number number) {
        return number.intValue() < treshold;
    }
}
