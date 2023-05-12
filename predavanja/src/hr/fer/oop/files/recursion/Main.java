package hr.fer.oop.files.recursion;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\Matan Budimir\\Documents\\OOPMI\\oop2023_MI_ver2_exercise1");
        Files.walkFileTree(path, new FileVisit());
    }
}
