package hr.fer.oop.pete.cetvrti;

public class Main {
    public static void main(String[] args) {
        Computer n = new Netbook("Ideapad S12", "Lenovo", "Windows", 50, 1.55);
        System.out.println(n);
        System.out.println(n.getComputerType());
        System.out.println(n.calculatePortabilityScore());
        Laptop l = (Laptop) n;
        System.out.println(l.calculatePortabilityScore());
    }
}
