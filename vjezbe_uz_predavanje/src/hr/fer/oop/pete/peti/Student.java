package hr.fer.oop.pete.peti;

import java.util.Arrays;

public class Student extends Person {
    private short academicYear;
    private int[] grades;
    public Student(int id, String name, short academicYear, int[] grades) {
        super(id, name);
        this.academicYear = academicYear;
        this.grades = grades;
    }

    public short getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(short academicYear) {
        this.academicYear = academicYear;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return String.format("%s, academicYear=%d, grades=%s", super.toString(), academicYear, convertGrades());
    }

    private String convertGrades() {
        StringBuilder sb = new StringBuilder();

        sb.append(grades[0]);

        for (int i = 1; i < grades.length; i++)
            sb.append(", ").append(grades[i]);

        return sb.toString();
    }
}
