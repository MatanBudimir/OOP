package hr.fer.oop.cetvrte;

import java.util.Objects;

public class Student extends Person {
    private String studentId;
    private short academicYear;

    public Student(String name, String surname, int age, String studentId, short academicYear) {
        super(name, surname, age);
        this.studentId = studentId;
        this.academicYear = academicYear;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public short getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(short academicYear) {
        this.academicYear = academicYear;
    }

    @Override
    public String toString() {
        return String.format("%s, Student ID - %s, Academic year - %hd", super.toString(), studentId, academicYear);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        if (student.studentId == null)
            return false;
        return student.studentId.equals(studentId);
    }
}