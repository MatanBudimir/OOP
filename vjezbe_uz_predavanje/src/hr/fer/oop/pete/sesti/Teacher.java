package hr.fer.oop.pete.sesti;

public class Teacher extends Person {
    private String subject;
    private double teacherGrade;

    public Teacher(int id, String name, String subject, double teacherGrade) {
        super(id, name);
        this.subject = subject;
        this.teacherGrade = teacherGrade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getTeacherGrade() {
        return teacherGrade;
    }

    public void setTeacherGrade(double teacherGrade) {
        this.teacherGrade = teacherGrade;
    }

    @Override
    public double getGrade() {
        return teacherGrade;
    }

    @Override
    public String toString() {
        return String.format("%s, subject=%s, teacherGrade=%f", super.toString(), subject, teacherGrade);
    }
}
