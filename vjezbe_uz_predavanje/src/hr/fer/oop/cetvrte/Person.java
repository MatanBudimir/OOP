package hr.fer.oop.cetvrte;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("Name - %s, Surname - %s, Age - %d", name, surname, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        else if (obj == null)
            return false;
        else if (obj.getClass() != getClass())
            return false;

        Person person = (Person) obj;

        if (person.getName() == null || person.getSurname() == null)
            return false;

        return person.getName().equals(name) && person.getSurname().equals(surname) && person.getAge() == age;
    }
}
