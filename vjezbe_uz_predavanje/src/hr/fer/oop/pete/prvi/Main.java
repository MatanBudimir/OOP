package hr.fer.oop.pete.prvi;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Asus Zenbook", "ASUS", "Windows 11");
        Desktop desktop = new Desktop("ASUS Neki", "ASUS", "Windows 11", 45);
        Laptop laptop = new Laptop("Asus Zenbook 14'", "ASUS", "Windows 11", 4500, 1.3);

        System.out.println(computer);
        System.out.println(desktop);
        System.out.println(laptop);
    }
}
