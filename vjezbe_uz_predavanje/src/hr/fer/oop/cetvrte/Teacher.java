package hr.fer.oop.cetvrte;

public class Teacher extends Person {
    private String email;
    private String subject;
    private double salary;

    public Teacher(String name, String surname, int age, String email, String subject, double salary) {
        super(name, surname, age);
        this.email = email;
        this.subject = subject;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%s, Email - %s, Subject - %s, Salary - %f", super.toString(), email, subject, salary);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        else if (obj == null)
            return false;
        else if (obj.getClass() != getClass())
            return false;

        Teacher teacher = (Teacher) obj;

        if (teacher.getEmail() == null)
            return false;

        return teacher.getEmail().equals(email);
    }

    public void increaseSalary(int percentage) {
        setSalary(getSalary() + getSalary() * (percentage / 100.));
    }

    public static void increaseSalary(int percentage, Teacher ...teachers) {
        for (Teacher teacher : teachers)
            teacher.increaseSalary(percentage);
    }
}
