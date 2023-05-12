package hr.fer.oop.pete.peti;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(1, "Matan Budimir");
        int[] grades = {1, 2, 3, 4, 5};
        Student student = new Student(2, "Roko Domovic", (short) 1, grades);
        Teacher teacher = new Teacher(3, "Lana Dmitrovic-Horvar", "Matematicka analiza 2", 4.5);

        System.out.println(person);
        System.out.println(student);
        System.out.println(teacher);
    }
}
