package hr.fer.oop.cetvrte;

import java.util.Arrays;
import java.util.Objects;

public class UniMasterChef {
    private CompetitionEntry[] entries;
    private int no;

    public UniMasterChef(int no) {
        this.no = no;
        this.entries = new CompetitionEntry[no];
    }

    private int size() {
        return (int) Arrays.stream(entries).filter(Objects::nonNull).count();
    }

    public boolean addEntry(CompetitionEntry entry) {
        boolean c = check(entry.getTeacher());

        if (c)
            entries[size()] = entry;

        return c;
    }

    private boolean check(Teacher teacher) {
        return Arrays.stream(entries).filter(Objects::nonNull).noneMatch(entry -> entry.getTeacher().equals(teacher)) && size() < no;
    }

    public static Person[] getInvolvedPeople(CompetitionEntry entry) {
        int count = 1 + (int) Arrays.stream(entry.getStudents()).filter(Objects::nonNull).count();
        Person[] people = new Person[count];

        people[0] = entry.getTeacher();

        for (int i = 1; i < count; i++)
            people[i] = entry.getStudents()[i - 1];

        return people;
    }

    public Dessert getBestDessert() {
        if (size() == 0)
            return null;

        Dessert best = null;
        double rating = 0.;

        for (int i = 0; i < size(); i++)
            if (rating < entries[i].getRating()) {
                best = entries[i].getDessert();
                rating = entries[i].getRating();
            }

        return best;
    }
}
