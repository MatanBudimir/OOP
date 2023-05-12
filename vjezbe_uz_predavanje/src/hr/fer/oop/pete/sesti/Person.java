package hr.fer.oop.pete.sesti;

public abstract class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("ID=%d, name=%s", id, name);
    }

    public abstract double getGrade();

    public final boolean isOutstanding() {
        return getGrade() > 4.5;
    }
}
