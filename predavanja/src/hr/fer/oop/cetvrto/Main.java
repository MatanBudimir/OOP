package hr.fer.oop.cetvrto;

public class Main {
    public static void main(String[] args) {
        Ucenik marko = new Ucenik("Marko", "Pavolovic", 1, "a");
        Ucenik ana = new Ucenik("Ana", "Anic", 1, "b");
        Ucenik markan = new Ucenik();
        System.out.println(markan);
        Knjiga k = new Knjiga("Otac Goriot", "Balzac", 10);
        System.out.println(k);
    }
}
