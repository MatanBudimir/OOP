package hr.fer.oop.cetvrte;

import java.util.Arrays;
import java.util.Objects;

public class CompetitionEntry {
    private Teacher teacher;
    private Dessert dessert;
    private Student[] students;
    private int[] grades;

    public CompetitionEntry(Teacher teacher, Dessert dessert) {
        this.teacher = teacher;
        this.dessert = dessert;
        this.students = new Student[3];
        this.grades = new int[3];
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public Student[] getStudents() {
        return students;
    }

    public int[] getGrades() {
        return grades;
    }

    public boolean addRating(Student student, int rating) {
        boolean c = check(student);

        if (c) {
            int s = size();
            students[s] = student;
            grades[s] = rating;
        }

        return c;
    }

    private boolean check(Student student) {
        return Arrays.stream(students).filter(Objects::nonNull).noneMatch(s -> s.equals(student)) && Arrays.stream(students).filter(Objects::nonNull).count() < 3;
    }

    private int size() {
        return (int) Arrays.stream(students).filter(Objects::nonNull).count();
    }

    public double getRating() {
        if (size() == 0)
            return 0.0;
        double suma = 0.;
        for (int i = 0; i < size(); i++)
            suma += grades[i];

        return suma / size();
    }
}
