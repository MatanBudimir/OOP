package hr.fer.oop.pete.drugi;

public class Main {
    public static void main(String[] args) {
        Desktop desktop = new Desktop("ASUS Neki", "ASUS", "Windows 11", 45);
        Laptop laptop = new Laptop("Asus Zenbook 14'", "ASUS", "Windows 11", 4500, 1.3);

        System.out.println(desktop);
        System.out.println(laptop);
    }
}
